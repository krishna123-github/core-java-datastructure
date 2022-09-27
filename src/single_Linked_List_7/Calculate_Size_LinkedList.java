package single_Linked_List_7;

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
        Node n = new Node();
        n.data = i;
        n.next = null;
        return n;
    }

    public Node insert(int i, Node node) {
        if (node == null) {
            return getNewNode(i);
        } else {
            node.next = insert(i, node.next);  // recursively call
        }
        return node;
    }

    public int getSize(Node node) {
        if (node == null) {
            return 0;
        }
        return getSize(node.next) + 1;   // recursively calling to own..and return int values
    }

    public void printLinkedList(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
    }
}

public class Calculate_Size_LinkedList {

    public static void main(String[] args) {
        Node root = new Node();
        root = null;
        Linked a = new Linked();
        int sizea = a.getSize(root);
        System.out.println("Size " + sizea);

        root = a.insert(10, root);
        root = a.insert(20, root);
        root = a.insert(30, root);
        root = a.insert(40, root);

        a.printLinkedList(root);
        
        int size = a.getSize(root);
        System.out.println("Size " + size);
    }

}
