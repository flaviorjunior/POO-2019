package com.company;

class ContaCorrente extends Conta {

    public ContaCorrente(int id, Cliente cliente) {

        super(id, cliente, 0);
    }

    @Override
    String getTipo(){

        return "CC";
    }

    @Override
    void update() {

        this.saldo -= 20;
    }


}
