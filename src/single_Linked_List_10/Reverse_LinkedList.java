package single_Linked_List_10;

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
    // main logic for reverse the LinkedList
    public Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node;       // it jjust return the last Item..which have next to next is null {40 - 50 } will return
        }
        Node temp = reverse(node.next);      //  temp hold {40 - 50 - null}
        node.next.next = node;         // the next next of 40 is null.... here it will be like this ..40- 50 - 40 - 50 - null
        node.next = null;       // here next to 40 - null
        return temp;
    }

    public void printLinkedList(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
    }
}

public class Reverse_LinkedList {

    public static void main(String[] args) {
        Node root = new Node();
        root = null;
        Linked a = new Linked();

        root = a.insert(10, root);
        root = a.insert(20, root);
        root = a.insert(30, root);
//        root = a.insert(40, root);
//        root = a.insert(50, root);
        
        root = a.reverse(root);
        a.printLinkedList(root);
    }

}
