package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Grafite g1 = new Grafite(0.7,1);
        Lapiseira l1 = new Lapiseira("Pencil",g1);
        Scanner op = new Scanner(System.in);
        String pontastr= "ui";
        double ponta;


        while (true) {
            System.out.println("Menu: escrever _value, colocarGrafite _ponta _quant, ou status");
            String opcao = op.nextLine();
            String[] vet = opcao.split(" ");

            if(vet[0].equals("escrever")) {
                l1.escrever(Integer.parseInt(vet[1]));
                continue;
            }else if(vet[0].equals("colocarGrafite") || vet[0].equals("colocargrafite")) {
                pontastr = vet[1];
                ponta = Double.parseDouble(pontastr);
                int grafite = Integer.parseInt(vet[2]);
                Grafite g2 = new Grafite(ponta,grafite);
                l1.colocarGrafite(g2);
                continue;
            }else if(vet[0].equals("status")){
                System.out.println(l1.toString());
                continue;
            }else {
                System.out.println("3RRO, comando inválido");
            }
        }
    }
}