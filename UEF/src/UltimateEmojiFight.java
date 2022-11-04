public class UltimateEmojiFight {
    public static void main(String[] args) {
        Fighter[] fighters = new Fighter[2];

        fighters[0] = new Fighter("Rodrigo", "Brasil", 28, 1.76f, 72,
                10, 0, 2);
        fighters[1] = new Fighter("Jessica", "USA", 29, 1.63f, 70,
                12, 1, 1);


        for (int i = 0; i < fighters.length; i++){
             fighters[i].show();
        }


        }



}