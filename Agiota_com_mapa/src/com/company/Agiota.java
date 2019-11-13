package com.company;


public class Agiota {
    protected double saldo;
    protected Repositorio <Cliente> clientes;
    protected Repositorio <Transacao> transacoes;
    protected static int nextId;

    public Agiota(double saldo) {
        this.saldo = saldo;
        nextId = 0;
        this.clientes = new Repositorio<Cliente>("Cliente");
        this.transacoes = new Repositorio<Transacao>("Transacao");
        System.out.println("Agiota iniciado");
    }

    public Repositorio<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Repositorio<Cliente> clientes) {
        this.clientes = clientes;
    }
}
