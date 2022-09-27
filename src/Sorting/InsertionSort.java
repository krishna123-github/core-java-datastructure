package Sorting;

public class InsertionSort {

    int key, p;

    public int[] sort(int[] array) {
        int size = array.length;       // array = 40,20,30,10

        for (int i = 1; i < size; i++) {    // true for i =1,2,3 
            key = array[i];
            p = i - 1;

            while (p >= 0 && array[p] > key) {
                array[p+1] = array[p];
                p = p - 1;
            }
            array[p + 1] = key;
        }
        return array;
    }

    void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("-------------------");
    }

}

class TestInsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{40,20,30,10,40,60,70,30,20,90};
        InsertionSort is = new InsertionSort();
        int[] SortedArray = is.sort(arr);
        is.print(SortedArray);
    }
}
