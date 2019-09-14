package com.company;

public class Conta {
    private String titular;
    private double saldo;
    private double limite;
    private static int totalDeContas;


    public Conta () {
        Conta.totalDeContas = Conta.totalDeContas + 1;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        this.totalDeContas = totalDeContas;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public double getLimite() {
        return limite;
    }


    public void saca(double v){
        if (v < getSaldo() && v > 0){
            this.saldo = this.saldo - v;
        }
        else{
            System.out.println("3RR0");
        }
    }

    public void transfere(){

    }

    public void deposita(double v){
        if (v > 0){
            this.saldo = this.saldo + v;
        }else{
            System.out.println("3RR0");
        }

    }

    public void status(){
        System.out.println("Conta: " + getTitular() + " Saldo: " + getSaldo() + " Limite: "+ getLimite() + " Total de contas: " + getTotalDeContas());
    }
}
