/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20221198060008
 */
public class Alunos  extends Pessoa {
    String matricula;
    
    public Alunos (String nome,String cpf,String endereco,String matricula){
        super(nome,cpf,endereco);
        this.matricula=matricula;
    }
   
}
