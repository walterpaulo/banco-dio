package br.com.dio.main;

import br.com.dio.model.Conta;
import br.com.dio.model.ContaCorrente;
import br.com.dio.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cp.imprimrExtrato();
        cc.imprimrExtrato();
    }
}
