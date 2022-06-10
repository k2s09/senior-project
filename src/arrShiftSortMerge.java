import java.util.Scanner;

public class arrShiftSortMerge {
    public static void main(String[] args) {
        // Take inputs for two sorted arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array ");
        int n1 = sc.nextInt();
        System.out.println("Enter " + n1 + " elements");
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter size of second array ");
        int n2 = sc.nextInt();
        System.out.println("Enter " + n2 + " elements");
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        sc.close();
        // Start merge arrays and sort them
        int[] merge = new int[n1 + n2];
        int count = 0;
        int aC = 0, bC = 0;
        for (int i = 0; i < merge.length; i++) {
            if (aC >= a.length || bC >= b.length) {
                if (aC >= a.length) {
                    for (int j = bC; j < b.length; j++) {
                        merge[count++] = b[j];
                    }
                } else {
                    for (int j = aC; j < a.length; j++) {
                        merge[count++] = a[j];
                    }
                }
            }
            if (a[aC] < b[bC]) {
                merge[count++] = a[aC];
                aC += 1;
                continue;
            }
            if (b[bC] < a[aC]) {
                merge[count++] = b[bC];
                bC += 1;
                continue;
            }
            if (a[aC] == b[bC]) {
                merge[count] = a[aC];
                merge[++count] = b[bC];
                aC += 1;
                bC += 1;
            }
        }
        System.out.println("Final array: ");
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}