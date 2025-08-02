public class MinBinaryHeap<T extends Comparable> extends BinaryHeap<T> {
    public MinBinaryHeap(Class<T> clazz) {
        super(clazz);
    }

    public MinBinaryHeap(Class<T> clazz, int size) {
        super(clazz, size);
    }

    protected void siftDown(int index) {
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);
        int smallerIndex = -1;
        if (leftIndex != -1 && rightIndex != -1) {
            if ((getElement(leftIndex)).compareTo(getElement(rightIndex)) < 0) {
                smallerIndex = leftIndex;
            }
            else {
                smallerIndex = rightIndex;
            }
        }
        else if (leftIndex != -1) {
            smallerIndex = leftIndex;
        }
        else if (rightIndex != -1) {
            smallerIndex = rightIndex;
        }
        if (smallerIndex == -1) {
            return;
        }
        if ((getElement(smallerIndex)).compareTo(getElement(index)) < 0) {
            swap(smallerIndex, index);
            siftDown(smallerIndex);
        }
    }

    protected void siftUp(int index) {
        int parentIndex = getParentIndex(index);
        if (parentIndex != -1 && (getElement(index)).compareTo(getElement(parentIndex)) < 0) {
            swap(parentIndex, index);
            siftUp(parentIndex);
        }
    }

    @Override
    public void insert(T value) throws HeapFullException {
        if (isFull()) {
            throw new HeapFullException("Heap is full");
        }
        arr[numNodes] = value;
        siftUp(numNodes);
        numNodes++;
    }

    @Override
    public T remove() throws HeapEmptyException {
        T min = getHighestPriority();
        if (isEmpty()) {
            throw new HeapEmptyException("Heap is empty");
        }
        arr[0] = arr[numNodes-1];
        numNodes--;
        siftDown(0);
        return min;
    }

    public T getHighestPriority() throws HeapEmptyException {
        if (isEmpty()) {
            throw new HeapEmptyException("Heap is empty");
        }
        return arr[0];
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < numNodes; i++) {
            str += arr[i] + " ";
        }
        str += "\n";
        return str;
    }
}
