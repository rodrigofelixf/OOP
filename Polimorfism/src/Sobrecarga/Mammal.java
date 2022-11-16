package Sobrecarga;

public class Mammal extends Animal{
    protected String furColor;

    @Override
    public void animalSound() {
        System.out.println("Mammal Sound");

    }
}
