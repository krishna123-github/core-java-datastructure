package single_Linked_List_3;

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
            Node n = getNewNode(i);
            return n;
        } else {
            node.next = insert(i, node.next);
        }
        return node;
    }

    public void printLinkedList(Node nodes) {
        if (nodes == null) {
            return;
        }
        System.out.println(nodes);
        printLinkedList(nodes.next); // recursively call
    }
// main logic with cases ....inserting the value at given position 
    public Node insertAtGivenPosition(int i, int position, Node node) {
        if (position < 0) {   // enter position less then 0 index
            return node;
        }
        if (position > 1 && node == null) {    //enter position is out of range
            System.out.println("position is greater then element exits");
            return node;
        }
        if (position == 1 && node == null) {   //position is 1..node null h ..
            node = getNewNode(i);
            return node;
        }
        if (position == 1) {  // position equals to 1 then create new node..
            Node newNode = getNewNode(i);
            newNode.next = node;   // adding the its next node to Right side of new node
            return newNode;
        }
        // here every chance position decrease from 3 till get 1... and node will next forward
        // recursive call to itself
        node.next = insertAtGivenPosition(i, position - 1, node.next);
        return node;
    }
}

public class Insert_element_GivenPosition {

    public static void main(String[] args) {
        Node root = new Node();
        root = null;
        Linked a = new Linked();
        root = a.insert(10, root);
        root = a.insert(20, root);
        root = a.insert(30, root);
        root = a.insert(40, root);

        root = a.insertAtGivenPosition(66, 3, root);

        a.printLinkedList(root);
    }

}
