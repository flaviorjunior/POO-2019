package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agiota agiota = new Agiota();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                String line = scanner.nextLine();
                String ui[] = line.split(" ");
                if(ui[0].contentEquals("end"))
                    break;
                else if(ui[0].equals("add")) {
                    agiota.clientes.add(ui[1], new Cliente(ui[1], ui[1]));
                }else if(ui[0].equals("remover")) {//dono idPet raca
                    agiota.clientes.remove(ui[1]);
                }else
                    System.out.println("ERRO");
               /* }else if(ui[0].equals("show")) {
                    System.out.println(clinica);
                }else if(ui[0].equals("showDono")) {
                    System.out.println(clinica.donos.get(ui[1]));
                }else {
                    System.out.println("  fail:comando invalido");
                }

            }catch(RuntimeException e) {
                System.out.println(e.getMessage());
            }*/
        } catch (Exception e) {
                e.printStackTrace();
            }
            scanner.close();
    }
}
    }


