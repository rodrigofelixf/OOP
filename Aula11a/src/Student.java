public class Student extends Person{
    private int subscribe;
    private String course;

    public void payMonth() {
        System.out.println("Pagando");
    }

    public int getSubscribe() {
        return this.subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
