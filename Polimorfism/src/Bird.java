public class Bird extends Animal {
    private String featherColor;

    // Methods

    public void buildingNest() {
        System.out.println("Building Nest...");
    }

    // Override Animal
    @Override
    public void move() {
        System.out.println("Flying");
    }

    @Override
    public void feed() {
        System.out.println("Eating fruit");
    }

    @Override
    public void animalSound() {
        System.out.println("Bird sound");
    }

    // Special methods


    public String getFeatherColor() {
        return this.featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}
