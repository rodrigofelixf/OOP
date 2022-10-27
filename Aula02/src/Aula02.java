public class Aula02 {
    public static void main(String[] args) {
        Pen c1 = new Pen();
        c1.model = "Crystal Bic";
        c1.color = "Blue";
        c1.refill = 80;
        // c1.cover = false;
        // c1.nib = "0.5f";
        c1.uncoverPen();
        c1.status();
        c1.scribble();

    }
}