package src;

/**
 * An Achilles Number is a number that is powerful but not a perfect power.
 * A Powerful Number is a positive integer N, such that for every prime factor p of N, p2 is also a factor.
 * A Perfect Power is a positive integer N such that it can be expressed as ab, where a and b are natural numbers > 1.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class achillesNumber {
    public static void main(String[] args) {
        // Inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        boolean b1 = isPowerful(num);
        boolean b2 = isPerfect(num);
        if (b1 && !b2)
            System.out.println("Number is an achilles number");
        else
            System.out.println("Number is not an achilles number");
    }

    public static boolean isPowerful(int n) {
        int tmp = n;
        // Store all unique prime factors of n
        LinkedList<Integer> lk = new LinkedList<Integer>();
        if (n % 2 == 0) {
            lk.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                lk.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 2)
            lk.add(n);
        // Check if the square of each prime factor is also divisible by n
        int flag = 0;
        for (int i = 0; i < lk.size(); i++) {
            if (tmp % lk.get(i) == 0)
                flag += 1;
        }
        return (flag == lk.size());
    }

    public static boolean isPerfect(int num) {
        for (int i = 2; i < num; i++) {
            for (int j = 2; j < num; j++) {
                int exponent = (int) (Math.pow(i, j));
                if (exponent == num)
                    return true;
            }
        }
        return false;
    }
}
/**
 * Variable        Data        Table
 * num             int         Store user input
 * b1              boolean     Store value from isPowerful()
 * b2              boolean     Store value from isPerfect()
 * flag1, flag2    int         Flag variable to check powerful
 * i, j            int         Counter
 * exponent        int         Used in calculation
 */