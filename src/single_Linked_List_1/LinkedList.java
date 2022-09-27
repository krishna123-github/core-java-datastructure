
package single_Linked_List_1;
// defining that every node in linked list have data and address of next
class Node{
   int data;
   Node next;

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }
   
}
// here we define all operation 
class Linked{
    private Node getNewNode(int i){
        Node node = new Node();
        node.data = i ;
        node.next = null;
        return  node;
    }
    public Node insert(int i, Node node){
        if(node == null){      // node is null then create new node contain value i but not have next node address
            return getNewNode(i);
        }
        else{
            node.next = insert(i, node.next); //recursive till node will get null
        }
        return node;
    }
    public void printLinkedList(Node node){
        if(node == null){
            return;
        }
        System.out.println(node);
        printLinkedList(node.next);
    }
  
}

public class LinkedList {
    public static void main(String[] args) {
        Node root = null;
        Linked a = new Linked();
        root = a.insert(12, root);
        root = a.insert(30, root);
        root = a.insert(44, root);
        root = a.insert(66, root);
        
        a.printLinkedList(root);
       
    }
    
}
