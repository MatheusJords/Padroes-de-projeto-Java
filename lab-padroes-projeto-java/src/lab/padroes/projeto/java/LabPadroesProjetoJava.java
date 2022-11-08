/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.padroes.projeto.java;

import com.digitalinnovation.gof.facade.Facade;
import com.digitalinnovation.gof.singleton.SingletonEager;
import com.digitalinnovation.gof.singleton.SingletonLazy;
import com.digitalinnovation.gof.singleton.SingletonLazyHolder;
import com.digitalinnovation.gof.strategy.Comportamento;
import com.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import com.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import com.digitalinnovation.gof.strategy.ComportamentoNormal;
import com.digitalinnovation.gof.strategy.Robo;

/**
 *
 * @author matheus.azevedo
 */
public class LabPadroesProjetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Singleton 
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        
        /*
        
        //Strategy 
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        
        Robo robo = new Robo();
        
        robo.setComportamento(normal);
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        
        robo.setComportamento(defensivo);
        robo.mover();
        */
        
        /*
        Facade facade = new Facade();
        facade.migrarCliente("Matheus Jordan", "22324-987");
        */
    }
    
}
