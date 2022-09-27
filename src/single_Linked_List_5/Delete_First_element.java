package single_Linked_List_5;

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
            node.next = insert(i, node.next);
        }
        return node;
    }

    // delete First Element 
    public Node deleteFirstElement(Node node) {
        if (node == null) {
            return null;
        }
        node = node.next; // it  will remove the  head node .. and store the value of next node of head in node variable
        return node;  //it will successfully retuen the node having head node 20
    }

    public void printLinkedList(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
//        printLinkedList(node.next);
    }
}

public class Delete_First_element {

    public static void main(String[] args) {
        Node root = new Node();
        root = null;
        Linked a = new Linked();
        // cheking head node is null
        root = a.deleteFirstElement(root);
        // inserting the element in LinkedList 
        root = a.insert(10, root);
        root = a.insert(20, root);
        root = a.insert(30, root);
        root = a.insert(40, root);
        
        a.printLinkedList(root);
        // calling the  delete function in Linled Class
        root = a.deleteFirstElement(root);   // it will is will get the node  except head.
        a.printLinkedList(root);
    }

}
