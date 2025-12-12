package org.example.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
        //fórmula: área=base X altura

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("Resultado: "+ area);


    }
}
