package com.company;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
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
=======
        Topic topic = new Topic(5, 2);
        System.out.println (topic);
        topic.inserir("xurupita", 18);
        topic.inserir("Ze_das_tapioca", 68);
        topic.inserir("Maria_Izolda", 69);
        topic.inserir("Elvis", 34);
        topic.inserir("Fulanim", 24);
        topic.inserir("Sicranim", 12);
        System.out.println (topic);

>>>>>>> 913b6b5b5d73583f32b70748a3412c0fce1dc67c

    }



}
