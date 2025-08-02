public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void addElement(T element) {
        if (head == null) {
            head = new Node<T>(element);
        }
        else {
            Node<T> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node<T>(element));
        }
        size++;
    }

    public void removeElement(int indexToBeRemoved) {
        if (head == null) {
            return;
        }
        if (indexToBeRemoved < 0 || indexToBeRemoved > size - 1) {
            return;
        }
        if (indexToBeRemoved == 0) {
            head = head.getNext();
            return;
        }
        int index = 0;
        Node<T> curr = head;
        while (index < indexToBeRemoved - 1 && curr != null) {
            index++;
            curr = curr.getNext();
        }
        if (curr.getNext() != null) {
            curr.setNext(curr.getNext().getNext());
        }
        else {
            curr.setNext(null);
        }
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        Node<T> curr = head;
        String listStr = "";
        while (curr != null) {
            listStr += curr.toString() + "\n";
            curr = curr.getNext();
        }
        return listStr;
    }
}
