import java.util.Arrays;
import java.util.Scanner;

public class arrShiftSortMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int n1 = sc.nextInt();
        System.out.println("Enter " + n1 + " elements");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter size of second array: ");
        int n2 = sc.nextInt();
        System.out.println("Enter " + n2 + " elements");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        sc.close();
        int[] merge = new int[n1 + n2];
        int aCount = 0;
        int bCount = 0;
        int extra = 0;
        while (aCount < n1 && bCount < n2) {
            if (arr1[aCount] < arr2[bCount]) {
                merge[extra] = arr1[aCount];
                aCount += 1;
            }
            if (arr1[aCount] > arr2[bCount]) {
                merge[extra] = arr2[bCount];
                bCount += 1;
            }
            extra += 1;
        }
        while (aCount < n1) {
            merge[extra] = arr1[aCount];
            aCount += 1;
            extra += 1;
        }
        while (bCount < n2) {
            merge[extra] = arr2[bCount];
            bCount += 1;
            extra += 1;
        }

        System.out.println(Arrays.toString(merge));
    }
}