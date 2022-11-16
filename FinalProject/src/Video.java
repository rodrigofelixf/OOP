public class Video implements ActionVideo {
    // attributes
    private String title;
    private int reviews;
    private int views;
    private int likes;
    private boolean playing;

    public Video(String title) {
        this.title = title;
        this.reviews = 1;
        this.views = 0;
        this.likes = 0;
        this.playing = false;
    }

    // methods
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", reviews=" + reviews +
                ", views=" + views +
                ", likes=" + likes +
                ", playing=" + playing +
                '}';
    }

    // special methods

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReviews() {
        return this.reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isPlaying() {
        return this.playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}
