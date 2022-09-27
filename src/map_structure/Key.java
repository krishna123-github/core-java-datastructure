 
package map_structure;

import java.util.Objects;

 
public class Key {
    String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = key.charAt(0);
        System.out.println("Hashcode of Key "+key +" = "+hash);
         return hash;
    }

    @Override
    public boolean equals(Object obj) {
         return key.equals(((Key)obj).key);
    }
    
}

