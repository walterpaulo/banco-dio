package br.com.dio.model;

public interface IConta {
        public void sacar(double valor);
        public void depositar(double valor);
        public void transfeir(double valor, Conta tipoConta);
        public void imprimrExtrato();
}
