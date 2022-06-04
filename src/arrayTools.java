// Performing a lot of operations on 2D arrays

import java.util.Arrays;
import java.util.Scanner;

class arrayTools {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = Sc.nextInt();
        System.out.println("Enter number of columns");
        int c = Sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter " + (r * c) + " elements for your array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }
        System.out.println("\nSum of rows:\n");
        int sumR = 0, sumC = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sumR += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sumR);
            sumR = 0;
        }
        System.out.println("\nSum of columns\n");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                sumC += arr[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + " = " + sumC);
            sumC = 0;
        }
        System.out.println("\nSum of left diagonals\n");
        int dL = 0, dR = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                    dL += arr[i][j];
                }
            }
        }
        System.out.println(dL);
        System.out.println("\nSum of right diagonals\n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i + j == (r - 1)) {
                    System.out.print(arr[i][j] + " ");
                    dR += arr[i][j];
                }
            }
        }
        System.out.println(dR);
        rotate(arr);
        transpose(arr);
        int[][] b = input();
        addSubtract(arr, b);
        multiply1(arr, 5);
        shift(arr, r, c);
        Sc.close();
    }

    static int[][] input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
        System.out.println("Enter " + (r * c) + " elements");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }

    static void print(int[][] arr) {
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    static void transpose(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int[][] trans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                trans[i][j] = arr[j][i];
            }
        }
        System.out.println("Transposed array: ");
        print(trans);
    }

    static void addSubtract(int[][] a, int[][] b) {
        if (a.length != b.length && a[0].length != b[0].length) {
            System.out.println("Matrices have different sizes!");
            return;
        }
        int[][] sum = new int[a.length][a[0].length];
        int[][] difference = new int[a.length][a[0].length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                difference[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("Sum of the matrices: ");
        print(sum);
        System.out.println("Difference between the matrices: ");
        print(difference);
    }

    static void multiply1(int[][] a, int b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] *= 2;
            }
        }
        System.out.println("Product matrix: ");
        print(a);
    }

    // Rotate an array 90 degrees clockwise
    static void rotate(int[][] arr) {
        int[][] rot = new int[arr.length][arr[0].length];
        for (int i = 0, k = 2; i < rot.length; i++, k--) {
            for (int j = 0; j < rot[i].length; j++) {
                rot[j][k] = arr[i][j];
            }
        }
        System.out.println("pi/2 rad rotated clockwise matrix: ");
        print(rot);
    }

    // Shifting the rows
    static void shift(int[][] arr, int r, int c) {
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[i + 1][j];
                arr[i + 1][j] = tmp;
            }
        }
        System.out.println("Row Shifted matrix:");
        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}