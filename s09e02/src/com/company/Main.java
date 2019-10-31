package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Agencia agencia = new Agencia();
		while(true){
			System.out.println("addCli_Nome, saque_ID_value, deposito_ID_value, transf_A_B_value, show, end ");
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end"))
				break;
			else if(ui[0].equals("addCli")){
				agencia.addCliente(ui[1]);
			}else if(ui[0].equals("show")) {
				agencia.show();
			}else if(ui[0].equals("transf")) {
				agencia.transferir(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]), Double.parseDouble(ui[3]));
			}else if(ui[0].equals("update")) {
				agencia.update();
			}else if(ui[0].equals("saque")) {
				agencia.saque(Integer.parseInt(ui[1]), Double.parseDouble(ui[2]));
			}else if(ui[0].equals("deposito")) {
				agencia.depositar(Integer.parseInt(ui[1]), Double.parseDouble(ui[2]));
			}else
				System.out.println("comando invalido");

			}



	/*Agencia bradesco  = new Agencia();
	//Cliente joao = new Cliente("Joao");
	bradesco.addCliente("joao");
	bradesco.addCliente("joao");
	bradesco.addCliente("maria");

		bradesco.show();
	bradesco.depositar(1, 500);
	bradesco.show();
	bradesco.depositar(3, 500);
	bradesco.depositar(6, 500);
	bradesco.saque(1, 75.0);
	bradesco.transferir(1, 2, 25);
	bradesco.transferir(5, 2, 25);

	bradesco.show();*/
    }
}
