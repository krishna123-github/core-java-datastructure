package single_Linked_List_6;

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

    public Node DeleteElementGivenPosition(int position, Node node) {
        if (position < 0) {
            System.out.println("Not valid postion");
            return node;
        }
        if (node == null && position > 1) {
            System.out.println("Not valid position");
            return node;
        }
        if (position == 1) {
            return node.next;
        }
        node.next = DeleteElementGivenPosition(position - 1, node.next);
        return node;
    }

    public void printLinkedList(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
//        printLinkedList(node.next);
    }
}

public class Delete_Element_GivenPosition {

    public static void main(String[] args) {
        Node root = new Node();
        root = null;
        Linked a = new Linked();
        //
        a.DeleteElementGivenPosition(2, root);
        root = a.insert(10, root);
        root = a.insert(20, root);
        root = a.insert(30, root);
        root = a.insert(40, root);

        a.printLinkedList(root);
        root = a.DeleteElementGivenPosition(3, root);
        a.printLinkedList(root);
    }

}
