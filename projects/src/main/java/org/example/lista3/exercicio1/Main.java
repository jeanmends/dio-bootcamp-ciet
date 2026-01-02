package org.example.lista3.exercicio1;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta(400);
        System.out.println(conta.valorCheckEspecial(conta.getValor()));
        conta.addValor(100);
        conta.addValor(200);
        conta.checkValorCheckEspecial();
    }
}
