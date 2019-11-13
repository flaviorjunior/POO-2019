package com.company;

public class Cliente {
    protected String apelido;
    protected String nome;
    protected double valorDivida;

    public Cliente(String apelido, String nome) {
        this.apelido = apelido;
        this.nome = nome;
        this.valorDivida = 0;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return this.apelido + " : " + this.nome + " : " + this.valorDivida;
    }
}
