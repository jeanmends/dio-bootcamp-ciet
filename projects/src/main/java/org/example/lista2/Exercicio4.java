package org.example.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor base: ");
        int numeroBase = scanner.nextInt();

        while(true){
            System.out.println("Digite o valor para a divisão: ");
            int valor = scanner.nextInt();

            if(valor >= numeroBase){
                if (!(valor % numeroBase == 0)) {
                    System.out.println("Programa encerrado!");
                    break;
                }else{
                    System.out.println("Resultado: " + (valor % numeroBase));
                }
            }else{
                System.out.printf("Valor %s é menor que o valor base %s \n", valor, numeroBase);
            }
        }
    }
}
