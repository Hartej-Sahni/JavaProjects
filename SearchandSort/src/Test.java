import java.util.LinkedList;

public class Test {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 45, 892, 645, 90, 125, 0, -814, 9074, 8};
        int num = 645;
        /*
        if (LinearSearch.search(arr, num)) {
            System.out.println("Found " + num);
        }
        else {
            System.out.println("Did not find " + num);
        }
        num = 100;
        if (LinearSearch.search(arr, num)) {
            System.out.println("Found " + num);
        }
        else {
            System.out.println("Did not find " + num);
        }
        int[] sortedArr = {2, 45, 90, 125, 645, 892, 1000};
        num = 645;
        if (BinarySearch.search(sortedArr, num)) {
            System.out.println("Found " + num);
        }
        else {
            System.out.println("Did not find " + num);
        }
        num = 100;
        if (BinarySearch.search(sortedArr, num)) {
            System.out.println("Found " + num);
        }
        else {
            System.out.println("Did not find " + num);
        }
        */
        //SelectionSort.sort(arr);
        //BubbleSort.sort(arr);
        //InsertionSort.sort(arr);
        //ShellSort.sort(arr);
        //MergeSort.sort(arr);
        //QuickSort.sort(arr);
        HeapSort.sort(arr);
        print(arr);
    }
}
