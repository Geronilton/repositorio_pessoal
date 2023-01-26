
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
public class metodoMain {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("***Cadastro Professor***\n");
      
        System.out.println("Digite o nome do Professor:");
        String nome= sc.nextLine();
        
        System.out.println("Digite o cpf:");
        String cpf= sc.nextLine();
        
        System.out.println("Digite o endereço:");
        String endereco= sc.nextLine();
        
        System.out.println("Digite o Codigo:");
        String codigo=sc.nextLine();
        
        System.out.println("Digite o Salario:");
        double salario= sc.nextDouble();
        
        System.out.println("Digite o Departamento:");
        String departamento= sc.nextLine();
        
        Professor pro = new Professor(nome,cpf,endereco,codigo,salario,departamento);
     
        System.out.println("\n Nome:" + pro.getnome());
        System.out.println("Cpf:" + pro.getcpf());
        System.out.println("endereço:" + pro.getendereco());
        System.out.println("Codigo:" + pro.getcodigo());
        System.out.println("Departamento:" + pro.getdepartamento());
        System.out.println("Salario:" + pro.getsalario());
        
        int op=0;
        while(op != 2){ 
        System.out.println("Digite \n 1-percentual de salario:");
        op = sc.nextInt();
        
        switch (op){
            case 1:{
                System.out.println("Digite um Percentual de Salario:");
                double novosalario = sc.nextDouble();
                pro.setcalculasalario(novosalario);
                System.out.println("Novo salario:" + pro.getnovosalario());
                break;
            }
            case 2:{
                System.out.println("\n Nome:" + pro.getnome());
                System.out.println("Cpf:" + pro.getcpf());
                System.out.println("endereço:" + pro.getendereco());
                System.out.println("Codigo:" + pro.getcodigo());
                System.out.println("Departamento:" + pro.getdepartamento());
                System.out.println("Salario:" + pro.getnovosalario());

                
            }
        }
        
        
        }
    }
}
