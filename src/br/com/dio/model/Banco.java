package br.com.dio.model;

public class Banco {
    private int agencia;
    private int numero;
    private double saldo;

    public Banco(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
