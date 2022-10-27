public class User {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Usando os parametros Pen p1 = new Pen("modelo", "cor", 4.5f)
        p1.status();

        System.out.println("Model " + p1.getModel());

    }
}