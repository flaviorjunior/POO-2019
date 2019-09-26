package com.company;

import java.util.ArrayList;

public class Topic {
    private ArrayList<Cliente> cadeiras;
    private int capacidade;
    private int pref;


    public Topic(int capacidade, int pref) {
        cadeiras = new ArrayList<Cliente>();
        for (int i = 0; i < capacidade; i++) {
            cadeiras.add(null);
            this.capacidade = capacidade;
            this.pref = pref;
        }
    }

    public ArrayList<Cliente> getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(ArrayList<Cliente> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPref() {
        return pref;
    }

    public void setPref(int pref) {
        this.pref = pref;
    }

    public boolean inserir(String nome, int idade) {
        if (idade >= 60) {
            for (int i = 0; i < pref; i++) {
                if (cadeiras.get(i) == null) {
                    this.cadeiras.set(i, new Cliente(nome, idade));
                    return true;
                }
            }
            for (int i = pref; i < cadeiras.size(); i++) {
                if (cadeiras.get(i) == null) {
                    this.cadeiras.set(i, new Cliente(nome, idade));
                    return true;
                }
            }
        }
        else{
                for (int i = pref; i < cadeiras.size(); i++) {
                    if (cadeiras.get(i) == null) {
                        this.cadeiras.set(i, new Cliente(nome, idade));
                        return true;

                    }
                }
                for (int i = 0; i < pref; i++) {
                    if (cadeiras.get(i) == null) {
                        this.cadeiras.set(i, new Cliente(nome, idade));
                        return true;
                    }
                }
                System.out.println("Topic lotada ou passageiro já está nela");
        }
        return false;
    }

    public void remover (String nome){
        for (Cliente cli : cadeiras){
            if(cli.getNome() == nome){
                cadeiras.remove(cli);
            }
        }
    }


    public String toString () {
        String out = "[";
        for (int i = 0; i < cadeiras.size(); i++) {
            if (i < pref)
                out += " @";
            else
                out += " =";

            if (cadeiras.get(i) != null)
                out += cadeiras.get(i);

        }
        out += "]";
        return out;
    }



}
