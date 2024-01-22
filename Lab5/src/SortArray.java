public class SortArray {

    // Метод сортування масиву за допомогою алгоритму Bubble Sort
    public static void bubbleSort(Long[] array) {
        boolean swapped;
        // зовнішній цикл проходить через всі елементи масиву
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            // внутрішній цикл для порівняння пар сусідніх елементів
            for (int j = 0; j < array.length - i - 1; j++) {
                // якщо поточний елемент більший за наступний, міняємо їх місцями
                if (array[j] > array[j + 1]) {
                    Long temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // якщо в цьому проході не відбулося жодної заміни, масив вже відсортований
            if (!swapped) break;
        }
    }

    // Метод сортування масиву за допомогою алгоритму Selection Sort
    public static void selectionSort(Long[] array) {
        // зовнішній цикл відповідає за проходження через кожен елемент масиву
        for (int i = 0; i < array.length - 1; i++) {
            // припускаємо, що перший елемент (за індексом i) є мінімальним
            int minIndex = i;
            // внутрішній цикл шукає найменший елемент у невідсортованій частині масиву
            for (int j = i + 1; j < array.length; j++) {
                // якщо знайдений елемент менший за поточний мінімальний, оновлюємо minIndex
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // обмінюємо знайдений мінімальний елемент з першим елементом невідсортованої частини
            Long temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
