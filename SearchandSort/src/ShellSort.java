public class ShellSort {
    private static void insertionSort(int[] arr, int startIndex, int increment) {
        for (int i = startIndex; i < arr.length-increment+startIndex; i += increment) {
            for (int j = i+increment; j - increment + 1 > 0; j -= increment) {
                if (arr[j] < arr[j-increment]) {
                    int temp = arr[j];
                    arr[j] = arr[j-increment];
                    arr[j-increment] = temp;
                }
                else {
                    break;
                }
            }
        }
    }

    public static void sort(int[] arr) {
        int increment = arr.length/2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(arr, startIndex, increment);
            }
            increment /= 2;
        }
    }
}
