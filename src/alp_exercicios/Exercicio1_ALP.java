
package alp_exercicios;

import java.util.Scanner;

public class Exercicio1_ALP {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double num1, num2, resultado;
        
        System.out.println("Digite primeiro número: ");
        num1 = leitor.nextDouble();
        
        System.out.println("Digite segundo número: ");
        num2 = leitor.nextDouble();
        
        resultado = num1 * num2;
        
        System.out.println("Resultado: "+resultado);
        
 
    }
    
}
