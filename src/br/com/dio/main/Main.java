package br.com.dio.main;

import br.com.dio.model.Conta;
import br.com.dio.model.ContaCorrente;
import br.com.dio.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        cc.imprimrExtrato();
        Conta cp = new ContaPoupanca();
        cc.transfeir(50, cp);
        cp.imprimrExtrato();
        cc.imprimrExtrato();
    }
}
