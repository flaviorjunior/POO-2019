package com.company;

public class Lapiseira {
    private String marca;
    private Grafite grafite;

    public Lapiseira(String marca, Grafite grafite) {
        super();
        this.marca = marca;
        this.grafite = grafite;
    }

    /*public Lapiseira() {
        super();
    }*/

    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + " | Ponta: " + this.grafite.getPonta() + " | Quantidade de grafite: " + this.grafite.getTamanhoGrafite();
    }

    public void escrever(int qtd) {
        if (grafite.getTamanhoGrafite() == 0 || grafite.getTamanhoGrafite() < qtd) {
            System.out.println("Você não tem grafite suficiente");
        } else {
            this.grafite.setTamanhoGrafite(this.grafite.getTamanhoGrafite()-qtd);
            System.out.println("Escrevendo...");
        }
    }

    public void colocarGrafite(Grafite grafite) {
        this.grafite.setTamanhoGrafite(0);
        this.grafite.setTamanhoGrafite(grafite.getTamanhoGrafite());
        System.out.println("Grafite inserido");
    }

    public String getMarca() {
        return marca;
    }

}