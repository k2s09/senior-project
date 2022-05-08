// Program of a typing test to find speed in WPM, CPM, accuracy % based on commonly typed words in English 1k.

import java.time.LocalTime;
import java.util.Scanner;
public class typingTest {
    static String input;
    static int WPM, CPM, numberOfWords, correctWords;
    static double start, end, time, accuracy, minutesTaken;
    // Class Variables
    String[] bank = {"be", "have", "do", "say", "get", "make", "go", "know", "take", "see", "come", "think", "look", "want", "give", "use", "find", "tell", "ask", "work", "seem", "feel", "try", "leave", "call", "person", "life", "day", "number", "again"};

    typingTest() {
        input = "";
        WPM = CPM = numberOfWords = correctWords = 0;
        start = end = time = accuracy = minutesTaken = 0.0;
    }

    public static void main(String[] args) {
        typingTest obj = new typingTest();
        obj.countdown();
        obj.input();
        obj.calculate();
        obj.display();
    }

    void countdown() {
        try {
            System.out.println("3!");
            Thread.sleep(1000);
            System.out.println("2!");
            Thread.sleep(1000);
            System.out.println("1!");
            Thread.sleep(1000);
            System.out.println("Start!\n");
            // Test words
            System.out.println("be have do say get make go know take see");
            System.out.println("come think look want give use fine tell ask work");
            System.out.println("seem feel try leave call person life day number again\n");
        } catch (InterruptedException e) {
            System.out.println("Error!");
        }
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        start = LocalTime.now().toNanoOfDay();
        input = sc.nextLine();
        end = LocalTime.now().toNanoOfDay();
        time = (end - start) / 1000000000.0; // Convert nanoseconds to seconds
        sc.close();
    }

    void calculate() {
        numberOfWords = 30;
        Scanner words = new Scanner(input);
        int i = 0;
        while (words.hasNext()) {
            if (bank[i].equals(words.next()))
                ++correctWords;
            ++i;
        }
        minutesTaken = time / 60.0;
        WPM = (int) ((correctWords * 1.0) / minutesTaken);
        accuracy = ((correctWords * 1.0) / numberOfWords) * 100.0;
        accuracy = Math.round(accuracy * 100.0) / 100.0;
        CPM = (int) ((114.0 * (accuracy / 100.0)) / minutesTaken);
    }

    void display() {
        System.out.println("WPM: " + WPM);
        System.out.println("CPM: " + CPM);
        System.out.println("Accuracy % : " + accuracy);
    }
}
/** Variable        Data        Table
 *  input           String      Sentence entered by user
 *  bank            String[]    Word bank to be entered
 *  WPM, CPM        int         (words per minute and characters per minute) Store speed of user
 *  numberOfWords   int         Store Total number of words
 *  correctWords    int         Number of words correct by user
 *  start, end      int         Store nano seconds of day
 *  time            int         end - start (Store time taken)
 *  minutesTaken    int         Convert time to minutes
 *  accuracy        int         Accuracy in percentage
 */