package org.example.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número inicial: ");
        int inicial = scanner.nextInt();
        System.out.println("Digite o número final: ");
        int numeroFinal = scanner.nextInt();

        System.out.println("Par ou impar: ");
        String parOuImpar = scanner.next();

        if(parOuImpar.equalsIgnoreCase("par")){
            for(int i = numeroFinal; i >= inicial; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }else{
            for(int i = numeroFinal; i >= inicial; i--) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }



    }
}

