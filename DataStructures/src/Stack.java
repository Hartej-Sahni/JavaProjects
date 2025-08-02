public class Stack<T> {
    private Element<T> top;
    private static int MAXSIZE = 10;
    private int size;

    public Stack() {
        this.top = null;
        size = 0;
    }

    public Stack(T data) {
        Element<T> newElement = new Element<T>(data);
        this.top = newElement;
        size = 1;
    }

    public Element<T> getTop() {
        return top;
    }

    public void setTop(Element<T> top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAXSIZE;
    }

    public void push(T value) throws StackOverflowError {
        if (size == MAXSIZE) {
            throw new StackOverflowError("Stack is full");
        }
        Element<T> newElement = new Element<T>(value);
        newElement.setNext(top);
        top = newElement;
        size++;
    }

    public T pop() throws Exception {
        if (size == 0) {
            throw new Exception("Stack is empty");
        }
        T data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    public String toString() {
        Element<T> curr = top;
        String stackData = "";
        while (curr != null) {
            stackData += curr.getData() + "\n";
            curr = curr.getNext();
        }
        return stackData;
    }
}
