public abstract class Person {
    protected String name;
    protected int age;
    protected char gender;
    protected double xp;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.xp = xp;
    }

    // methods

    protected void winXp(){

    }

    // special methods

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getXp() {
        return this.xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
}
