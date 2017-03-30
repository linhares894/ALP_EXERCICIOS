/*
Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do
triângulo. Para esse caso, considere que hipotenusa = √A . Dica: nesse programa, você deve 2 + B
2
usar a função matemática Math.sqrt() . Por exemplo, a raiz de 121 ficaria Math.sqrt(121) .

*/
package alp_exercicios;

import java.util.Scanner;


public class Exercicio7_ALP {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
                
        double a , b ,hipo;
        
        System.out.println("Digite lado A do triângulo retângulo: ");
        a = console.nextDouble();
        
        System.out.println("Digite lado B do triângulo retângulo: ");
        b = console.nextDouble();
        
        hipo = Math.pow(a, 2)+ Math.pow(b, 2);
        hipo = Math.sqrt(hipo);
        System.out.println("O resultado da hipotenusa do triângulo é: "+ hipo);
        
        
    }
    
}
