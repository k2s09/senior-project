import java.util.Scanner;
public class wordleStartChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many test tries do you want?");
        int eTries = sc.nextInt();
        int sumFreq = 0;
        String[] words = new String[eTries];
        String sentence = "";
        System.out.println("Enter words:");
        for (int i = 0; i < eTries; i++) {
            words[i] = sc.next();
            sentence += words[i];
        }
        // Find sumFreq of sentence
        for (int i = 0; i < sentence.length(); i++) {
            sumFreq += freqChar(sentence.charAt(i));
        }
        sumFreq /= eTries;
        System.out.println("Score: " + sumFreq);
    }
    static double freqChar(char ch) {
        char[] list = {'e','a','r','i','o','t','n','s','l','c','u','d','p',
                'm','h','g','b','f','y','w','k','v','x','z','j','q'};
        double[] freq = {56.88,43.31,38.64,38.45,36.51,35.43,33.92,29.23,27.98,23.13,18.51,17.25,16.14,
                15.36,15.31,12.59,10.56,9.24,9.06,6.57,5.61,5.13,1.48,1.39,1, 1};
        for (int i = 0; i < 26; i++) {
            if (ch == list[i])
                return freq[i];
        }
        return 0;
    }
}
// merge letters to have no doubles
// troubleshoot