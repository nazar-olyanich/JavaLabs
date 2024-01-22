class Task66 {
    public static int[] mergeArrays(int[] arrayA, int[] arrayB) {
        int[] mergedArray = new int[arrayA.length + arrayB.length];
        System.arraycopy(arrayA, 0, mergedArray, 0, arrayA.length);
        System.arraycopy(arrayB, 0, mergedArray, arrayA.length, arrayB.length);
        return mergedArray;
    }
}