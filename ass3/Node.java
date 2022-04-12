//Name : Thanapong Yamkamol
//ID : 642115022

public class Node {
    private ifTopf data;
    private Node next;

    public Node(ifTopf data) {
        setData(data);
        setNext(null);
    }

    public void setData(ifTopf data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public ifTopf getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public String toString() {
        if (data == null)
            return "Node: null";
        else
            return "Node: " + data.toString();
    }
}
