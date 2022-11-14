public class Main {
    public static void main(String[] args){
        Visitor v1 = new Visitor();
        Student s1 = new Student();
        Scholarship sc1 = new Scholarship();

        v1.setName("Rodrigo");
        v1.setGender("M");
        v1.setAge(28);
        System.out.println(v1.toString());

        s1.setName("Jessica");
        s1.setCourse("Nutrição");
        s1.setSubscribe(1010);
        s1.setGender("F");

        sc1.setName("Isabela");
        sc1.payMonth();


    }

}