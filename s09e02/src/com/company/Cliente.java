package com.company;

import java.util.ArrayList;

public class Cliente {
    protected String id;
    protected ArrayList <Conta> contas = new ArrayList();



    public Cliente(String id) {
        this.id = id;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public String getId() {
        return id;
    }

}

