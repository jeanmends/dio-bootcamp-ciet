package org.example.lista2;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para tabuada do 1 x 10: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%s x %s = %s \n", numero, i, (numero * i));
        }
    }
}
