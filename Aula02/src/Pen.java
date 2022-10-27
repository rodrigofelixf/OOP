public class Pen {
    public String model;
    public String color;
    private float nib;
    protected int refill;
    private boolean cover;


    public void status(){
        System.out.println("Pen model: " + this.model);
        System.out.println("A pen " + this.color);
        System.out.println("Nib: " + this.nib);
        System.out.println("Pen refill: " + this.refill);
        System.out.println("it's covered? " + this.cover);

    }


    public void scribble() {
        if (this.cover){
            System.out.println("ERROR! It's not possible to scribble");
        } else {
            System.out.println("Doodling");
        }

    }

    public void write() {
        if (this.cover){
            System.out.println("ERROR! It's not possible to write");
        } else {
            System.out.println("Writing");
        }
    }

    public void coverPen(){
        this.cover = true;

    }

    public void uncoverPen(){
        this.cover = false;

    }
}
