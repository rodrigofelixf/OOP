import java.util.Random;

public class Card {
    //  Attributes
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;

    // Methods

    public void scheduleFight(Fighter f1, Fighter f2) {
        if (f1.getCategory().equals(f2.getCategory()) && (f1 != f2)){
            this.setApproved(true);
            this.setChallenged(f1);
            this.setChallenger(f2);
        } else {
            this.setApproved(false);
            this.setChallenged(null);
            this.setChallenger(null);
        }
    }

    public void fight() {
        if (isApproved()){
            System.out.println("## Chanllenged ###");
            getChallenged().show();
            System.out.println("## Chanllenger ###");
            getChallenger().show();

            Random aleatory = new Random();
            int win = aleatory.nextInt(3);

            switch (win) {
                case 0 -> { //draw
                    System.out.println("Draw fight");
                    this.getChallenged().drawFight();
                    this.getChallenger().drawFight();
                }
                case 1 -> { // Challenged victory
                    System.out.println("------------");
                    System.out.println(this.getChallenged().getName() + " Win!");
                    System.out.println("------------");
                    this.getChallenged().winFight();
                    this.getChallenger().loserFight();
                }
                case 2 -> { // Challenger victory
                    System.out.println("------------");
                    System.out.println(this.getChallenger().getName() + " Win!");
                    System.out.println("------------");
                    this.getChallenger().winFight();
                    this.getChallenged().loserFight();
                }
            }
        } else {
            System.out.println("Fight can't happen! ");
        }
    }

    // Methods


    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return this.approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
