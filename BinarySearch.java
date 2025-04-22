import java.util.Scanner;

public class BinarySearch {
    
    // Binary Search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (array[mid] == target) {
                return mid; // Element found
            }

            // If target greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Input sorted array
        System.out.println("Enter " + size + " sorted elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input target value
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
