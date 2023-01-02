/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_funcionario;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class empresa {
    
    String cnpj;
    funcionario [] empregados;
    
    public void setadiciona(funcionario f){
        for (int i = 0;i < empregados.length;i++){
            this.empregados[i] =f;
        }
    }
    
    public void mostraEmpregados (){
        for (int i = 0; i < this.empregados.length; i++) {
            System.out.println("Funcionário na posição: " + i);
            System.out.println(Arrays.toString(getretornaEmpregados()));
        }
    }
    
    public funcionario[] getretornaEmpregados (){
        return empregados;
    }
    
}
