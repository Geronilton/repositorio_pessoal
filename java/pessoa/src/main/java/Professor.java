
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20221198060008
 */
public class Professor extends Funcionario{
    String departamento;
    
    public Professor (String nome,String cpf,String endereco,String codigo,double salario,String departamento){
        super(nome,cpf,endereco,codigo,salario);
        this.departamento = departamento;    
    }
     
     public String getdepartamento (){
        return departamento;
    }
    
     

    
}
