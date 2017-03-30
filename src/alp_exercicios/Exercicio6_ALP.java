/*
 Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B.

*/
package alp_exercicios;

import java.util.Scanner;


public class Exercicio6_ALP {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
                
        double a , b, c,area,perimetro;
        
        System.out.println("Digite 3 números decimais: ");
        a = console.nextFloat();
        b = console.nextFloat();
        c = console.nextFloat();
        
        // a) a área do triângulo retângulo que tem A por base e C por altura.
        area = a * c;
        System.out.println("área do triângulo retângulo: "+area);
        
        // b) a área do círculo de raio C. (π = 3.14159)
        
        area = Math.pow(c,2)*3.14159;
        System.out.println("área do círculo: "+ area);
        
        //c) a área do trapézio que tem A e B por bases e C por altura.
         area = (a + b)*c/2;
         System.out.println("área do trapézio: "+area);
         
         //d) a área do quadrado que tem lado B.
         area = b * b;
         System.out.println("área do quadrado que tem lado B é: "+area);
         
         //e) a área do retângulo que tem lados A e B.
         area = a * b;
         System.out.println("área do retângulo é: "+ area);
         
         //f) o perímetro do retângulo que tem lados A e B.
         perimetro = a + a + b +b;
         System.out.println("perímetro do retângulo é: "+perimetro);
    }
    
}
