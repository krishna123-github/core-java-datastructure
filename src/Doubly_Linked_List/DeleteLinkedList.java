package Doubly_Linked_List;

public class DeleteLinkedList {

    Node firstNode;

    public DeleteLinkedList() {
        this.firstNode = null;
    }

    public void Insert(int data) {
        Node node = new Node(data);
        if (firstNode == null) {
            firstNode = node;
            System.out.println(" First Node is Created");
        } else {
            Node current = firstNode;
            while (current.next != null) {
                current = current.next;
            }
            node.prev = current;
            current.next = node;
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

    // delete Node from the Begining 

    public void deleteFirstNode() {
        Node current = firstNode;
        if (current == null) {
            firstNode = null;
            return;
        }
        current = firstNode.next;
        current.prev = null;
        firstNode = current;
    }

    // delete the node from the End 

    public void deleteLastNode() {
        Node current = firstNode;
        if (current == null || current.next == null) {
            firstNode = null;
            return;
        }
      
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void print() {
        Node current = firstNode;
        if (current == null) {
            System.out.println("null");
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Size = " + size());
    }
}

class TestDelete {

    public static void main(String[] args) {
        DeleteLinkedList d = new DeleteLinkedList();
        //first check the Null..
        d.deleteFirstNode();
        d.print();
        
        d.Insert(100);
        d.Insert(200);
        d.Insert(300);
        d.Insert(400);
        d.print();   // print the whole Linked List 
        System.out.println("-----------");
      
        // delete the first node
        d.deleteFirstNode();
        d.print();   // print the remaining node after deleting fiirst node
        System.out.println("-----------");
       
        // delete the last node
        d.deleteLastNode();
        d.print();   // print the remaining linked List after deleting tge last node
        System.out.println("-----------");
        d.deleteLastNode();
        d.print();
        System.out.println("-----------");
        d.deleteLastNode();
        d.print();
    }
}
