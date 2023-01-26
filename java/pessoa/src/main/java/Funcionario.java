/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20221198060008
 */
public class Funcionario extends Pessoa {
    String codigo;
    double salario;
    
    public Funcionario (String nome,String cpf,String endereco,String codigo,double salario){
        super(nome,cpf,endereco);
        this.codigo = codigo;
        this.salario = salario;
    }
    
    public void setsalario (){
        this.salario=salario;
    }
    
     public double getsalario (){
       return salario;
    }
    
    public void setcalculasalario (double novosalario){
        double ns = (novosalario/100)*salario;
        this.salario=ns +salario;
    }
    
     public double getnovosalario (){
         return salario;
     }
     
     
     public String getcodigo (){
        return codigo;
    }
    
     
}
