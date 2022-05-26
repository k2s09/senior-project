package src;

// Converting between decimal and binary

import java.util.Scanner;

public class decimalBinaryShenanigans {
    int decimal, binary;

    public static void main(String[] args) {
        decimalBinaryShenanigans obj = new decimalBinaryShenanigans();
        obj.inputs();
        System.out.println("Decimal to Binary: " + obj.decimalToBinary(obj.decimal));
        System.out.println("Decimal to Binary using Recursion: " + obj.decimalToBinaryRecursion(obj.decimal));
        System.out.println("Binary to Decimal: " + obj.binaryToDecimal(obj.binary));
        System.out.println("Binary to Decimal using Recursion: " + obj.binaryToDecimalRecursion(obj.binary));
    }

    void inputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in decimal");
        decimal = sc.nextInt();
        System.out.println("Enter number in binary");
        binary = sc.nextInt();
        sc.close();
    }

    int decimalToBinary(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2);
            n /= 2;
        }
        binary = (new StringBuffer(binary).reverse()).toString();
        return Integer.parseInt(binary);
    }

    int decimalToBinaryRecursion(int n) {
        if (n == 0) return 0;
        return n % 2 + 10 * decimalToBinaryRecursion(n / 2);
    }

    int binaryToDecimal(int n) {
        String binary = "" + n;
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') decimal += (int) (Math.pow(2, i));
        }
        return decimal;
    }

    int binaryToDecimalRecursion(int n) {
        if (n == 0) return 0;
        return n % 10 + 2 * binaryToDecimal(n / 10);
    }
}