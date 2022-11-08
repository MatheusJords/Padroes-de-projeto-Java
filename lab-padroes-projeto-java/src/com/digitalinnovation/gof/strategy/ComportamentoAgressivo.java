/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalinnovation.gof.strategy;

/**
 *
 * @author matheus.azevedo
 */
public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente");
    }
    
}
