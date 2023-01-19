/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20221198060008
 */
public class Coordenador extends Funcionario {
    String curso;
    
    public Coordenador (String nome,String cpf,String endereco,String codigo,double salario,String curso){
        super(nome,cpf,endereco,codigo,salario);
        this.curso= curso;
    }
}
