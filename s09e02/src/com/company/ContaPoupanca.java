package com.company;

class ContaPoupanca extends Conta {

    public ContaPoupanca(int id, Cliente cliente) {
        super
                (id, cliente, 0);
    }

    @Override
    String getTipo(){

        return "CP";
    }

    @Override
    void update() {

        this.saldo = this.saldo * 0.1;
    }


}
