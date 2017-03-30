
package alp_exercicios;

import java.util.Scanner;


public class Exercicio2_ALP {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double num1, num2;
        
        System.out.println("Digite primeiro número (base): ");
        num1 = leitor.nextDouble();
        
        System.out.println("Digite segundo número (expoente): ");
        num2 = leitor.nextDouble();
        
        Math.pow(num2, num2);
        System.out.println("Resultado da base:" +num1+ " e expoente:"+num2);
        
        
        
    }
    
}
