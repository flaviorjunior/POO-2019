package com.company;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(400);
        conta.setTitular("Pedro");
        conta.saca(200);
        Conta c = new Conta ();
        c.setTitular("zezãoDasTapiocas");
        c.status();




    }
}
