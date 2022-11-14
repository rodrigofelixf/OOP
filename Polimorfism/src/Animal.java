public abstract class Animal {
    protected double weight;
    protected int age;
    protected int limbs;

    // Abstratic methods

    public abstract void move();
    public abstract void feed();
    public abstract void animalSound();

    // Special methods

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLimbs() {
        return this.limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }
}
