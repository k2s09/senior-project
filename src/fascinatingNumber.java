// A Fascinating number is one which when multiplied by 2 and 3 and then, after the results are concatenated
// with the original number, the new number contains all the digits from 1 to 9 exactly once.
// There can be any number of zeroes and are to be ignored.
// Accept two positive integers m and n, where m must be less than n and the values of both m and n
// must be greater than 99 and less than 10000 as user input. Display all Fascinating numbers that are
// in the range between m and n (both inclusive) and output them along with the frequency

import java.util.Arrays;
import java.util.Scanner;

public class fascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower range: ");
        int l = sc.nextInt();
        System.out.println("Enter higher range: ");
        int h = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = l; i <= h; i++) {
            if (isFascinating(i)) {
                System.out.print(i + " ");
                count += 1;
            }
        }
        System.out.println("\nNo of fascinating numbers found: " + count);
    }

    static boolean isFascinating(int no) {
        int two = no * 2;
        int three = no * 3;
        String str = "" + no + two + three;
        // Removing all zeroes from number
        String tmp = str;
        str = "";
        for (int i = 0; i < tmp.length(); i++) {
            char ch = tmp.charAt(i);
            if (ch != '0')
                str += ch;
        }
        // Sorting digits in ascending order
        char[] digits = str.toCharArray();
        Arrays.sort(digits);
        String sortedDigits = String.valueOf(digits);
        return sortedDigits.equals("123456789");
    }
}
