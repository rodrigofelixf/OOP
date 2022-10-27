public class Fan {
    String model;
    String color;
    int size;
    int speed;
    boolean on;
    boolean rotation;

    void status(){
        System.out.println("Fan is on? " + this.on);
        System.out.println("Fan is spinning? " + this.rotation);
        System.out.println("Fan speed: " + this.speed);
    }


    void turnOn() {
        on = true;
        if (on) {
            speed = 1;
        }
    }

    void turnOff() {
        on = false;
        if (!on){
            speed = 0;
        }
    }

    void increaseSpeed(){
        if (on) {
            speed++;
        } else {
            System.out.println("ERROR: Fan turn off");
        }
    }

    void decreaseSpeed() {
        speed--;
    }

    void rotateOn() {
        if (on) {
            rotation = true;
        } else {
            System.out.println("ERROR: Fan turn off");
        }
    }

    void rotateOff() {
        rotation = false;
    }
}
