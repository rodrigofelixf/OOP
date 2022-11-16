package Sobrecarga;

public abstract class Animal {
    protected float weight;
    protected int age;
    protected int limbs;

    public abstract void animalSound();

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
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
