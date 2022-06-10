import java.util.Scanner;

public class binaryDecimalShenanigans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number");
        int decimal = sc.nextInt();
        System.out.println("Enter binary number");
        int binary = sc.nextInt();
        sc.close();
        System.out.println("Binary to Decimal");
        System.out.println(binaryToDecimal(binary));
        System.out.println("Binary to Decimal using recursion");
        System.out.println(binaryToDecimalRecursion(binary));
        System.out.println("Decimal to Binary");
        System.out.println(decimalToBinary(decimal));
        System.out.println("Decimal to Binary using Recursion");
        System.out.println(decimalToBinaryRecursion(decimal));
    }

    // 11011 ->
    static int binaryToDecimal(int n) {
        String binary = String.valueOf(new StringBuffer("" + n).reverse());
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += (int) (Math.pow(2, i));
            }
        }
        return decimal;
    }

    static int decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 1) {
            binary += decimal % 2;
            decimal /= 2;
        }
        return Integer.valueOf(new StringBuffer(binary).reverse().toString());
    }

    static int decimalToBinaryRecursion(int n) {
        if (n == 0)
            return 0;
        return n % 2 + 10 * decimalToBinaryRecursion(n / 2);
    }

    static int binaryToDecimalRecursion(int n) {
        if (n == 0)
            return 0;
        return n % 10 + 2 * binaryToDecimalRecursion(n / 10);
    }
}