// To concatenate a sentence using camel concatenation

import java.util.Scanner;

public class camelConc {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = Sc.nextLine();
        sentence = sentence.trim();
        sentence += " ";
        String[] str = new String[sentence.length()];
        int counter = 0;
        int a = 0;
        char ch;
        boolean b;
        String word = "";
        // Separating words and putting in string array
        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);
            b = Character.isWhitespace(ch);
            if (b == true) {
                word = sentence.substring(a, i);
                str[counter] = word;
                a = i + 1;
                counter += 1;
                word = "";
            }
        }
        // Concatenating the words
        String finalStr = "";
        finalStr += str[0].toLowerCase();
        for (int i = 1; i < counter; i++) {
            word = (str[i].substring(0, 1).toUpperCase()) + str[i].substring(1).toLowerCase();
            finalStr += word;
        }
        System.out.println("The final word is: " + finalStr);
    }
}
/**
 * Variable data table
 * Variable     Type    Function
 * sentence     String  To store sentence
 * str[]        String  To store words of sentence in array
 * counter      int     Used as counter for array
 * an            int     Used to separate words
 * word         String  Used to separate words
 * finalStr     String  Used to store output
 */