package com.company;

import java.util.ArrayList;

public class Agiota {
    protected double saldo;
    protected ArrayList<Cliente> clientes = new ArrayList();
    protected ArrayList<Transacao> transacoes = new ArrayList();
    protected static int nextId;

    public Agiota(double saldo) {
        this.saldo = saldo;
        nextId = 0;
        System.out.println("Agiota iniciado");
    }

    public boolean addCliente(String nome, String nomeC) {
        for (Cliente i : clientes) {
            //System.out.println(i);
            if (i.getApelido().equals(nome)) {
                System.out.println("fail: Cliente já existe");
                return false;
            }

        }
        Cliente cliente = new Cliente(nome, nomeC);
        this.clientes.add(cliente);
        System.out.println("Cliente adicionado");

        return true;
    }

    public boolean emprestar(String apelido, double valor) {
        if (this.saldo > valor) {
            for (Cliente i : clientes) {
                if (i.getApelido().equals(apelido)) {
                    i.setValorDivida(i.getValorDivida() + valor);
                    this.saldo = this.saldo - valor;
                    Transacao transacao = new Transacao(nextId, apelido, valor * (-1));
                    transacoes.add(transacao);
                    nextId = nextId + 1;
                    //System.out.println(transacoes);
                    return true;
                }

            }
            System.out.println("fail: cliente não encontrado");
            return false;




        }else
            System.out.println("fail: Fundos insuficientes");
            return false;
    }

    public void historico() {
        for (Transacao t : transacoes) {
            System.out.println(t);
        }

    }

    public void resumo() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        System.out.println(this.saldo);

    }

    public void filtrar(String apelido) {
        for (Transacao t : transacoes) {
            if (t.getClienteId() == apelido) {
                System.out.println(t);
            }
        }
    }

    public void receber(String apelido, double valor) {
        for (Cliente c : clientes) {
            if (c.getApelido() == apelido) {
                c.setValorDivida(c.getValorDivida() - valor);
                this.saldo = saldo + valor;
                Transacao transacao = new Transacao(nextId, apelido, valor);
                transacoes.add(transacao);
                nextId = nextId + 1;
            }

        }
        System.out.println("fail: cliente não encontrado ");

    }

    public void matarT(String apelido) {
        //int i = this.transacoes.size()-1;
        //while (i > 0){
            //System.out.print(i);
            //for (Transacao t : transacoes) {
                for (int i = transacoes.size() - 1; i > 0; i--){
                //System.out.println("Entrou no for de transacao");
                if (this.transacoes.get(i).getClienteId().equals(apelido)) {
                    //System.out.println("entrou no if de transacao");
                    this.transacoes.remove(i);


                }

        }//i--;

        //}
        System.out.println("fail: cliente não encontrado");

    }

    public boolean matarC(String apelido){
        for (Cliente c : this.clientes) {
            System.out.println("entrou no for");
            if (c.getApelido().equals(apelido)) {
                System.out.println("entrou no if");
                this.clientes.remove(c);
                System.out.println(apelido + " morto");
                return true;
            }

        }
        System.out.println("fail: cliente não encontrado");
        return false;
    }

}
        //return false;









