package com.company;


import java.util.Scanner;

class Main {
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
