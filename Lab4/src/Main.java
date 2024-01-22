public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Середнє арифметичне парних елементів масиву: " + Task13.averageOfEven(array));
        System.out.println("Сума найбільшого та найменшого елементів масиву, індекс яких кратний 2: " + Task43.sumOfExtremes(array));

        int[] arrayA = {1, 3, 5, 7, 9};
        int[] arrayB = {2, 4, 6, 8, 10};
        int[] mergedArray = Task66.mergeArrays(arrayA, arrayB);
        System.out.print("Об'єднаний масив: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
