package com.company;
import java.util.ArrayList;

public class Agiota {
    int idTrans;
    private double saldoag;
    Repositorio<Cliente> clientes;
    Repositorio<Transacao> transacoes;
    ArrayList<Historico> historicos;

    public Agiota(double saldoag) {
        this.idTrans = 0;
        this.saldoag = saldoag;
        this.clientes = new Repositorio<>("Cliente");
        this.transacoes = new Repositorio<>("Transacao");
        this.historicos = new ArrayList<>();
    }
    public String toString() {
        return "Meu saldo: " + getSaldoag() + "\nClientes: " + clientes.getAll();
    }

    public void emprestar(String clienteId, double valor) {
        if (this.clientes.get(clienteId) != null){
            if (getSaldoag() >= valor){
                clientes.get(clienteId).receber(valor);
                this.setSaldoag(getSaldoag() - valor);
                transacoes.emprestar(clienteId, new Transacao(idTrans, clienteId, valor));
                historicos.add(new Historico(idTrans, clienteId, valor));
                idTrans++;
            }else {
                throw new RuntimeException("Saldo insuficiente!");
            }
        }
    }

    public void receber(String clienteId, double valor){
        if (this.clientes.get(clienteId) != null){
            if (clientes.get(clienteId).getSaldo() >= valor){
                this.setSaldoag(getSaldoag() + valor);
                clientes.get(clienteId).pagar(valor);
                transacoes.receber(clienteId, new Transacao(idTrans, clienteId, valor));
                historicos.add(new Historico(idTrans, clienteId, valor));
                idTrans++;
            }else {
                throw new RuntimeException("Valor maior do que a dívida!");
            }
        }
    }

    public double getSaldoag() {
        return saldoag;
    }
    public void setSaldoag(double saldoag) {
        this.saldoag = saldoag;
    }
}

