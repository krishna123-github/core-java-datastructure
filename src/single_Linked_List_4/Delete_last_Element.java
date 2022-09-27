package single_Linked_List_4;

class Node {

    int data;
    Node next;

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }

}

class Linked {

    private Node getNewNode(int i) {
        Node node = new Node();
        node.data = i;
        node.next = null;
        return node;
    }

    public Node insert(int i, Node node) {
        if (node == null) {
            return getNewNode(i);
        } else {
            node.next = insert(i, node.next);
        }
        return node;
    }

    public void printLinkedList(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
        printLinkedList(node.next);
    }

    public Node delete(Node node) {
        if (node == null || node.next == null) {  // both the cases it always return null
            return null;
        }
        Node temp = node; 
        while (temp.next.next != null) {  // exampple 20 - 30 - null..here we will do 30 null
            temp = temp.next;          //  example temp = 20, 30, 40, 50
        }
        temp.next = null;  // example 20 -> 30 -> null ... ye next of 20 is become null 
        return node;
    }
}

public class Delete_last_Element {

    public static void main(String[] args) {
        Node root = new Node();
        root = null;

        Linked a = new Linked();
        root = a.insert(10, root);

        root = a.insert(20, root);
        root = a.insert(30, root);
        root = a.insert(40, root);
        root = a.insert(50, root);
        root = a.insert(60, root);
        root = a.delete(root);
        a.printLinkedList(root);
        
       
    }

}
