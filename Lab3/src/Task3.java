public class Task3 {
    public static void task3() {
        int k = 14;  // k задано менше 15
        double seriesSum = calculateSeries(k);
        System.out.println("3.Сума ряду для k = " + k + " становить: " + seriesSum);
    }

    // Метод для обчислення суми ряду Завдання №3
    public static double calculateSeries(int k) {
        if (k >= 15) {
            throw new IllegalArgumentException("k має бути менше 15");
        }

        double seriesSum = 0;
        // Цикл для обчислення суми ряду
        for (int i = 1; i <= k; i++) {
            seriesSum += 1 / Math.sqrt(i) + Math.tan((double) k / i);
        }

        return seriesSum;
    }
}
