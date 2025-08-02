public class Queue<T> {
    private Element<T> head;
    private Element<T> tail;
    private int size;
    private static final int MAX_SIZE = 20;

    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(T data) throws StackOverflowError {
        if (size == MAX_SIZE) {
            throw new StackOverflowError("Queue is full");
        }
        Element<T> element = new Element<T>(data);
        if (size == 0) {
            head = element;
            tail = element;
        }
        else {
            tail.setNext(element);
            tail = element;
        }
        size++;
    }

    public T dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is empty");
        }
        T data = head.getData();
        head = head.getNext();
        if (size == 1) {
            tail = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public String toString() {
        Element<T> curr = head;
        String str = "";
        while (curr != null) {
            str += curr.getData() + "\n";
            curr = curr.getNext();
        }
        return str;
    }
}
