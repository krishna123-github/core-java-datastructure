package Doubly_Linked_List;

public class InsertGivenPosition {

    Node firstNode, LastNode;

    public InsertGivenPosition() {
        this.firstNode = null;
        this.LastNode = null;
    }

    void insertEnd(int value) {
        Node node = new Node(value);
        if (firstNode == null) {
            firstNode = LastNode = node;
            System.out.println("Node Created Successfully" + node);
        } else {
            Node current = firstNode;
            while (current.next != null) {
                current = current.next;
            }
            node.prev = current;
            current.next = node;
        }
    }

    //insert data  at given position 
    public void insertAtPosition(int data, int position) {

        if (position < 0 || position > size()) {
            return;
        }
        Node current = firstNode;
        int i = 1;
        while (i < position) {
            current = current.next;
            i++;
        }

        if (current.prev == null) {
            Node node = new Node(data);
            current.prev = node;
            node.next = current;
            firstNode = node;
        } else {
            Node newNode = new Node(current.prev, data, current);
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    public int size() {
        int size = 0;
        Node current = firstNode;
        if (current == null) {
            return 0;
        }
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    void print() {
        Node current = firstNode;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Size = " + size());
    }
}

class TestInsertList {

    public static void main(String[] args) {
        InsertGivenPosition a = new InsertGivenPosition();

        a.insertEnd(10);
        a.insertEnd(20);
        a.insertEnd(30);
        a.insertEnd(40);
        a.insertEnd(50);
        System.out.println("-----------------------------");
        a.print();
        a.insertAtPosition(99, 3);
        System.out.println("-----------------------------");
        a.print();
    }
}
