/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por
ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, calcular e imprimir o total a receber no final do mês.
*/
package alp_exercicios;

import java.util.Scanner;


public class Exercicio10_ALP {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
       
        String nome = console.nextLine();
        System.out.println(nome);
        
        
        double salario, vendas, comissao;
        
        System.out.println("Digite seu salario: ");
        salario = console.nextDouble();
        
        System.out.println("Digite total das vendas: ");
        vendas = console.nextDouble();
        
        comissao = vendas * 15.0;
        System.out.println("O valor das suas vendas final do mês foi: "+comissao+" REAIS");
        
        
        
 
        
    }
    
}
