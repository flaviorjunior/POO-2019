

    public class Cliente {

        private String nome;
        private String cpf;
        private Conta conta;

        public Cliente (String nome, String cpf, Conta conta) {
            super();
            this.nome = nome;
            this.cpf = cpf;
            this.conta = conta;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public Conta getConta() {
            return conta;
        }

        public void setConta(Conta conta) {
            this.conta = conta;
        }

        public String toString(){
            return "Tipo: " + this.conta + "nome: "+ this.nome + "CPF: " + this.cpf;
        }
    }

