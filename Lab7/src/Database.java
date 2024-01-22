import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Клас для бази даних про кіно
class Database {
    private List<Movie> movies;
    private List<Actor> actors;

    public Database() {
        movies = new ArrayList<>();
        actors = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Actor> getActors() {
        return actors;
    }

    // Задача 1: Визначити, чи є актор, який не зіграв в жодному фільмі
    public Actor findActorWithNoMovies() {
        Iterator actorIterator = actors.iterator(); // нетипізований ітератор
        while (actorIterator.hasNext()) {
            Actor actor = (Actor) actorIterator.next();
            if (actor.getMovies().isEmpty()) {
                return actor; // Повертаємо актора, який не зіграв в жодному фільмі
            }
        }
        return null; // Якщо всі актори зіграли принаймні в одному фільмі
    }

    // Задача 2: Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор
    public List<Actor> findCoActors(Actor givenActor) {
        List<Actor> coActors = new ArrayList<>();
        Iterator<Movie> movieIterator = givenActor.getMovies().iterator(); // типізований ітератор
        while (movieIterator.hasNext()) {
            Movie movie = movieIterator.next();
            for (Actor actor : movie.getCast()) {
                if (!actor.equals(givenActor) && !coActors.contains(actor)) {
                    coActors.add(actor);
                }
            }
        }
        return coActors;
    }

    // Задача 3: Знайти фільм з найбільшою кількістю акторів
    public Movie findMovieWithMostActors() {
        Movie mostActorsMovie = null;
        int maxCastSize = 0;
        for (Movie movie : movies) { // типізований цикл «for-each»
            if (movie.getCast().size() > maxCastSize) {
                maxCastSize = movie.getCast().size();
                mostActorsMovie = movie;
            }
        }
        return mostActorsMovie;
    }
}
