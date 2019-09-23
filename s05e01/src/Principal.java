 import java.util.ArrayList;

    public class Principal {

        public static void main(String[] args) {

            ArrayList<Cliente> clientesArray = new ArrayList<Cliente>();


            //------------------------------------------------------------------------------------
            Conta cc1 = new ContaCorrente(500, 1000, 00);
            Conta cc2 = new ContaCorrente(500, 1000, 00);
            Conta cp3 = new ContaPoupanca (400, 1000, 1.5);

            Cliente c = new Cliente("flavio", "000.000.111", cc1);
            clientesArray.add(c);
            Cliente c2 = new Cliente("maria", "000.222.111", cc2);
            clientesArray.add(c2);
            Cliente c3 = new Cliente("Peba", "000.333.222", cp3);
            clientesArray.add(c3);

            cc1.depositar(30);
            cc2.sacar(170);
            cp3.sacar(250);


            cc1.transferir(clientesArray, 100, "000.222.111");

            //------------------------------------------------------------------------------------

        }
    }