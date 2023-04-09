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
public class contaCorrente extends conta {
    
    public contaCorrente(double saldo){
        super(saldo);
    }
    
    public void atualiza (double taxa){
                this.saldo += this.saldo * taxa * 2;
    }
    
     public void deposita (double valor){
        this.saldo += valor - 0.10;
    }
    
}
