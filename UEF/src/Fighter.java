public class Fighter {
    //atributes
    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins;
    private int defeats;
    private int draws;

    // Methods

    public void show() {
        System.out.println("Fighter: " + this.getName());
        System.out.println("From: " + this.getNationality());
        System.out.println(this.getAge() + " Age");
        System.out.println(this.getHeight() + " Height");
        System.out.println("Weight " + this.getWeight());
        System.out.println("Wins " + this.getWins());
        System.out.println("Defeats " + this.getDefeats());
        System.out.println("Draws " + this.getDraws());
    }

    public void status() {
        System.out.println(getName());
        System.out.println("Weight " + this.getWeight());
        System.out.println(this.getWins() + " Wins");
        System.out.println(this.getDefeats() + " Defeats");
        System.out.println(this.getDraws() + " Draws");
    }

    public void winFight() {
        setWins(getWins() + 1);
    }

    public void loseFight() {
        setDefeats(getDefeats() + 1);
    }

    public void drawFight() {
        setDraws(getDraws() + 1);
    }

    // Special Methods


    public Fighter(String name, String nationality, int age, float height,
                   float weight, int wins, int defeats, int draws) {
        // constructor method
        this.setName(name);
        this.setNationality(nationality);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.setWins(wins);
        this.setDefeats(defeats);
        this.setDraws(draws);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        setCategory();
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory() {
        if (this.getWeight() < 52.2) {
            this.category = "Invalid";
        } else if (this.getWeight() <= 40.3) {
            this.category = "Lightweight";
        } else if (this.weight <= 83.9) {
            this.category = "Middleweight";
        } else if (this.getWeight() <= 120.2) {
            this.category = "Heavyweight";
        } else {
            this.category = "invalid";
        }
    }

    public int getWins() {
        return this.wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDefeats() {
        return this.defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraws() {
        return this.draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
