package Binary_Search;

import java.util.Collections;

public class BinarySearch {

    Integer[] array;
    int low;
    int high;

    public BinarySearch(Integer[] array) {
        this.array = array;
        low = 0;
        high = array.length - 1;
    }

    // before start searching-- Sort the given array
    public void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    //perform Binary Search in Sorted Array
    public Boolean searchData(int item) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == item) {
                return true;
            } else if (array[mid] > item) {
                high = mid - 1;;
            } else if (array[mid] < item) {
                low = mid + 1;
            }
        }
        return false;
    }

}

class Test {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{7,4,8,2,1,5,6,4,8};
        BinarySearch bs = new BinarySearch(arr);
        bs.sort();
        Boolean result = bs.searchData(7);
        System.out.println(result);
    }
}
