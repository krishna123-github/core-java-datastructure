package Hash_Table;

import java.util.Scanner;

class HashTable {

    int tableSize;
    int size;
    LinkedHashEntry[] table;

    public HashTable(int tableSize) {
        this.tableSize = tableSize;
        size = 0;
        table = new LinkedHashEntry[tableSize];

        for (int i = 0; i < tableSize; i++) {
            table[i] = null;
        }
    }

    public int getSize() {
        return size;
    }

    public void makeEmpty() {
        for (int i = 0; i < tableSize; i++) {
            table[i] = null;
        }
    }

    public void insert(String key, int value) {
        int index = myHash(key) % tableSize;          // HashFunction 
        //if new index is empty in hashTable .. then if condition true
        if (table[index] == null) {
            table[index] = new LinkedHashEntry(key, value);
        } // there is Certaiin data in tha new index.. then else will execute
        else {
            LinkedHashEntry entry = table[index];
            while (entry.next != null && !entry.key.equals(key)) {   //util it traverse the link.. till get null in next position ..or get same KEY as previous
                entry = entry.next;                 // traverse in each iteration
            }
            // if therea are null in next link then it will work..or same KEY as previous
            if (entry.key.equals(key)) {       // if New Key  == exits key
                entry.value = value;      // exits key ki value bs update ho jayegi.. key will be same 
            } else {
                entry.next = new LinkedHashEntry(key, value);  // other wise it will add the new Key-value to next of exits Key-value
            }
        }
        size++;
    }

    public int getValue(String key) {
        int index = myHash(key) % tableSize;  // fetch the index value of key
        if (table[index] == null) {     //  first check the new key index is empty or not
            return -1;
        } 
        else {
            LinkedHashEntry entry = table[index];
            while (entry.next != null && !entry.key.equals(key)) {
                entry = entry.next;
            }

            if (entry == null) {
                return -1;
            } else {
                return entry.value;
            }
        }
    }
    
    public void remove(String key){
        int index = myHash(key) % tableSize;
        if(table[index] != null){
            LinkedHashEntry preEntry = null ;
            LinkedHashEntry entry =  table[index];
            
            while(entry.next != null && !entry.key.equals(key)){
                preEntry = entry;
                entry = entry.next;
            }
            if(entry.key.equals(key)){
                if(preEntry == null){
                    table[index] = entry.next;
                }
                else{
                    preEntry.next = entry.next;
                    System.out.println("Removed successfully");
                }
                size--;
            }
        }
        else{
              System.out.println("No data on index: "+index);
        }
    }

    public int myHash(String key) {
        int hashValue = key.hashCode();   // int code form of key...here key is in string form, that why we are fetching the hashcode.. to make the index
        hashValue %= tableSize;      // use geto compress the hashCode
        if (hashValue < 0) {        //if it is negative 
            hashValue += tableSize;  // it will that positive
        }
        return hashValue;           // return the new hashcode
    }
    
    public void printHashTable(){
        for(int i=0;i<tableSize; i++){
            System.out.println("");
            System.out.println("Bucket "+(i+1)+"  :");
            LinkedHashEntry entry = table[i];
            
            while(entry != null){
                System.out.print(entry.value+"  :  ");
                entry = entry.next;
            }
            
        }
    }

}

public class Insert_hashTable {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Size of Table : ");
        int size = kb.nextInt();

        HashTable hashTable = new HashTable(size);
         int i = 6;
        while (i > 0) {
            System.out.println("Enetr Key: ");
            String key = kb.next();
            System.out.println("Enter value: ");
            int value = kb.nextInt();
            hashTable.insert(key, value);
            --i;
        }
        
        hashTable.printHashTable();
        
        System.out.println("");
        System.out.print("Enter String u want to remove : ");
        String removeString = kb.next();
        hashTable.remove(removeString);
       
         hashTable.printHashTable();
         
         System.out.println("");
         System.out.print("Enter the search key: ");
         String getKey = kb.next();
         int value = hashTable.getValue(getKey);
         System.out.println("value: "+value);
         
    }

}
