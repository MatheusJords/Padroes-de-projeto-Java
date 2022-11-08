/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistema1.crm;

/**
 *
 * @author matheus.azevedo
 */
public class CrmService {
    private CrmService(){
        super();
    }
    
    public static void gravarCliente(String nome,String cep,String cidade,String estado){
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
