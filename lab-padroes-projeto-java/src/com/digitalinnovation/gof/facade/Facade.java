/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

/**
 *
 * @author matheus.azevedo
 */
public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperaCidade(cep);
        String estado = CepApi.getInstancia().recuperaEstado(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
