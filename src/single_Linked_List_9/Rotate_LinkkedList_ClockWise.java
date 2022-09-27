package single_Linked_List_9;

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

    public int getSizeOfLinkedList(Node node) {
        if (node == null) {
            return 0;
        }
        return getSizeOfLinkedList(node.next) + 1;
    }

    //rotate the LinkedList Clockwise
    public Node rotateClockWise(int k, Node node) {
        if (node == null || k < 0) {
            return node;
        }
        int size = getSizeOfLinkedList(node);
        k = k % size;   // 3 % 5 = 3
        if (k == 0) {
            return node;
        }

        Node tmp1 = node;       
        int i = 1;
        while (i < size - k) {   // 1<4{tmp1=20}..2<4{tmp1=30}..3<4{tmp1=40}
            tmp1 = tmp1.next;
            i++;
        }

        Node tmp2 = tmp1.next; // tmp2 = 50
        Node head = tmp2;     // head = 50
        tmp1.next = null;      // tmp1.next=null.. it beacame last node

        while (tmp2.next != null) {  // check 50 of next != null... false
            tmp2 = tmp2.next;   
        }
        tmp2.next = node;   //null = node {10,20,30,40}
        return head;      // head = {50,10,20,30,40}
    }

    public void printLinkedList(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
    }

}

public class Rotate_LinkkedList_ClockWise {

    public static void main(String[] args) {
        Node root = new Node();
        root = null;
        Linked a = new Linked();
        int sizea = a.getSizeOfLinkedList(root);
        System.out.println("Size " + sizea);

        root = a.insert(10, root);
        root = a.insert(20, root);
        root = a.insert(30, root);
        root = a.insert(40, root);
        root = a.insert(50, root);

        root = a.rotateClockWise(3, root);
        a.printLinkedList(root);
    }

}
