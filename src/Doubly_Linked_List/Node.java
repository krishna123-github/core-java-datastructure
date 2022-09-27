package Doubly_Linked_List;

public class Node {

    Node prev;
    int data;
    Node next;

    // use  to create the new  node 
    public Node(int data) {
        prev = null;
        this.data = data;
        next = null;
    }

    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkedList{" + "prev=" + prev + ", data=" + data + ", next=" + next + '}';
    }

}
