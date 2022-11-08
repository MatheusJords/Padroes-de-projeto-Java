/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalinnovation.gof.controller;

import com.digitalinnovation.gof.model.Cliente;
import com.digitalinnovation.gof.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author matheus.azevedo
 */
@RestController
@RequestMapping("clientes")
public class ClienteRestController {
    
    @Autowired
    ClienteService clienteService;
    
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Cliente>buscarPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }
    
    @PostMapping
    public ResponseEntity<Cliente>inserir(@RequestBody Cliente cliente){
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Cliente>atualizar(@PathVariable("id") Long id,@RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id){
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
