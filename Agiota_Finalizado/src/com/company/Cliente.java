package com.company;

public class Cliente {
    private String nome;
    private double saldo;
    Repositorio<Transacao> transacoes;

    public Cliente(String nome) {
        super();
        this.nome = nome;
        this.saldo = 0;
        transacoes = new Repositorio<>("Transacao");
    }

    public String toString(){
        return "[" + getNome() + ":" + this.getSaldo() + "]";
    }

    public double getSaldo() {
        return saldo;
    }
    public void receber(double saldo){
        this.saldo += saldo;
    }
    public void pagar(double valor){
        this.saldo -= valor;
    }


    public String getNome() {
        return this.nome;
    }


}