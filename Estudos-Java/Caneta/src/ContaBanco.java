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
            this.saldo = 50;
        } else if (t == "CP") {
            this.saldo = 150;
        }

    }

    private void setStatus(boolean b) {
    }

    public void fecharConta() {

    }

    public void depositar() {

    }

    public void savar() {

    }

    public void pagarMensal() {

    }

    // Métodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
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

}
