public class HeapSort {
    public static void sort(int[] arr) {
        heapify(arr, arr.length - 1);
        int endIndex = arr.length-1;
        while (endIndex > 0) {
            swap(arr, 0, endIndex);
            endIndex--;
            percolateDown(arr, 0, endIndex);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int getLeftChildIndex(int index, int endIndex) {
        int leftIndex = 2*index + 1;
        if (leftIndex > endIndex) {
            return -1;
        }
        return leftIndex;
    }

    private static int getRightChildIndex(int index, int endIndex) {
        int rightIndex = 2*index + 2;
        if (rightIndex > endIndex) {
            return -1;
        }
        return rightIndex;
    }

    private static int getParentIndex(int index, int endIndex) {
        int parentIndex = (index - 1) / 2;
        if (index < 0 || index > endIndex) {
            return -1;
        }
        return parentIndex;
    }

    private static void heapify(int[] arr, int endIndex) {
        int index = getParentIndex(endIndex, endIndex);
        while (index >= 0) {
            percolateDown(arr, index, endIndex);
            index--;
        }
    }

    private static void percolateDown(int[] arr, int index, int endIndex) {
        int leftIndex = getLeftChildIndex(index, endIndex);
        int rightIndex = getRightChildIndex(index, endIndex);
        if (leftIndex != -1 && arr[leftIndex] > arr[index]) {
            swap(arr, leftIndex, index);
            percolateDown(arr, leftIndex, endIndex);
        }
        if (rightIndex != -1 && arr[rightIndex] > arr[index]) {
            swap(arr, rightIndex, index);
            percolateDown(arr, rightIndex, endIndex);
        }
    }
}
