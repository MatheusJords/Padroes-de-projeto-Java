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
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    
    private SingletonEager(){
        super();
    }
    
    public static SingletonEager getInstancia(){
        return instancia;
    }
}
