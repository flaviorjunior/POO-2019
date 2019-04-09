package com.company;
import java.util.Scanner;

public class Pet {
    String nome;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >= this.energiaMax)
            this.energia = energiaMax;
        else if (energia <= 0) {
            this.energia = 0;

        }else
            this.energia = energia;
    }

    public int getSaciedade() {
        return saciedade;
    }

    public void setSaciedade(int saciedade) {
        if(saciedade >= this.saciedadeMax)
            this.saciedade = saciedadeMax;
        else if(saciedade < 0) {
            this.saciedade = 0;
            this.testVivo = false;
        }else
            this.saciedade = saciedade;
    }


    public int getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(int limpeza) {
        if (limpeza < this.limpezaMax)
            this.limpeza = limpezaMax;
    }

    public boolean testVivo(){
        if(this.testVivo)
            return true;
        System.out.println("fail: pet esta morto");
        return false;
    }


    public void play(){
        if(!this.testVivo())
            return;
        this.setEnergia(this.getEnergia() - 2);
        this.setSaciedade(this.getSaciedade() - 1);
        this.setLimpeza(this.getLimpeza() - 3);
        this.diamantes =+ 1;
        this.idade =+ 1;
    }

    public void eat(){
        if(!this.testVivo())
            return;
        this.setEnergia(this.getEnergia() - 1);
        this.setSaciedade(this.getSaciedade() + 4);
        this.setLimpeza(this.getLimpeza() - 2);
        this.idade =+ 1;
    }
    public void sleep(){
        if(!this.testVivo())
            return;
        if (this.energiaMax - this.energia < 5) {
            System.out.println("fail: nao esta com sono");
            return;
        }
        this.idade += this.energiaMax;
        this.setEnergia(this.energiaMax);

    }

    public void clean (){
        if(!this.testVivo())
            return;
        this.setEnergia(this.getEnergia() - 3);
        this.setSaciedade(this.getSaciedade() - 1);
        this.setLimpeza(this.limpezaMax);
        this.idade =+ 2;
    }


    private int energia;
    private int saciedade;
    private int limpeza;
    private int energiaMax;
    private int saciedadeMax;
    private int limpezaMax;
    private int diamantes;
    private int idade;


    public Pet( String nome, int energia, int saciedade, int limpeza){
        this.nome = nome;
        this.energia = energia;
        this.saciedade = saciedade;
        this.limpeza = limpeza;
        this.energiaMax = energia;
        this.saciedadeMax = saciedade;
        this.limpezaMax = limpeza;
        this.diamantes = 0;
        this.idade = 0;
    }

    public String toString(){
        return "[" + this.nome + "] " +
                "E: " + this.energia + "/" + this.energiaMax +
                " S: " + this.saciedade + "/" + this.saciedadeMax +
                " L: " + this.saciedade + "/" + this.saciedadeMax +
                " D:" + this.diamantes + " I:" + this.idade;

    }


}


import com.company.Pet;

        import java.util.Scanner;

class Controller{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        Pet pet = new Pet("", 0, 0, 0);
        System.out.println ("end, init _nome _E _S _L, show, eat, play, clean");

        while (true){
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("end")){
                break;
            }else if (ui [0].equals("init")){
                pet = new Pet (ui[1], Integer.parseInt(ui[2]),
                        Integer.parseInt(ui[3]),
                        Integer.parseInt(ui[4]));

            }else if (ui[0].equals("show")) {
                System.out.println(pet);


            }else if (ui[0].equals("eat")) {
                pet.eat();

            }else if (ui[0].equals("play")) {
                pet.play();

            }else if (ui[0].equals("sleep")) {
                pet.sleep();

            }else if (ui[0].equals("clean")) {
                pet.clean();

            }else{
                System.out.println("fail: comando invalido");
            }
        }

    }
}
