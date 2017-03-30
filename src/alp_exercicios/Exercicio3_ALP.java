
package alp_exercicios;

import java.util.Scanner;


public class Exercicio3_ALP {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int num1, num2, soma;
        
        System.out.println("Digite primeiro número: ");
        num1 = leitor.nextInt();
        
        System.out.println("Digite segundo número: ");
        num2 = leitor.nextInt();
        
        soma = num1 * num1;
        soma = num2 * num2;
            
        System.out.println("Resultado: " +num1+ ";" +num2);
        
        
    }
}
