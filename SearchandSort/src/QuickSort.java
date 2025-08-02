public class QuickSort {
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int l = low;
        int h = high;
        while (l < h) {
            while (arr[l] <= pivot && l < h) {
                l++;
            }
            while (arr[h] > pivot && h >= l) {
                h--;
            }
            if (l < h) {
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[h];
        arr[h] = temp;
        return h;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex-1);
        quickSort(arr, pivotIndex+1, high);
    }

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }
}
