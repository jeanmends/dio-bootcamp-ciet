package org.example.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
    /*
    Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
    */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso kg");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso ideal");
        }else if(imc >= 25.0 & imc <= 29.9){
            System.out.println("Levemente acima do peso");
        }else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade Grau I");
        }else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        }else{
            System.out.println("Obesidade III (Mórbida)");
        }


    }
}
