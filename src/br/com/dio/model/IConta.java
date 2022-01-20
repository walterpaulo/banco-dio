package br.com.dio.service;

import br.com.dio.model.Banco;

public interface IBanco {
    public void sacar(double valor);
    public void depositar(double valor);
    public void transfeir(double valor, Banco tipoConta);
}
