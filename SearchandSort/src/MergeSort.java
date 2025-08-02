public class MergeSort {
    private static void split(int[] arr, int[] left, int[] right) {
        for (int i = 0; i < arr.length; i++) {
            if (i < left.length) {
                left[i] = arr[i];
            }
            else {
                right[i-left.length] = arr[i];
            }
        }
    }

    private static void merge(int[] merged, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                merged[mergedIndex] = left[leftIndex];
                leftIndex++;
            }
            else  {
                merged[mergedIndex] = right[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }
        while (leftIndex < left.length) {
            merged[mergedIndex] = left[leftIndex];
            leftIndex++;
            mergedIndex++;
        }
        while (rightIndex < right.length) {
            merged[mergedIndex] = right[rightIndex];
            rightIndex++;
            mergedIndex++;
        }
    }

    public static void sort(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        int splitIndex = arr.length/2;
        int[] left = new int[splitIndex];
        int[] right = new int[arr.length-splitIndex];
        split(arr, left, right);
        sort(left);
        sort(right);
        merge(arr, left, right);
    }
}
