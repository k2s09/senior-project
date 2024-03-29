// The Euler number e is used as the base of natural logarithm
// It can be approximated using the formula
// e = 1/1! + 1/2! + 1/3! .. + 1/n!
// Write a program in Java that approximates e using a loop that terminates when the 
// difference between two successive values of e differ by less than 0.0000001
public class eulerFunction {
    public static void main(String[] args) {
        double e = 1.0d;
        int count = 1;
        boolean flag = false;
        while (!flag) {
            ++count;
            // find fact of count
            int fact = 1;
            for (int i = 2; i <= count; i++) {
                fact *= i;
            }
            double temp = e + (1.0 / fact);
            if (temp - e < 0.0000001) {
                System.out.println(count);
                break;
            }
            e = temp;
        }
    }
}