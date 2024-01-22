import java.util.HashSet;
import java.util.Set;

/**
 * Клас Actor представляє актора з іменем та набором фільмів, у яких він зіграв.
 */
public class Actor {
    private String name; // Ім'я актора
    private Set<Movie> movies; // Набір фільмів, у яких актор зіграв

    /**
     * Конструктор для створення актора з вказаним іменем.
     *
     * @param name Ім'я актора.
     */
    public Actor(String name) {
        this.name = name;
        this.movies = new HashSet<>(); // Ініціалізація HashSet для унікальних фільмів
    }

    /**
     * Отримує ім'я актора.
     *
     * @return Ім'я актора.
     */
    public String getName() {
        return name;
    }

    /**
     * Отримує набір фільмів актора.
     *
     * @return Набір фільмів.
     */
    public Set<Movie> getMovies() {
        return movies;
    }

    /**
     * Додає фільм до набору фільмів, у яких актор зіграв.
     * Якщо фільм вже є в наборі, він не додається повторно.
     *
     * @param movie Фільм для додавання.
     */
    public void addMovie(Movie movie) {
        // Додавання фільму до набору, якщо він вже не міститься в ньому
        movies.add(movie);
        // Забезпечуємо зв'язок з об'єктом Movie, додаючи цього актора до фільму
        movie.addActor(this);
    }

    // Можна також додати методи equals та hashCode, якщо вони потрібні для порівняння акторів
}
