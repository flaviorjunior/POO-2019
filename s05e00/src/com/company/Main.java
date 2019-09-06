package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    Moto moto = new Moto();
	    System.out.println("init_A_B, stop, abastecer, viajar_A, embarcar_P, desembarcar_P");


        while (true) {
            String line = scan.nextLine();
            String [] ui = line.split (" ");
            if (ui[0].equals("stop")) {
                break;
            } else if (ui[0].equals("init")) {
                moto = new Moto();
            } else if (ui[0].equals("abastecer")) {
                moto.abastecer(Integer.parseInt(ui[1]));
            } else if (ui[0].equals("viajar")) {
                moto.viajar(Integer.parseInt(ui[1]));
            } else if (ui[0].equals("embarcar")) {
                moto.embarcar(Integer.parseInt(ui[1]), ui[2]);
            }
               System.out.println (moto.embarcar(ui[1], Integer.parseInt(ui[2]));


            }
}
