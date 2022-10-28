public class User {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1010);
        p1.setDono("Rodrigo");
        p1.abrirConta("cc");
        p1.estadoAtual();
        p1.depositar(300);
        p1.estadoAtual();
        p1.sacar(350);
        p1.estadoAtual();
        p1.fecharConta();




    }
}