/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_funcionario;

/**
 *
 * @author User
 */
public class Projeto_funcionario {

    public static void main(String[] args) {
        funcionario f1 = new funcionario();

        f1.setNome("hugo");
        f1.setSalario(100);
        f1.setrecebeaumento(50);
    

    System.out.println("salario atual:" + f1.getSalario());
    System.out.println("ganho anual:" + f1.getcalculaganhoanual());
    
        funcionario f2 = new funcionario ();
        
        f2.setNome("hugo");
        f2.setSalario(100);
        
        if (f1 == f2){
            System.out.println(" Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }
}
