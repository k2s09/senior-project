import java.util.Scanner;

public class recursiveSortSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter " + N + " numbers");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        print(arr);
        System.out.println("Sorting using bubble sort");
        bubbleSort(arr, 0, 0);
        print(arr);
        System.out.println("Enter element to search for binary search");
        int e = sc.nextInt();
        sc.close();
        int search = binarySearch(arr, 0, N - 1, e);
        if (search == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + search + "th index");
        }
    }

    // Bubble Sort
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

    // Binary Search
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

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
