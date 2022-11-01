public class RemoteControl implements Controller{
    // atributes
    private int volume;
    private boolean on;
    private boolean playing;


    // Special metods
    public RemoteControl() {
        this.volume = 50;
        this.on = false;
        this.playing = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    // Abstract methods
    @Override
    public void turnOn() {
        this.setOn(true);

    }

    @Override
    public void turnOff() {
        this.setOn(false);

    }

    @Override
    public void openMenu() {
        System.out.println("Turn On? " + this.isOn());
        System.out.println("It's Playing? " + this.isPlaying());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing menu");

    }

    @Override
    public void volumeUp() {
        if (this.isOn()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void volumeDown() {
        if (this.isOn()){
        this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void muteOn() {
        if (this.isOn() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void muteOff() {
        if (this.isOn() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isOn() && !(this.isPlaying())){
            this.setPlaying(true);
        }
    }

    @Override
    public void pause() {
        if (this.isOn() && this.isPlaying()){
            this.setPlaying(false);
        }
    }


}
