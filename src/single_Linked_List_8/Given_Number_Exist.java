
package single_Linked_List_8;
class Node{
    
    int data;
    Node next;

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }
}
class Linked{
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
    public boolean ifNodeExist(int value , Node node){
        if(node == null){  // first check node is null ..
            return false;  // true then return the false
        }
        while(node != null){   // loop when node equals to null
            if(node.data == value){  //checking the data in node to given value
                return true;    //if true..then it will return the true.
            }                                   
            node = node.next;  //if false then..then again while loop will work..store next node
        }       
        return false;
    }
}
public class Given_Number_Exist { 
    public static void main(String[] args) {
         Node root = new Node();
        root = null;
        Linked a = new Linked();

        root = a.insert(10, root);
        root = a.insert(20, root);
        root = a.insert(30, root);
        root = a.insert(40, root);
        boolean ifExits = a.ifNodeExist(30 , root);
        System.out.println(ifExits);
    }
    
}
