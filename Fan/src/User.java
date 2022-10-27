public class User {
    public static void main(String[] args) {
        Fan fan1 = new Fan();

        fan1.turnOn();
        fan1.turnOff();
        fan1.turnOn();
        fan1.turnOff();
        fan1.increaseSpeed();
        fan1.turnOn();
        fan1.turnOn();
        fan1.increaseSpeed();
        fan1.increaseSpeed();
        fan1.turnOff();


        fan1.rotateOn();


        fan1.status();

    }
}