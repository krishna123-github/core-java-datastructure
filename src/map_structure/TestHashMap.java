
package map_structure;

import java.util.HashMap;
 
public class TestHashMap {
    public static void main(String[] args) {
        HashMap  map = new HashMap();
        map.put(new Key("Vishal"),20);
        map.put(new Key("Sachin"),30);
        map.put(new Key("Krishna"),100);
        
        System.out.println("-----------------");
        System.out.println("Value of key Sachin: "+map.get(new Key("Sachin")));
        System.out.println("Value of key Krishnas: "+map.get(new Key("Krishna")));
    }
}
