public class Main {
    public static void main(String[] args) {
        Mammal m1 = new Mammal();
        Reptile r1 = new Reptile();
        Fish f1 = new Fish();
        Bird b1 = new Bird();
        Kangaroo k1 = new Kangaroo();
        Dog d1 = new Dog();

        // Mammal
        System.out.println("----Mammal----");
        m1.setWeight(85.3);
        m1.setAge(2);
        m1.setLimbs(4);
        m1.move();
        m1.feed();
        m1.animalSound();

        // Fish
        System.out.println("----Fish----");
        f1.setWeight(0.35);
        f1.setAge(1);
        f1.setLimbs(0);
        f1.move();
        f1.feed();
        f1.animalSound();
        f1.dropBubble();

        // Bird
        System.out.println("----Bird----");
        b1.setWeight(0.89);
        b1.setAge(2);
        b1.setLimbs(2);
        b1.move();
        b1.feed();
        b1.animalSound();
        b1.buildingNest();

        // Kangaroo
        System.out.println("----Kangaroo----");
        k1.setWeight(55.30);
        k1.setAge(3);
        k1.setLimbs(4);
        k1.move();
        k1.feed();
        k1.animalSound();
        k1.useBag();

        // Dog
        System.out.println("---Dog---");
        d1.setWeight(3.94);
        d1.setAge(5);
        d1.setLimbs(4);
        d1.move();
        d1.feed();
        d1.animalSound();
        d1.buryBone();
        d1.waggingTail();

    }
}