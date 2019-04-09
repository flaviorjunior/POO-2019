package com.company;

import java.util.ArrayList;
import java.util.Scanner;


class Passageiro {
    public String id;
    public int idade;
    public Passageiro(String id, int idade){
        this.id = id;
        this.idade = idade;
    }

    public String toString() {

        return id + ":" + idade;
    }
}



class Topic {
    ArrayList<Passageiro> cadeiras;
    int pref;

    public Topic(int capacidade, int pref) {
        cadeiras = new ArrayList<Passageiro>();
        for (int i = 0; i < capacidade; i++)
            cadeiras.add(null);

        this.pref = pref;

    }

    boolean inserir(String id, int idade) {
        if (idade >= 60) {
            for (int i = 0; i < pref; i++)
                if (cadeiras.get(i) == null) {
                    System.out.println("Achei uma cadeira");
                    this.cadeiras.set(i, new Passageiro(id, idade));
                    return true;
                }
            for (int i = pref; i < cadeiras.size(); i++) {
                if (cadeiras.get(i) == null)
                    cadeiras.set(i, new Passageiro(id, idade));
                    return true;

            }
        }
         else{
             for (int i = pref; i < cadeiras.size(); i++)
                 if (cadeiras.get(i) == null) {
                     System.out.println("Achei uma cadeira");
                     this.cadeiras.set(i, new Passageiro(id, idade));
                     return true;
             }
             for (int i = 0; i < pref; i++) {
                 if (cadeiras.get(i) == null)
                 cadeiras.set(i, new Passageiro(id, idade));
                 return true;

             }
         }
         System.out.println("Topic lotada");
         return false;
    }

    void remover (String nome) {
        for(int i = 0; i < this.cadeiras.size(); i += 1) {
            Passageiro passageiro = this.cadeiras.get(i);
            if ((passageiro != null) && (passageiro.id.equals(nome))) {
                this.cadeiras.set(i, null);
                return;
            }
        }
    }




    public String toString () {
        String saida = "[";
        for (int i = 0; i < cadeiras.size(); i++) {
            if (i < pref)
                saida += " @";
            else
                saida += " =";

            if (cadeiras.get(i) != null)
                saida += cadeiras.get(i);

        }
        saida += "]";
        return saida;
    }

}

class Controller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Topic topic = new Topic(0, 0);
        System.out.println("init _A _B, end, show, in _A _B, out _A");

        while (true) {
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("end")) {
                break;
            } else if (ui[0].equals("init")) {
                topic = new Topic(Integer.parseInt(ui[1]),
                        Integer.parseInt(ui[2]));

            } else if (ui[0].equals("show")) {
                System.out.println(topic);


            } else if (ui[0].equals("in")) {
                topic.inserir((ui[1]), Integer.parseInt(ui[2]));

            } else if (ui[0].equals("out")) {
                topic.remover((ui[1]));


            } else {
                System.out.println("fail: comando invalido");
            }
        }

    }
}


        /*for (int i = 0; i < cadeiras.size(); i++)
            if (cadeiras.get(i) != null && cadeiras.get(i).id.equals(nome)) {
                System.out.println("Te achei miseravi");
                cadeiras.set(i, null);
                return;
            }else {
                System.out.println("fail: Passageiro não esta na topic");
                return;

            }

        }*/







/*public void inserirP (Passageiro passageiro) {
        if (passageiro.preferencial()) {
            for (int i = 0; i < pref; i++) {
                if (cadeiras.get(i) == null)
                    cadeiras.set(i, passageiro);
                return;

            }
            for (int i = pref; i < cadeiras.size(); i++) {
                if (cadeiras.get(i) == null) {
                    cadeiras.set(i, passageiro);
                    return;
                }
            }

        } else {
            for (int i = pref; i < cadeiras.size(); i++) {
                if (cadeiras.get(i) == null) {
                    cadeiras.set(i, passageiro);
                    return;
                }
            }
            for (int i = 0; i < pref; i++) {
                if (cadeiras.get(i) == null) {
                    cadeiras.set(i, passageiro);
                    return;
                }
            }
        }
    }
*/
