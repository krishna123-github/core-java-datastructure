package Doubly_Linked_List;

public class DeleteGivenPosition {

    Node firstNode;

    public DeleteGivenPosition() {
        this.firstNode = null;
    }

    public void insertAtEnd(int data) {
        Node node = new Node(data);
        if (firstNode == null) {
            firstNode = node;
            return;
        } else {
            Node current = firstNode;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.prev = current;
        }
    }
    
    void deleteFromGivenPosition(int position) {
        if(firstNode == null){
            return;
        }
        if(position < 0 || position > size()){
            return;
        }
        
        Node current = firstNode;
        int i = 1;
        while(i < position){
           current = current.next;
           i++;
        }
        if(current.next == null){
            current.prev.next = null;
        }
        else if(current.prev == null){
            current = current.next;
            current.prev  = null;
            firstNode = current ;
        }
        else{
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }
    
    private int size() {
        int size = 0;
        Node current = firstNode;
        if (firstNode == null) {
            return 0;
        }
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public void print() {
        Node current = firstNode;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("size = " + size());
    }
}

class TestDeleteAtPosition{
    public static void main(String[] args) {
        DeleteGivenPosition d  = new DeleteGivenPosition();
        d.insertAtEnd(10);
        d.insertAtEnd(20);
        d.insertAtEnd(30);
        d.insertAtEnd(40);
        d.insertAtEnd(50);
        d.print();
        System.out.println("-------------------");
        d.deleteFromGivenPosition(3);
        d.print();
    }
}