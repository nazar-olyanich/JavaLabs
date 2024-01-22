public class Task10 {
    public static void task10() {
        // Приклад вхідних даних
        double t = -1; // t < 0
        int n = 10;    // Деяке додатне ціле число n

        double result = calculateFunction(t, n);
        System.out.println("10.Результат функції x(t, n) для t = " + t + " та n = " + n + " становить: " + result);

        // Змінимо значення t для випадку t >= 0
        t = 1; // t >= 0

        result = calculateFunction(t, n);
        System.out.println("10.Результат функції x(t, n) для t = " + t + " та n = " + n + " становить: " + result);
    }

    public static double calculateFunction(double t, int n) {
        double sum = 0;

        if (t < 0) {
            // Виконуємо сумування для t < 0
            for (int i = 1; i <= n; i++) {
                sum += i * i; // i^2
            }
        } else {
            // Виконуємо сумування для t >= 0
            for (int i = 1; i <= n; i++) {
                sum += Math.sqrt(i); // √i
            }
        }

        return sum;
    }
}
