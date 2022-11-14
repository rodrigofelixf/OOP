public class PersonProject {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student p2 = new Student();
        Professor p3 = new Professor();
        Employee p4 = new Employee();

        p1.setName("Rodrigo");
        p2.setName("Jessica");
        p3.setName("Rosana");
        p4.setName("Isabella");

        p1.setGender('M');
        p4.setGender('F');

        p3.setSalary(2000.75);
        p4.setSector("Estoque");



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());



    }
}