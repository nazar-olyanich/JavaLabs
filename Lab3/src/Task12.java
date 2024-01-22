public class Task12 {
    public static void task12() {
        double epsilon = 0.01; // Задаємо точність ε
        double seriesSum = calculateSum(epsilon);
        System.out.println("12.Сума ряду з точністю ε = " + epsilon + " становить: " + seriesSum);
    }

    public static double calculateSum(double epsilon) {
        double sum = 0;
        double term;
        int i = 1;

        // Цикл для обчислення членів ряду доки вони більші за ε
        do {
            term = 1.0 / (i * (i + 1)); // Обчислення i-го члену ряду
            sum += term; // Додавання члену до суми
            i++; // Збільшення лічильника
        } while (term > epsilon); // Перевірка умови для точності

        return sum;
    }
}

