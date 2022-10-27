public class Pen {
    public String model;
    private String color;


    private float nib;

    private boolean cover;

    public Pen() { // Este é o metodo Construtor / pode colocar mais de um parâmetro definindo o tipo
        this.coverPan();
        this.color = "Blue";

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String m){
        this.model = m;
    }

    public float getNib(){
        return this.nib;
    }

    public void setNib(float n){
        this.nib = n;
    }

    public void status() {
        System.out.println("Pen model: " + this.model);
        System.out.println("Pen nib: " + this.nib);
        System.out.println("Pen color: " + this.color);
        System.out.println("pen cover? " + this.cover);
    }

    public void coverPan() {
        this.cover = true;
    }

    public void uncoverPan() {
        this.cover = false;
    }

}
