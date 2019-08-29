package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Números de 150 à 300");
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
        System.out.println("Soma de 1 a 1000");
        int soma = 0;

        for (int i = 1; i <= 1000; i++) {
            soma += i;
        }

        System.out.println( soma);

        System.out.println("Multiplos de 3, entre 1 e 100");
        for (int y = 3; y <= 100; y++) {
            if (y % 3 == 0){
                System.out.println (y);
            }
        }
    }
}
