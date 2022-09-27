 
package Sorting;
 
import java.util.Scanner;

class DoSort{
    int[] arr; 
    int low, high;
    public int[] sort(int[] arr){
        int[] sortedArr = performQuickSort(arr, 0, arr.length-1);
        return sortedArr;
    }
    
    public int[] performQuickSort(int[] arr, int low, int high){
        int temp ;
        int h = high;
        int l = low;
        int mid = (low+high)/2;
        int pivot = arr[mid];
        
        /** partition **/
        while(l <= h){
            while(arr[l] < pivot){
                l++;
            }
            while(arr[h] >pivot){
                h--;
            }
            if(l <= h){
                /** swap ***/
                temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                
                l++;
                h--;
            }
        }
        /** recursively sort lower half **/
        if(low < h){
            this.performQuickSort(arr, low, h);
        }
        /** recursively sort upper half **/
        if(l < high){
            this.performQuickSort(arr, l, high);
        }
        return arr;
    }
    public void print(int[] sortedArr){
        System.out.println("--------------------------");
        for(int a : sortedArr){
            System.out.print(a+"  ");
        }
    }
}

public class QuickSort { 
    public static void main(String[] args) {
         
        DoSort doSort = new DoSort();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int size = kb.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter Array : ");
        for(int i=0; i<size; i++  ){
            arr[i] = kb.nextInt();
        }     
        
        doSort.print(arr);
        
        int[] sortedArray = doSort.sort(arr);
        
        doSort.print(sortedArray);
    }  
}
