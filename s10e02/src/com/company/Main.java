package com.company;

public class Main {

    public static void main(String[] args) {
	Agiota agiota = new Agiota (999);
	agiota.addCliente("flavio", "flavio galvao");
	agiota.emprestar("flavio", 345);
	agiota.emprestar("flavio", 1000);
	agiota.emprestar("Ze", 3);
	agiota.addCliente("chico", "chico biroliro");
	agiota.emprestar("chico", 45);
	agiota.emprestar("chico", 20);
	agiota.emprestar("chico", 50);
	agiota.filtrar("chico");
	agiota.receber("chico", 100);
	agiota.resumo();
	agiota.matarC("chico");
	agiota.matarT("chico");
	agiota.resumo();
	agiota.historico();


	}
}
