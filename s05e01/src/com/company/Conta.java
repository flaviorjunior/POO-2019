package com.company;

public class Conta {
    private String titular;
    private double saldo;
    private double limite;
    private int totalDeContas;

    public Conta (String titular, double saldo, double limite, int totalDeContas) {
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        this.totalDeContas = totalDeContas;
    }

    public Conta() {

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

    public void setLimite(double limite) {
        this.limite = limite;
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
        System.out.println("Conta: " + getTitular() + " Saldo: " + getSaldo() + " Limite: "+ getLimite());
    }
}
