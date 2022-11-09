public class Student extends Person {
    private int registry;
    private String course;

    // methods

    public void unSubscribe () {
        System.out.println("Matricula será cancelada");
    }

    // special methods

    public int getRegistry() {
        return this.registry;
    }

    public void setRegistry(int registry) {
        this.registry = registry;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
