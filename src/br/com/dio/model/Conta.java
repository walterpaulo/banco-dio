package br.com.dio.model;

public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 1;

    private int agencia;
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.agencia = AGENCIA_PADRAO;
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
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transfeir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInfosComun() {
        System.out.print(String.format("Agência: %d", this.getAgencia())+"\n");
        System.out.print(String.format("Número: %d", this.getNumero())+"\n");
        System.out.print(String.format("Saldo R$ %.2f", this.getSaldo())+"\n");
    }
}
