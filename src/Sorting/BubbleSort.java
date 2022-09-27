
package Sorting;

/**
 *
 * @author krishna pal
 */
public class BubbleSort {
    
     public int[] sort(int[] array){
         int size = array.length;
         
         for(int i = 0; i<size; i++){
             for(int j = 0; j<size-1; j++){
                 if(array[j] > array[j+1]){
                     int temp = array[j];
                     array[j] = array[j+1];
                     array[j+1] = temp;
                 }
             }
         }
         return array;
     }
     public void print(int[] arr){
         for(int a : arr){
             System.out.print(a+" ");
         }
         System.out.println("-------------------");
     }
     
}

class Test{
    public static void main(String[] args) {
        int[] arr = new int[]{3,6,2,7,3,8,2};
        BubbleSort b = new BubbleSort();
        b.print(arr);
        int[] sortedArray = b.sort(arr);
        b.print(sortedArray);
    }
}
