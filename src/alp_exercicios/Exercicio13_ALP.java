/*
Fazer um algoritmo que leia três números e imprime o maior deles
*/
package alp_exercicios;

import java.util.Scanner;


public class Exercicio13_ALP {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
          int[] vet = new int[3];

        int a,num=0;
        for (a=0;a<vet.length;a++){
            System.out.print ("Digite três números :");
            vet[a] =console.nextInt();

                if (num<vet[a]){
                    num=vet[a];
                }
        }
        System.out.println("o maior numero é :"+num);

    }

}
