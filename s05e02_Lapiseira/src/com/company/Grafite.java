package com.company;

public class Grafite {
    private double ponta;
    private int tamanhoGrafite=0;

    public Grafite(double ponta, int tamanhoGrafite) {
        super();
        this.ponta = ponta;
        this.tamanhoGrafite = tamanhoGrafite;
    }

    public double getPonta() {
        return ponta;
    }

    public int getTamanhoGrafite() {
        return tamanhoGrafite;
    }

    public void setTamanhoGrafite(int tamanhoGrafite) {
        this.tamanhoGrafite = tamanhoGrafite;
    }
}