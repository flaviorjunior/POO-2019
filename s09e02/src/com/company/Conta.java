package com.company;

abstract class Conta {
    protected int id;
    protected Cliente cliente;
    protected double saldo;

    abstract String getTipo();
    abstract void update();

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int id, Cliente cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    public String toString(){
        return this.id + ":" + this.cliente.id + ":" + this.saldo + ":" + this.getTipo();
    }
}
