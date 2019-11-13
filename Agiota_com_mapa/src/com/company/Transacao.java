package com.company;

public class Transacao {
    protected String clienteId;
    protected double valor;
    protected int nextId;

    public Transacao(int nextId, String clienteId, double valor) {
        this.clienteId = clienteId;
        this.valor = valor;
        this.nextId = nextId;


    }

    public String getClienteId() {
        return clienteId;
    }

    public String toString(){
        return "id" + ":" +  this.nextId + " [" + this.clienteId + " " + valor + " ]";

    }

}
