/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20221198060008
 */
public class Pessoa {
    String nome;
    String cpf;
    String endereco;
    
    public Pessoa (String nome,String cpf,String endereco){
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
    }
    
    public void setnome ( String nome){
        this.nome= nome;
    }
        public String getnome (){
        return nome;
    }
    
    public void setcpf ( String cpf){
        this.cpf=cpf;
    }
        
   
    public String getcpf (){
        return cpf;
    }
    
    
     public void setendereco ( String endereco){
        this.endereco= endereco;
    }
    
    public String getendereco (){
        return endereco;
    }
   
    
}
