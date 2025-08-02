import java.lang.reflect.Array;

public class CircularQueue<T> {
    private int headIndex;
    private int tailIndex;
    private static final int SPECIAL_VALUE = -1;
    private static final int MAX_SIZE = 5;
    private T[] elements;

    public CircularQueue(Class<T> clazz) {
        headIndex = SPECIAL_VALUE;
        tailIndex = SPECIAL_VALUE;
        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public boolean isEmpty() {
        return headIndex == SPECIAL_VALUE;
    }

    public boolean isFull() {
        int tailNextIndex = (tailIndex + 1) % elements.length;
        return tailNextIndex == headIndex;
    }

    public void enqueue(T data) throws StackOverflowError {
        if (isFull()) {
            throw new StackOverflowError("Circular queue is full");
        }
        tailIndex = (tailIndex + 1) % elements.length;
        elements[tailIndex] = data;
        if (headIndex == SPECIAL_VALUE) {
            headIndex = tailIndex;
        }
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Circular queue is empty");
        }
        T data = elements[headIndex];
        headIndex = (headIndex + 1) % elements.length;
        return data;
    }

    public String toString() {
        String str = "";
        int index = headIndex;
        while (index != tailIndex) {
            str += elements[index] + "\n";
            index = (index + 1) % elements.length;
        }
        str += elements[index] + "\n";
        return str;
    }
}
