public class Gafanhoto extends Person{
    private String login;
    private int totWatch;

    public Gafanhoto(String name, int age, char gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.totWatch = 0;
    }

    public void watchMore() {

    }

    // special methods
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotWatch() {
        return this.totWatch;
    }

    public void setTotWatch(int totWatch) {
        this.totWatch = totWatch;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totWatch=" + totWatch +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", xp=" + xp +
                '}';
    }
}
