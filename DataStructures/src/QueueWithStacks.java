public class QueueWithStacks<T> {
    private Stack<T> forwardStack;
    private Stack<T> reverseStack;

    public QueueWithStacks() {
        forwardStack = new Stack<T>();
        reverseStack = new Stack<T>();
    }

    public boolean isFull() {
        return forwardStack.isFull() || reverseStack.isFull();
    }

    public boolean isEmpty() {
        return forwardStack.isEmpty() && reverseStack.isEmpty();
    }

    public void enqueue(T data) throws Exception {
        if (forwardStack.isFull()) {
            throw new Exception("Queue is full");
        }
        forwardStack.push(data);
    }

    public T dequeue() throws Exception {
        if (forwardStack.isEmpty()) {
            throw new Exception("Queue is empty");
        }
        while (!forwardStack.isEmpty()) {
            reverseStack.push(forwardStack.pop());
        }
        T data = reverseStack.pop();
        while (!reverseStack.isEmpty()) {
            forwardStack.push(reverseStack.pop());
        }
        return data;
    }

    public String toString() {
        String str = "";
        try {
            while (!forwardStack.isEmpty()) {
                reverseStack.push(forwardStack.pop());
            }
            while (!reverseStack.isEmpty()) {
                T data = reverseStack.pop();
                forwardStack.push(data);
                str += data + "\n";
            }
        }
        catch (Exception e) {
            return "There is something wrong with this queue";
        }
        return str;
    }
}
