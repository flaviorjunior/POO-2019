import java.util.ArrayList;


public abstract class Conta {

	private double saldo;
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	private double limite;
	private double juros;

	public Conta(double saldo, double limite, double juros) {
		super();
		this.setSaldo(saldo);
		this.limite = limite;
		this.juros = juros;
	}

	public void sacar(double valor){
		if (valor<getSaldo()){
			setSaldo(getSaldo() - valor);
			System.out.println("saldo = "+ getSaldo()+"\n Valor saque = "+ valor);
		}
	}

	public void depositar(double valor){
		setSaldo(getSaldo() + valor);
		System.out.println("Valor depositado = "+ valor + "\n Saldo = "+ getSaldo());
	}

	public void transferir( ArrayList<Cliente> clientesArray, double valor,String cpf){
		if (valor<getSaldo()){
			for ( int i = 0 ; i < clientesArray.size() ; i++){
				if (clientesArray.get(i).equals(cpf)){
					clientesArray.get(i).getConta().depositar(valor);
					setSaldo(getSaldo() - valor);
				}
			}
			setSaldo(getSaldo() - valor);
			
			
			
			System.out.println("saldo = "+ getSaldo()+"\n Valor tranferencia = "+ valor);
		}
		
		
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


}
