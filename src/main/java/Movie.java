public class Movie {
    private String title;
    private int release;
    private String director;

    public Movie(String title, int release, String director) {
        this.title = title;
        this.release = release;
        this.director = director;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
