package Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Wolf x = new Wolf();
        Dog d = new Dog();

        x.animalSound();
        d.animalSound();

        d.react("Hello");
        d.react("Bolsonara");

        d.react(10,45);
        d.react(19,00f);

        d.react(true);
        d.react(false);


    }
}
