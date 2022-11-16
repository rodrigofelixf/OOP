public class Views {
    private Gafanhoto viewer;
    private Video movie;

    public Views(Gafanhoto viewer, Video movie) {
        this.viewer = viewer;
        this.movie = movie;
        this.viewer.setTotWatch(this.viewer.getTotWatch() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }

    public Gafanhoto getViewer() {
        return viewer;
    }

    public void setViewer(Gafanhoto viewer) {
        this.viewer = viewer;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Views{" +
                "viewer=" + viewer +
                ", movie=" + movie +
                '}';
    }
}
