import java.util.ArrayList;
import java.util.List;
// Клас для представлення фільму
class Movie {
    private String title;
    private List<Actor> cast;

    public Movie(String title) {
        this.title = title;
        this.cast = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Actor> getCast() {
        return cast;
    }

    public void addActor(Actor actor) {
        if (!cast.contains(actor)) {
            cast.add(actor);
            actor.addMovie(this);
        }
    }
}
