public class Mammal extends Animal{
    private String furColor;


    // Animal Override Methods

    @Override
    public void move() {
        System.out.println("Running");
    }

    @Override
    public void feed() {
        System.out.println("Suckling");
    }

    @Override
    public void animalSound() {
        System.out.println("Mammal sound");
    }

    // Special Methods

    public String getFurColor() {
        return this.furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
