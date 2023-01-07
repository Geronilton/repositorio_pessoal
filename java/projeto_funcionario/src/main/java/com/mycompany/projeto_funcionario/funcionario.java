/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_funcionario;

/**
 *
 * @author User
 */
public class funcionario {
    private String nome;
    String departamento;
    private double salario;
    String dataEntrada;
    String rg;

    
public funcionario (){

}

public funcionario (String nome){
    this.nome=nome;
}
    public void  mostra(){
        System.out.println("Nome" + this.nome);
        System.out.println("Salario" + this.salario);
        System.out.println("Departamento" + this.departamento);
        System.out.println("Data de Entrada" + this.dataEntrada);
        System.out.println("RG" + this.rg);
    }
      
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getdepartamento() {
        return nome;
    }


    public void setdepartamento(String nome) {
        this.nome = nome;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getcalculaganhoanual (){
        return salario*12;
    }
    public void setrecebeaumento (double aumento ){
        this.salario = aumento;
    }
    
    public double getrecebeaumento (){
        return salario;
    }
    
}
