import java.util.HashSet;
import java.util.Set;

/**
 * Клас представляє фільм з набором акторів.
 */
public class Movie {
    private String title;
    private Set<Actor> cast;

    /**
     * Конструктор для створення фільму з заданою назвою.
     * @param title Назва фільму.
     */
    public Movie(String title) {
        this.title = title;
        this.cast = new HashSet<>(); // Ініціалізація HashSet для зберігання акторів.
    }

    /**
     * Повертає назву фільму.
     * @return Назва фільму.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Повертає набір акторів, які знялися у фільмі.
     * @return Набір акторів фільму.
     */
    public Set<Actor> getCast() {
        return cast;
    }

    /**
     * Додає актора до фільму. Якщо актор вже знаходиться у фільмі, він не буде доданий повторно.
     * @param actor Актор, якого потрібно додати до фільму.
     */
    public void addActor(Actor actor) {
        // Додавання актора до набору, якщо він ще не присутній у фільмі.
        cast.add(actor);
    }

    /**
     * Видаляє актора з фільму.
     * @param actor Актор, якого потрібно видалити з фільму.
     */
    public void removeActor(Actor actor) {
        // Видалення актора з набору, якщо він присутній у фільмі.
        cast.remove(actor);
    }
}

