package com.company;

import org.omg.Messaging.SyncScopeHelper;
import sun.awt.AWTAccessor;

class Ventilador {
    public boolean estaLigado;
    public int velocidade;
    public boolean estaGirando;


    public Ventilador(){
        this.estaLigado = estaLigado;
        this.velocidade = velocidade;
        this.estaGirando = estaGirando;
    }


    void ligar() {
        if (estaLigado == false) {
            System.out.println("Ligando o ventilador...ok.");
            estaLigado = true;
        } else {
            System.out.println("Ja esta Ligado");
        }
    }

    void desligar() {
        if (estaLigado == true) {
            System.out.println("Desligando o ventilador...ok.");
            estaLigado = false;
            estaGirando = false;
            velocidade = 0;
        } else {
            System.out.println("Ja esta desligado");
        }
    }

    void showStatus() {
        System.out.println("Está Ligado: " + estaLigado +
                    ", Vel: " + 	velocidade +
                    ", Girando: " + estaGirando);


        }

    void girar() {
        if (estaLigado == true) {
            if (estaGirando == false) {
                System.out.println("Ventilador está girando agora");
                estaGirando = true;
            } else {
                System.out.println("Opa...Já está girando");
            }
        }
        else{
            System.out.println ("Opa... Ventilador está desligado");
        }


    }

    void parardeGirar() {
        if (estaGirando == true) {
            System.out.println("Ventilador está parado agora");
            estaGirando = false;
        } else {
            System.out.println("Opa...Já está parado");
        }

    }

    void alterarVelocidade(int vel){
        if ((estaLigado == true)){
            if ((vel > 3) || (vel <= 0)){
                System.out.println("Velocidade inválida");
            }
            else{
                System.out.println("Alterando Velocidade para: " + vel);
                velocidade = vel;

            }
        }else{
            System.out.println ("Opa... Ventilador desligado");
        }

    }


}


    /*



        void desligar ()
        void girar ()
        void pararDeGirar ()
        void aumentarVelocidade ()
        void diminuirVelocidade ()
        */
