
package alp_exercicios;

import java.util.Scanner;


public class Exercicio5_ALP {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
                
        int l,area;
        
        System.out.println("Digite um valor para o quadrado: ");
        
        l = ler.nextInt();
        
        area = l * l;
        
        System.out.println("A area de um quadrado é: "+ area);
    }
}
