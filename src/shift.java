import java.util.Scanner;
import java.util.StringTokenizer;
public class shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("Enter shift");
        int shift = sc.nextInt()%st.countTokens(), count = 0;
        sc.close();
        String s2 = "", s3 = "";
        while(st.hasMoreTokens()) {
            if(count < st.countTokens()-shift) {
                s2 = s2.concat(st.nextToken() + " ");
                count++;
            } else {
                s3 = s3.concat(st.nextToken() + " ");
            }
        }
        System.out.println("Shifted sentence:\n" + s3 + s2);
    }
}