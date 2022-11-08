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
public class SingletonLazyHolder {
    private static class InstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    private SingletonLazyHolder(){
        super();
    }
    
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
