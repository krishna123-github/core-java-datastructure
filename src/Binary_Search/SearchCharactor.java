package Binary_Search;

class CharSearch {

    char[] array;
    int low;
    int high;

    public CharSearch(char[] arr) {
        array = arr;
        low = 0;
        high = array.length-1;
    }

    public Boolean search(char item) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == item) {
                return true;
            } else if (array[mid] > item) {
                high = mid - 1;
            } else if (array[mid] < item) {
                low = mid + 1;
            }
        }
        return false;
    }
}

public class SearchCharactor {

    public static void main(String[] args) {
        String str = "abcdefgh";
        char[] name = str.toCharArray();
        CharSearch c = new CharSearch(name);
        Boolean result = c.search('h');
        System.out.println(result);
    }
}
