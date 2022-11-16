package Sobrecarga;

public class Dog extends Mammal{

    @Override
    public void animalSound() {
        System.out.println("Au, Au, Au!");
    }

    public void react(String text) {
        if (text.equals("Take food") || (text.equals("Hello"))) {
            System.out.println("Wagging tail and bark");
        } else {
            System.out.println("Growling dog");
        }
    }

    public void react(int hour, int min) {
        if (hour < 12) {
            System.out.println("Wagging");
        } else if (hour >= 18) {
            System.out.println("Ignore");
        } else {
            System.out.println("Wagging and bark");
        }
    }

    public void react(boolean owner) {
        if (owner) {
            System.out.println("Wagging");
        } else {
            System.out.println("Bark and Growl");
        }
    }

    public void react(int age, float weight) {
        if (age < 5) {
            if (weight < 10) {
                System.out.println("Wagging");
            } else {
                System.out.println("Bark");
            }
        }  else {
            if (weight < 10) {
                System.out.println("Barking..");
            } else {
                System.out.println("Ignore");
            }
        }

    }
}
