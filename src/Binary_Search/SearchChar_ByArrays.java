 
package Binary_Search;
 
import java.util.Arrays;

public class SearchChar_ByArrays {
 
    public static void main(String[] args) {
         
        char[] arr = {'a','b','c','d','e','f'};
        
        System.out.println( Arrays.binarySearch(arr, 'e') );
        System.out.println( Arrays.binarySearch(arr, 'p') );
    }
    
}
