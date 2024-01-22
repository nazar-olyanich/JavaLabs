import java.util.List;
// Демонстрація роботи системи
public class Main {
    public static void main(String[] args) {
        // Створення бази даних
        Database database = new Database();

        // Додавання акторів та фільмів
        Actor actor1 = new Actor("Actor 1");
        Actor actor2 = new Actor("Actor 2");
        Movie movie1 = new Movie("Movie 1");
        movie1.addActor(actor1);
        movie1.addActor(actor2);

        // Додавання до бази даних
        database.getActors().add(actor1);
        database.getActors().add(actor2);
        database.getMovies().add(movie1);

        // Задача 1
        Actor actorWithNoMovies = database.findActorWithNoMovies();
        System.out.println("Актор без фільмів: " + (actorWithNoMovies != null ? actorWithNoMovies.getName() : "немає"));

        // Задача 2
        List<Actor> coActors = database.findCoActors(actor1);
        System.out.println("Співактори для " + actor1.getName() + ": " + coActors.stream().map(Actor::getName).toList());

        // Задача 3
        Movie movieWithMostActors = database.findMovieWithMostActors();
        System.out.println("Фільм з найбільшою кількістю акторів: " + (movieWithMostActors != null ? movieWithMostActors.getTitle() : "немає"));
    }
}