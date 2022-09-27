 
package Hash_Table;
 
public class LinkedHashEntry {
    String key;
    int value;
    LinkedHashEntry next;

    public LinkedHashEntry(String key, int val) {
        this.key = key;
        this.value = val;
        next = null;
    }

    @Override
    public String toString() {
        return "LinkedHashEntry{" + "key=" + key + ",    val=" + value + ",    next=" + next + '}';
    }
    
    
}
