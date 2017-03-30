/*
Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas
trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o
número e o salário do funcionário.
*/
package alp_exercicios;

import java.util.Scanner;

public class Exercicio9_ALP {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
               double Cadastro ,Horas, Valor, Salario;
       
        System.out.println("Digite sua matrícula: ");
        Cadastro = console.nextDouble();
        
        System.out.println("Digite suas horas trabalhadas: ");
        Horas = console.nextDouble();
        
        System.out.println("Digite o valor que recebe por horas: ");
        Valor = console.nextDouble();
       
        Salario = Horas * Valor;
        
        System.out.println("Matricula do coloborador:"+Cadastro+" Valor que recebera: "+Salario+ " Reais");
        
    }
    
}
