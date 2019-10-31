package com.company;

import java.util.ArrayList;

public class Agencia {
    protected ArrayList<Cliente> clientes = new ArrayList();
    protected ArrayList<Conta> contas = new ArrayList();
    protected static int nextId;

    public Agencia() {

        nextId = 0;
    }


    public boolean addCliente(String nome) {
        //System.out.println("entrou no addCli");
        for (int i = 0; i < clientes.size(); i++) {
            //System.out.println(clientes.get(i).getId());
            //System.out.println(i.getId());
            //System.out.println("entrou no for");
            if (clientes.get(i).getId().equals(nome)) {

                System.out.println("Cliente já está cadastrado");
                return false;
            }
        }

        Cliente cliente = new Cliente(nome);
        this.clientes.add(cliente);
        Conta cc = new ContaCorrente(nextId, cliente);
        cliente.getContas().add(cc);
        nextId += 1;

        Conta cp = new ContaPoupanca(nextId, cliente);
        cliente.getContas().add(cp);
        nextId++;

        contas.add(cc);
        contas.add(cp);
        System.out.println("Cliente cadastrado");

        return true;

    }


    public boolean depositar(int id, double value) {
        for (Conta i : contas) {
            if (i.getId() == (id)) {
                i.setSaldo(i.getSaldo() + value);
                System.out.println("Depositado");
                return true;
            }


        }
        System.out.println("fail: conta não encontrada");
        return false;
    }

    public boolean saque (int id, double value) {
        for (Conta i : contas) {

            if (i.getId() == (id)) {
                if (i.getSaldo() > value){
                    i.setSaldo(i.getSaldo() - value);
                    System.out.println("Depositado");
                    return true;
                }
                else
                    System.out.println("fail: saldo insuficiente");
            }


        }
        System.out.println("fail: conta não encontrada");
        return false;
    }

    public boolean transferir (int idDe, int idPara, double value) {
        for (Conta a : contas) {
            if (a.getId() == idDe) {
                System.out.println("achei a conta");
                if (a.getSaldo() > value) {
                    for (Conta b : contas) {
                        if (b.getId() == idPara) {
                            a.setSaldo(a.getSaldo() - value);
                            b.setSaldo(b.getSaldo() + value);
                            System.out.println("Transferido");
                            return true;
                        }
                    }
                } else
                    System.out.println("fail: fundos insuficientes");
            }
        }
        System.out.println("fail: conta não encontrada");
        return false;
    }



    public void show (){
        for (Conta i : contas){
            System.out.println(i);
        }
    }

    public void update(){
        for (Conta conta : contas){
            conta.update();
        }
    }

}

