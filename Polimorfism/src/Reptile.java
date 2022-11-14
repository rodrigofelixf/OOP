public class Reptile extends Animal{
    private String scaleColor;


    // Override Animal
    @Override
    public void move() {
        System.out.println("Crawling");
    }

    @Override
    public void feed() {
        System.out.println("Eating vegetables");
    }
    @Override
    public void animalSound() {
        System.out.println("Reptile sound");
    }

    // Special methods


    public String getScaleColor() {
        return this.scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
