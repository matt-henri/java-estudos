public class ContaBanco {
    // ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos Personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.print("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.print("Conta não pode ser fechada porque ainda tem dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.print("Conta não pode ser fechada pois tem débito.");
        } else {
            this.setStatus(false);
            System.out.print("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.print("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.print("Impossive depositar em uma conta fechada!");
        }
    }

    public void savar( float v ) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.getSaldo(this.getSaldo() - v);
                System.out.print("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.print("Saldo insuficiente para saque ");
            }

    }

    public void pagarMensal() {

    }

    // Métodos Especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String Dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
