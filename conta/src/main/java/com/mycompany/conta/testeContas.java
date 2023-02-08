/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conta;

/**
 *
 * @author 20221198060008
 */
public class testeContas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        conta c = new conta (100);
        contaCorrente cc = new contaCorrente(100);
        contaPoupanca cp = new contaPoupanca(100);
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        
        System.out.println(c.getsaldo());
        System.out.println(cc.getsaldo());
        System.out.println(cp.getsaldo());
        
    }
    
}
