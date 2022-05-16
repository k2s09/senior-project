import java.util.Arrays;
import java.util.Scanner;
public class luckyNumbers {
    static int N;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
        eliminate(3);
        System.out.println(Arrays.toString(arr));
//        int steps = numberOfSteps();
//        int count = 1;
//        while (count++ <= steps) {
//            eliminate(count);
//        }
    }
//    static int numberOfSteps() {
//
//    }
    static void eliminate(int count) {
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0)
                continue;
            if (a % count == 0) {
                arr[a] = 0;
            }
            a+=1;
        }
    }
}