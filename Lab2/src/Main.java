public class Main {
    public static void main(String[] args) {
        // Значення для завдання 3
        calculateAndPrint_3(1.234, -3.12, 5.45, 2.0);

        // Значення для завдання 13
        calculateAndPrint_13(-2.86, 1.62, 10.874, -2.91);

        // Значення для завдання 23
        calculateAndPrint_23(-3.45, -2.34, 1.45, 0.83);
    }

    // Метод для обчислення виразу та виведення результату
    public static void calculateAndPrint_3(double a, double b, double c, double d) {
        // Обчислення виразу (2 * sin(a) + cos(|b * sqrt(c)|))^d
        // Math.abs() використовується для взяття модуля числа
        double y = Math.pow((2 * Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c)))), d);

        // Виведення результату обчислення
        System.out.println("Завдання 3*  Для параметрів a = " + a + ", b = " + b + ", c = " + c + ", d = " + d +
                ", результат y = " + y);
    }
    // Метод для обчислення виразу та виведення результату
    public static void calculateAndPrint_13(double a, double b, double c, double d) {
        // Обчислення першої частини виразу (ln|2a| / (3 * tan(b)))
        // Math.log() використовується для обчислення натурального логарифму (ln)
        // Math.abs() використовується для взяття модуля числа
        // Math.tan() використовується для обчислення тангенсу
        double firstPart = Math.log(Math.abs(2 * a)) / (3 * Math.tan(b));

        // Обчислення другої частини виразу (sqrt(c / sqrt(|d|)))
        double secondPart = Math.sqrt(c / Math.sqrt(Math.abs(d)));

        // Обчислення кінцевого значення y
        double y = firstPart - secondPart;

        // Виведення результату обчислення
        System.out.println("Завдання 13* Для параметрів a = " + a + ", b = " + b + ", c = " + c + ", d = " + d +
                ", результат y = " + y);
    }
    // Метод для обчислення виразу та виведення результату
    public static void calculateAndPrint_23(double a, double b, double c, double d) {
        // Обчислення першої частини виразу (5 * c) / cos(a)
        // Math.cos() використовується для обчислення косинуса
        double firstPart = (5 * c) / Math.cos(a);

        // Обчислення гіперболічного синуса за допомогою Math.sinh()
        double hyperbolicSine = Math.sinh(Math.abs(b) * c);

        // Обчислення тангенса за допомогою Math.tan()
        double tangent = Math.tan(d);

        // Обчислення другої частини виразу sqrt(sinh(b * c) / tan(d))
        double secondPart = Math.sqrt(hyperbolicSine / tangent);

        // Обчислення кінцевого значення y
        double y = firstPart + secondPart;

        // Виведення результату обчислення
        System.out.println("Завдання 23* Для параметрів a = " + a + ", b = " + b + ", c = " + c + ", d = " + d +
                ", результат y = " + y);
    }
}
