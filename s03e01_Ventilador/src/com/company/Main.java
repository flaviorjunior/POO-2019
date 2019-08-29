package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ventilador arno = new Ventilador();

        while(true){
            System.out.println("Digite um comando: ligar, desligar, girar, parar, vel_X, ou status " );
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String[] ui = line.split(" ");
            if(ui[0].equals("ligar")){
                arno.ligar();
            }else if(ui[0].equals("girar")){
                arno.girar();
            }else if(ui[0].equals("desligar")){
                arno.desligar();
            }else if(ui[0].equals("vel")){
                arno.alterarVelocidade(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("parar")) {
                arno.parardeGirar();
            }else if(ui[0].equals("status")){
                    arno.showStatus();
            }else{
                System.out.println("fail: comando invalido");
            }
        }
    }
}