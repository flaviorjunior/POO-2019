package com.company;

public class Historico {
    private int idTrans;
    private String idCliente;
    private double value;

    public int getIdTrans() {
        return idTrans;
    }

    public void setIdTrans(int idTrans) {
        this.idTrans = idTrans;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Historico(int idTrans, String idCliente, double input) {
        this.idTrans = idTrans;
        this.idCliente = idCliente;
        this.value = input;
    }

    @Override
    public String toString() {
        return idTrans + ": " + idCliente + ": " + value;
    }
}