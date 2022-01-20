package br.com.dio.model;

public abstract class Conta implements IConta{
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(int agencia, int numero) {
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

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transfeir(double valor, Conta tipoConta) {

    }
}
