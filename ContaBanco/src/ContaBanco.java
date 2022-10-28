public class ContaBanco {

    // Atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos.

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "cc"){
            setSaldo(50f);
        } else if (t == "cp") {
            setSaldo(150f);
        }

    }

    public void fecharConta() {
        if (getSaldo() > 0){
            System.out.println("conta com dinheiro");
        } else if (getSaldo() < 0){
            System.out.println("Conta com dívidas");
        } else {
            setStatus(false);
        }

    }

    public void depositar(float valor) {
        if (getStatus()){
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float valor) {
        if (getStatus()){
            if (getSaldo() > valor) {
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Saldo indisponível");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal() {
       float v = 0;
       if (tipo == "cc"){
           v = 12f;
       } else if (tipo == "cp"){
           v = 20f;
       }
       if (getStatus()) {
          if (getSaldo() > v) {
              setSaldo(getSaldo() - v);
          } else {
              System.out.println("Saldo insuficiente");
          }
       }


    }

    // Métodos especiais

    public void construtor() {
        saldo = 0;
        status = false;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
