/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20221198060008
 */
public class produto {

   
    String descricao;
    int estoque = 10;
    double preco;
    
    public void setdescriproduto(){
        this.descricao = descricao;
    }
    
    public int getvender (){
        estoque= estoque -1;
        return estoque;
    }
    
    public int getcomprar (){
        estoque = estoque + 1;
        return estoque;
    }
    
    public double getconsultarpreco(){
        return preco;
    }
    
    public int getestoqueatual (){
        return estoque;
    }
    
    
    public void setalterapreco (double preco){
        this.preco = preco;
    }
    
    public double getprecoalterado(){
        return preco;
    }
    
    public String getdescricao (){
        return descricao;
    }
}
