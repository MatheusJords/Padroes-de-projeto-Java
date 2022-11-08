/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalinnovation.gof.singleton;

/**
 *
 * @author matheus.azevedo
 */
public class SingletonLazy {
    private static SingletonLazy instancia;
    
    private SingletonLazy(){
        super();
    }
    
    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        
        return instancia;
    }
}
