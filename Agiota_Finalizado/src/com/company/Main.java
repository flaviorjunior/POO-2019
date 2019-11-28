package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agiota agiota = new Agiota(0);
        Transacao transacao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: tchau, addCash _value, addcli _name, show, filtrar _name, historico, emprestar _value, matar _name, receber _name _value");

        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            try{
                if (ui[0].equals("tchau")){
                    break;
                }else if (ui[0].equals("addCash")){
                    agiota.setSaldoag(Integer.parseInt(ui[1]));
                    System.out.println("Saldo atualizado");
                }else if (ui[0].equals("addcli")){
                    agiota.clientes.add(ui[1], new Cliente(ui[1]));
                    System.out.println("Cliente adicionado com sucesso!");
                }else if (ui[0].equals("show")){
                    System.out.println(agiota);
                }else if (ui[0].equals("filtrar")){
                    System.out.println(agiota.clientes.get(ui[1]));
                }else if (ui[0].equals("historico")){
                    System.out.println(agiota.historicos);
                }else if (ui[0].equals("emprestar")){
                    agiota.emprestar(ui[1], Integer.parseInt(ui[2]));
                    System.out.println("Emprestô");
                }else if (ui[0].equals("matar")) {
                    for (int i = 0; i < agiota.historicos.size(); i++){
                        if (ui[1].equals(agiota.historicos.get(i).getIdCliente())){
                            agiota.historicos.remove(i);
                            i--;
                        }
                    }
                    agiota.clientes.remove(ui[1]);
                    System.out.println("MAN DOWN");
                }else if (ui[0].equals("receber")){
                    agiota.receber(ui[1], Integer.parseInt(ui[2]));
                    System.out.println("Recebido");
                }else {
                    System.out.println("Comando inválido");
                }
            }catch (RuntimeException  re){
                System.out.println(re.getMessage());
            }
        }
    }
}
