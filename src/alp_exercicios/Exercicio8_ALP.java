/*
Fazer um algoritmo que leia quatro números e imprime a média aritmética​ dos quatro números
*/
package alp_exercicios;

import java.util.Scanner;

public class Exercicio8_ALP {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
                 
        double number1 ,number2 , number3 , number4, medari;
        
        System.out.println("Digite primeiro numero: ");
        number1 = console.nextDouble();
        
        System.out.println("Digite segundo numero: ");
        number2 = console.nextDouble();
        
        System.out.println("Digite terceiro numero: ");
        number3 = console.nextDouble();
        
        System.out.println("Digite quarto numero: ");
        number4 = console.nextDouble();
        
        medari = (number1 + number2 + number3 + number4)/4;
        System.out.println("média aritmética​ dos quatro números é: "+ medari);
    }
    
}
