import java.lang.reflect.Array;

public abstract class BinaryHeap<T extends Comparable> {
    private static int MAX_SIZE = 10;
    protected T[] arr;
    protected int numNodes = 0;

    public BinaryHeap(Class<T> clazz) {
        this(clazz, MAX_SIZE);
    }

    public BinaryHeap(Class<T> clazz, int size) {
        if (size < MAX_SIZE) {
            arr = (T[]) Array.newInstance(clazz, size);
        }
        else {
            arr = (T[]) Array.newInstance(clazz, MAX_SIZE);
        }
    }

    public boolean isEmpty() {
        return numNodes == 0;
    }

    public boolean isFull() {
        return numNodes == arr.length;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public T getElement(int index) {
        return arr[index];
    }

    public void swap(int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public int getLeftChildIndex(int index) {
        int leftIndex = 2*index + 1;
        if (leftIndex >= numNodes) {
            return -1;
        }
        return leftIndex;
    }

    public int getRightChildIndex(int index) {
        int rightIndex = 2*index + 2;
        if (rightIndex >= numNodes) {
            return -1;
        }
        return rightIndex;
    }

    public int getParentIndex(int index) {
        if (index < 0 || index > numNodes) {
            return -1;
        }
        int parentIndex = (index-1) / 2;
        return parentIndex;
    }

    public abstract void insert(T value) throws HeapFullException;
    public abstract T remove() throws HeapEmptyException;
}
