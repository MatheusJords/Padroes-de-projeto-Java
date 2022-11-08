/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalinnovation.gof.service.impl;

import com.digitalinnovation.gof.model.Cliente;
import com.digitalinnovation.gof.model.ClienteRepository;
import com.digitalinnovation.gof.model.Endereco;
import com.digitalinnovation.gof.model.EnderecoRepository;
import com.digitalinnovation.gof.service.ClienteService;
import com.digitalinnovation.gof.service.ViaCepService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author matheus.azevedo
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    @Autowired
    private ViaCepService viaCepService;
    
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if(clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
    
    private void salvarClienteComCep(Cliente cliente){
        //Verificar se o Endereço do cliente ja existe pelo CEP
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
    
}
