package Q10;

    public class Cliente {
        private String nome;
        private String cpf;
        private String email;
        private double saldo = 0;
        private double valorComprado = 0;
        private int parcelas[] = new int[]{1,2,3,4,6,7,8,9,10};

        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return nome;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getCpf() {
            return cpf;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setValorComprado(double valorComprado) {
            this.valorComprado = valorComprado;
        }

        public double getValorComprado() {
            return valorComprado;
        }
        public Cliente(String nome, String cpf, String email, double saldo, double valorComprado){
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
            this.saldo = saldo;
            this.valorComprado = valorComprado;
        }
        public void realizarCompra(double valor) {
            if (valor > 0 && saldo >= valor) {
                this.saldo -= valor;
                this.valorComprado += valor;
                System.out.println("Compra realizada com sucesso. novo saldo: "+this.saldo+"R$");
            } else {
                System.out.println("Saldo insuficiente para realizar a compra.");
            }
        }
        public void adicionarSaldo(double valor) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println(nome+" o seu saldo foi adicionado com sucesso, novo saldo: "+this.saldo);
            } else {
                System.out.println("Valor inválido !!!");
            }
        }
        public void sacarSaldo(double valor) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso. Seu saldo atual é "+this.saldo+"R$");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        }
    }
