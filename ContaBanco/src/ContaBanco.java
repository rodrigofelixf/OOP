public class ContaBanco {

    // Atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos.
    public void estadoAtual() {
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc"){
            this.setSaldo(50f);
        } else if (t == "cp") {
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso!");

    }

    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta com dívidas");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()){
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saquela realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo indisponível");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fecjada");
        }
    }

    public void pagarMensal() {
       float v = 0;
       if (this.getTipo() == "cc"){
           v = 12f;
       } else if (this.getTipo() == "cp"){
           v = 20f;
       }
       if (this.getStatus()) {
          if (this.getSaldo() > v) {
              this.setSaldo(getSaldo() - v);
          } else {
              System.out.println("Saldo insuficiente");
          }
       }
    }

    // Métodos especiais

    public void ContaBanco() {
        this.setSaldo(0f);
        this.setStatus(false);
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String nome) {
        this.dono = nome;
    }

    public String getDono(){
        return dono;
    }

    public void setSaldo(float s ){
        this.saldo = s;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    public boolean getStatus(){
        return status;
    }

}
