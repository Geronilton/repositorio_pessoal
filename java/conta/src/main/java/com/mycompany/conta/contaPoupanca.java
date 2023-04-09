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
public class contaPoupanca extends conta{
    
    
     public contaPoupanca(double saldo){
        super(saldo);
    }
    
    public void atualiza (double taxa){
                this.saldo += this.saldo * taxa * 3;
    }
    
    
}
