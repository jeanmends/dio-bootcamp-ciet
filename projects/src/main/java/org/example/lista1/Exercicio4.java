package org.example.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro nome: ");
        String nome1 = scanner.next();
        System.out.println("Digite a primeira idade: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite o segundo nome: ");
        String nome2 = scanner.next();
        System.out.println("Digite a segunda idade: ");
        int idade2 = scanner.nextInt();
        int resultado;
        if (idade1 > idade2){
            resultado = idade1 - idade2;
            System.out.printf("A diferença de idade entre %s e %s, é:  %s", nome1, nome2, resultado );
        }else if(idade2 > idade1){
            resultado = idade2 - idade1;
            System.out.printf("A diferença de idade entre %s e %s, é:  %s", nome1, nome2, resultado );
        }else{
            System.out.println("Mesma idade!");
        }

    }
}
