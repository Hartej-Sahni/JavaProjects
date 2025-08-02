public class BinarySearch {
    public static boolean search(int[] arr, int num) {
        int mid = arr.length/2;
        if (arr.length == 1) {
            if (num == arr[mid]) {
                return true;
            }
            return false;
        }
        if (num == arr[mid]) {
            return true;
        }
        else if (num < arr[mid]) {
            int[] lowerHalf = new int[mid];
            for (int i = 0; i < mid; i++) {
                lowerHalf[i] = arr[i];
            }
            return search(lowerHalf, num);
        }
        else {
            int upperHalfLength = arr.length % 2 == 0 ? (mid - 1) : mid;
            int[] upperHalf = new int[upperHalfLength];
            for (int i = mid + 1; i < arr.length; i++) {
                upperHalf[i-mid-1] = arr[i];
            }
            return search(upperHalf, num);
        }
    }
}
