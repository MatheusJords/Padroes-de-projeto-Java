/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistema2.cep;

/**
 *
 * @author matheus.azevedo
 */
public class CepApi {
    private static CepApi instancia = new CepApi();
    
    private CepApi(){
        super();
    }
    
    public static CepApi getInstancia(){
        return instancia;
    }
    
    public String recuperaCidade(String cep){
        return "Rio de Janeiro";
    }
    
    public String recuperaEstado(String cep){
        return "RJ";
    }
}
