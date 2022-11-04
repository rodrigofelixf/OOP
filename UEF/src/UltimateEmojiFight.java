public class UltimateEmojiFight {
    public static void main(String[] args) {
        Fighter[] fighters = new Fighter[2];

        fighters[0] = new Fighter("Rodrigo", "Brasil", 28, 1.76f, 72,
                10, 0, 2);
        fighters[1] = new Fighter("Jessica", "USA", 29, 1.63f, 70,
                12, 1, 1);

        Card UEC01 = new Card(); // Objeto da luta (Como se fosse um card do UFC)


        // Marcação de luta e luta.
        UEC01.scheduleFight(fighters[0], fighters[1]);
        UEC01.fight();
        fighters[0].status();
        fighters[1].status();
    }
}
