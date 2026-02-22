package domain;

public class Exercise {

    public static int[] calculate(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }

        int n = array.length;
        int[] tempArray = new int[n];

        for (int size = 1; size < n; size *= 2) {
            for (int leftStart = 0; leftStart < n; leftStart += 2 * size) {

                int mid = Math.min(leftStart + size, n);
                int rightEnd = Math.min(leftStart + 2 * size, n);

                merge(array, tempArray, leftStart, mid, rightEnd);
            }
        }

        return array;
    }

    private static void merge(int[] array, int[] tempArray,
                              int leftStart, int mid, int rightEnd) {

        int i = leftStart;
        int j = mid;
        int k = leftStart;

        while (i < mid && j < rightEnd) {
            if (array[i] <= array[j]) {
                tempArray[k++] = array[i++];
            } else {
                tempArray[k++] = array[j++];
            }
        }

        while (i < mid) {
            tempArray[k++] = array[i++];
        }

        while (j < rightEnd) {
            tempArray[k++] = array[j++];
        }

        for (int index = leftStart; index < rightEnd; index++) {
            array[index] = tempArray[index];
        }
    }
}