import java.util.ArrayList;
import java.util.List;

// Клас для представлення актора
class Actor {
    private String name;
    private List<Movie> movies;

    public Actor(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
        }
    }
}