package Sorting;

public class SelectionSort {

    int key, k;

    int[] sort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            int k = i + 1;

            while (k < size) {
                if (array[i] > array[k]) {
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
                k++;
            }

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

class TestSelevtiionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{40, 20, 10, 30, 90, 50, 30, 70, 5};
        SelectionSort ss = new SelectionSort();
        int[] sortdArray = ss.sort(arr);
        ss.print(sortdArray);
    }
}
