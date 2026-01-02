package org.example.lista3.exercicio1;

public class Conta {
    private double valor;
    private double saldo;
    private double chequeEspecial;

    public Conta(){}
    public Conta(double valor){
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    //coment
}
