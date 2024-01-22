class Task13 {
    public static double averageOfEven(int[] array) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
}