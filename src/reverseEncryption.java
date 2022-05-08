// Program which takes a string of a paragraph from user
// The characters of odd sentences are added with number
// The even sentences are reversed in order
import java.util.Scanner;
import java.util.StringTokenizer;
public class reverseEncryption {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String paragraph = sc.nextLine();
        sc.close();
        StringTokenizer st = new StringTokenizer(paragraph, ".");
        String[] sentences = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            sentences[i++] = st.nextToken();
        }
        for (i = 0; i < sentences.length; i++) {
            if (i+1 % 2 == 0) {
                for (int j = 0; j < sentences[i].length()-1; j++) {
                    sentences[i] = sentences[i].substring(0,j) + (char)(sentences[i].charAt(j)+1) + sentences[i].substring(j+1);
                }
            }
            else {
                sentences[i] = (new StringBuffer(sentences[i]).reverse()).toString();
            }
        }
        for (i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
        }
    }
}