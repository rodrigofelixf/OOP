public class Fish extends Animal{
    private String scaleColor;

    //Methods

    public void dropBubble(){
        System.out.println("Dropping bubbles");
    }

    // Override Animal
    @Override
    public void move() {
        System.out.println("Swimming");
    }

    @Override
    public void feed() {
        System.out.println("Eating substances");
    }

    @Override
    public void animalSound() {
        System.out.println("Sound Fish");
    }

    // Special Methods

    public String getScaleColor() {return this.scaleColor;}

    public void setScaleColor(String scaleColor) {this.scaleColor = scaleColor;}

}
