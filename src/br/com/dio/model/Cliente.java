package br.com.dio.model;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
