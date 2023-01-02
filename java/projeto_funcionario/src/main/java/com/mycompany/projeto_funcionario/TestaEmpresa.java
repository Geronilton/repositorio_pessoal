/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_funcionario;

/**
 *
 * @author User
 */
public class TestaEmpresa {
    public static void main(String[] args) {
        
        empresa empresa = new empresa ();
        empresa.empregados = new funcionario [10];
        
        funcionario f1 = new funcionario();
        f1.setSalario(1000);
        empresa.setadiciona(f1);
        funcionario f2 = new funcionario();
        f2.setSalario(1700);
        empresa.setadiciona(f2);
        
        for (int i = 0; i < 5; i++) {
            funcionario f = new funcionario();
            f.setSalario(1000 + i * 100);
            empresa.setadiciona(f);
        }
        
        empresa.mostraEmpregados();
        
    }
}
