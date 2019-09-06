package com.company;

import java.util.ArrayList;

public class Moto {
    public double gasolina;
    private double kmRodados;

    public Moto () {
        this.gasolina = 0;
        this.kmRodados = 0;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public  String embarcar (int ida, String nome ){
        Pessoa p = new Pessoa (ida, nome);
       // System.out.println ();
        return p.getNome() + " embarcou";
    }
    public String desembarcar (Pessoa pessoa){

        System.out.println(pessoa + " desembarcou da moto =)");
    }

    public void abastecer(double value){
        if (value > 0){
            this.gasolina =+ value/5;
        }else{
            System.out.println("3RR0");
        }
    }

    public void viajar (double km){
        if (this.gasolina > 0 ){
            System.out.println("Ok..." + (km/3) + "..." + "..." + km/2 + "..." + km );
            this.gasolina = this.gasolina - km/100;
            this.kmRodados =+ km;
        }
    }

    public void status (){
        System.out.println("Voce já rodou: " + getKmRodados() + "km");
    }


}
