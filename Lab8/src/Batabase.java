import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Database {
    private Map<String, Movie> movies;
    private Map<String, Actor> actors;

    public Database() {
        movies = new HashMap<>();
        actors = new HashMap<>();
    }

    public void addActor(Actor actor) {
        actors.putIfAbsent(actor.getName(), actor);
    }

    public void addMovie(Movie movie) {
        movies.putIfAbsent(movie.getTitle(), movie);
    }

    public Actor findActorWithNoMovies() {
        Iterator<Actor> actorIterator = actors.values().iterator(); // нетипізований ітератор
        while (actorIterator.hasNext()) {
            Actor actor = actorIterator.next();
            if (actor.getMovies().isEmpty()) {
                return actor; // Повертаємо актора, який не зіграв в жодному фільмі
            }
        }
        return null; // Якщо всі актори зіграли принаймні в одному фільмі
    }

    public Set<Actor> findCoActors(String actorName) {
        Set<Actor> coActors = new HashSet<>();
        Actor givenActor = actors.get(actorName);
        if (givenActor == null) {
            return coActors; // Якщо заданого актора немає, повертаємо порожню множину
        }
        for (Movie movie : givenActor.getMovies()) {
            coActors.addAll(movie.getCast()); // Додаємо усіх акторів з фільму
        }
        coActors.remove(givenActor); // Видаляємо самого актора з множини
        return coActors;
    }

    public Movie findMovieWithMostActors() {
        Movie mostActorsMovie = null;
        int maxCastSize = 0;
        for (Movie movie : movies.values()) {
            int castSize = movie.getCast().size();
            if (castSize > maxCastSize) {
                maxCastSize = castSize;
                mostActorsMovie = movie;
            }
        }
        return mostActorsMovie;
    }
}

