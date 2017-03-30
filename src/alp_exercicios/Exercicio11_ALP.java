/*
Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a
mensagem "Numero negativo".
*/
package alp_exercicios;

import java.util.Scanner;

public class Exercicio11_ALP {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        float numero;
           
        System.out.print("Digite um numero: " );
        numero = console.nextFloat();
        
        if( (numero <= -1.0)) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Esse numero não é negativo, sorry");
        }
        
        
        
    }
    
}
