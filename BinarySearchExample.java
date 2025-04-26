public class BinarySearchExample {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // Key found
            } else if (arr[mid] < key) {
                low = mid + 1; // Search in right half
            } else {
                high = mid - 1; // Search in left half
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16}; // Sorted array
        int key = 10; // Key to search for

        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
