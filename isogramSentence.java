import java.util.Scanner;

public class isogramSentence {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = Sc.nextLine();
        sentence += " ";
        int length = sentence.length();
        String word = "";
        char h;
        String[] str = new String[length];
        int count = 0;
        // Seperating words of the sentence and putting in string array
        for (int i = 0; i < length; i++) {
            h = sentence.charAt(i);
            if (h != 32)
                word += h;
            if (h == 32) {
                str[count] = word;
                count += 1;
                word = "";
            }
        }
        // Checking if each word is an isogram
        for (int x = 0; x < count; x++) {
            int a = str[x].length();
            int flag = 0;
            char ch, as;
            for (int i = 0; i < (a - 1); i++) {
                ch = str[x].charAt(i);
                for (int j = (i + 1); j < a; j++) {
                    as = str[x].charAt(j);
                    if (ch == as) {
                        flag += 1;
                        break;
                    }
                }
                if (flag > 0) {
                    System.out.println(str[x] + " is not an isogram");
                    break;
                }
            }
            if (flag == 0)
                System.out.println(str[x] + " is an isogram");
        }
    }
}
/**
 * Variable Data Table
 * Variable     Data    Table
 * sentence     String  To store sentence
 * length       int     To store length of sentence
 * word         String  Used in seperating words
 * h            char    Used in seperating words
 * str[]        String  Used in storing words
 * count        int     Used to store number of words
 * a            int     Used to check if word is isogram
 * flag         int     Used to check if word is isogram
 * ch, as       char    Used to check if word is isogram
 */ 