public class ContaPoupanca extends Conta{

        public ContaPoupanca(double saldo, double limite, double juros) {

            super(saldo, limite, juros);
        }

        public void sacar(double valor){
            if (valor<super.getSaldo()){
                super.setSaldo(valor-super.getJuros());
                System.out.println("saldo = "+ super.getSaldo()+"\nValor saque = "+ valor + "\nJuros = "+ super.getJuros());

            }
        }





}

