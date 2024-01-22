public class Main {
    public static void main(String[] args) {
        // Створення та ініціалізація масиву Long[]
        Long[] array = {3L, 1L, 4L, 1L, 5L, 9L, 2L, 6L, 5L, 3L};

        // Демонстрація роботи методу bubbleSort
        System.out.println("Оригінальний масив для Bubble Sort:");
        printArray(array);

        SortArray.bubbleSort(array);

        System.out.println("Відсортований масив Bubble Sort:");
        printArray(array);

        // Скидання масиву до оригінального стану
        Long[] arrayForSelectionSort = {3L, 1L, 4L, 1L, 5L, 9L, 2L, 6L, 5L, 3L};

        // Демонстрація роботи методу selectionSort
        System.out.println("Оригінальний масив для Selection Sort:");
        printArray(arrayForSelectionSort);

        SortArray.selectionSort(arrayForSelectionSort);

        System.out.println("Відсортований масив Selection Sort:");
        printArray(arrayForSelectionSort);
    }

    // Метод для друку елементів масиву
    public static void printArray(Long[] array) {
        for (Long element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}