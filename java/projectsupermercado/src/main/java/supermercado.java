
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
public class supermercado {

    /**
     *
     * @param args
     */
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        produto produto1 = new produto();
        
        System.out.println("Digite a descrição do produto: ");
        String descricao = sc.nextLine();
        produto1.descricao = descricao;
        
        int op=0;
        while (op !=6){
        
        System.out.println("1-Vender; 2-Comprar; 3-Consultar preço; 4-Consultar Quantidade; 5-Alterar Preço; 6-Sair");
        op = sc.nextInt();
        
        switch (op){
            
            case 1:{
                produto1.getvender();
                System.out.println("Estoque atual; " + produto1.getestoqueatual());
                break;
            }
            
            case 2: {
                produto1.getcomprar();
                System.out.println("Estoque atual; " + produto1.getestoqueatual());
                break;
            }
            
            case 3: {
                 System.out.println("Preco do produto; " + produto1.getconsultarpreco());
                 break;
            }
            
            case 4:{
                System.out.println("Quantidade no estoque; " + produto1.getestoqueatual());  
                break;
            }
            
            case 5: {
                System.out.println("Novo valor do produto; ");
                double preco = sc.nextDouble();
                produto1.setalterapreco(preco);
                System.out.println("Novo valor do produto; " + produto1.getprecoalterado());
                break;
            }
            
            case 6: {
                System.out.println("Descrição do produto; " + produto1.getdescricao() +"\n valor do produto " + produto1.getconsultarpreco());
                
            }
    
    }
        
        
    }
}
}


