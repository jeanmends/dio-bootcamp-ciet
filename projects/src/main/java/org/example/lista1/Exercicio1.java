package org.example.lista1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio1 {
    //Escreva um código que receba o nome e o ano de nascimento de alguém e imprima
    //na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();

        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite seu ano de nascimento: ");
        int year =  scanner.nextInt();


        int result = calendar.get(Calendar.YEAR) - year;
        System.out.println("Olá "+name+ " você tem " +result+ " anos");
    }

}
