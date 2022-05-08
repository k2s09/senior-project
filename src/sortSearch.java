// Bubble Sort and Binary Search using recursion
import java.util.Scanner;
public class sortSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr = new int[size];
        for (int i : arr) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, 0, 0);
        System.out.println("Enter search element: ");
        int e = sc.nextInt();
        int search = binarySearch(arr, 0, size-1, e);
        if (search != -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + e);
        }
    }

    static void bubbleSort(int[] arr, int i, int j) {
        if (j == arr.length - i - 1) {
            if (i != arr.length - 2) {
                bubbleSort(arr, ++i, 0);
            } else {
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(i + " ");
                }
            }
        } else {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSort(arr, i, ++j);
        }
    }

    static int binarySearch(int[] arr, int l, int u, int e) {
        if (l > u)
            return -1;
        int m = (l + u) / 2;
        while (l <= u) {
            if (arr[m] == e)
                return m;
            if (arr[m] < e)
                u = m - 1;
            else
                l = m + 1;
        }
        return binarySearch(arr, l, u, e);
    }
}