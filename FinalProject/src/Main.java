public class Main {
    public static void main(String[] args) {
       Video v[] = new Video[3];

       v[0] = new Video("Aula 1 de POO");
       v[1] = new Video("Aula 12 de PHP");
       v[2] = new Video("Aula 10 de HTML5");

       Gafanhoto g[] = new Gafanhoto[2];
       g[0] = new Gafanhoto("Rodrigo", 28, 'M', "cadeturodrigo");
       g[1] = new Gafanhoto("Jessica", 29, 'F', "jesspatricia");


       System.out.println(g[0].toString());

        Views vs = new Views(g[0],v[2]);
        Views vs1 = new Views(g[0],v[1]);

        System.out.println(vs.toString());
    }
}