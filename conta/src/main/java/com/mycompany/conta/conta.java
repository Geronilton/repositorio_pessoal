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
public class conta {
     double saldo;
    
    public conta (double saldo){   
        this.saldo= saldo;
    }
     
    public void deposita (double valor){
        this.saldo += valor;
    }
    
    public void saca (double valor){
        this.saldo -= valor;
    }
    
    public double getsaldo (){
        return this.saldo;
    }
    
    public void atualiza (double taxa){
        this.saldo += this.saldo * taxa;
    }
    
    
}
