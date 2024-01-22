import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Створюємо акторів
        Actor actor1 = new Actor("Actor 1");
        Actor actor2 = new Actor("Actor 2");
        Actor actor3 = new Actor("Actor 3");

        // Створюємо фільми
        Movie movie1 = new Movie("Movie 1");
        Movie movie2 = new Movie("Movie 2");

        // Додаємо акторів до фільмів
        movie1.addActor(actor1);
        movie1.addActor(actor2);
        movie2.addActor(actor2);
        movie2.addActor(actor3);

        // Створюємо базу даних
        Set<Movie> movieDatabase = new HashSet<>();
        movieDatabase.add(movie1);
        movieDatabase.add(movie2);

        // Виводимо інформацію про фільми та акторів
        System.out.println("Фільми та актори:");
        for (Movie movie : movieDatabase) {
            System.out.println("Фільм: " + movie.getTitle());
            for (Actor actor : movie.getCast()) {
                System.out.println("  Актор: " + actor.getName());
            }
        }

        // Приклад пошуку акторів, які не зіграли в жодному фільмі
        System.out.println("\nАктори, які не зіграли в жодному фільмі:");
        Set<Actor> allActors = new HashSet<>();
        allActors.add(actor1);
        allActors.add(actor2);
        allActors.add(actor3);
        for (Actor actor : allActors) {
            if (actor.getMovies().isEmpty()) {
                System.out.println("  Актор: " + actor.getName());
            }
        }

        // Приклад пошуку фільму з найбільшою кількістю акторів
        System.out.println("\nФільм з найбільшою кількістю акторів:");
        Movie mostCastMovie = null;
        int maxCastSize = 0;
        for (Movie movie : movieDatabase) {
            if (movie.getCast().size() > maxCastSize) {
                maxCastSize = movie.getCast().size();
                mostCastMovie = movie;
            }
        }
        if (mostCastMovie != null) {
            System.out.println("  Фільм: " + mostCastMovie.getTitle() + " з " + maxCastSize + " акторами");
        }
    }
}