package Doubly_Linked_List;

import javafx.scene.shape.Line;

public class InsertLinkedList {

    Node firstNode, LastNode;

    public InsertLinkedList() {
        this.firstNode = null;
        this.LastNode = null;
    }

    // insert element at begining of the linked list

    void insertBigining(int value) {
        Node node = new Node(value);

        if (firstNode == null) {
            firstNode = LastNode = node;
            System.out.println("Node Created Successfully" + node);
        } else {
            node.prev = null;
            node.next = firstNode;
            firstNode.prev = node;
            firstNode = node;
        }
    }

    // insert element at End of tha linkList.

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

    //insert

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

class TestLinkedList {

    public static void main(String[] args) {
        InsertLinkedList a = new InsertLinkedList();
        a.insertBigining(100);
        a.insertBigining(200);
        a.insertBigining(300);
        a.insertBigining(400);
        a.print();
        a.insertEnd(1000);
        System.out.println("-----------------------------");
        a.print();
    }
}
