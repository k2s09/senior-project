import java.util.*;
public class fascinatingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upper limit of range");
		int u = sc.nextInt();
		System.out.println("Enter lower limit of range");
		int l = sc.nextInt();
		int count = 0;
		for (int i = l; i <= u; i++) {
			if (isFascinating(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\nNumber of fascinating numbers: " + count);
	}
	
	static boolean isFascinating(int i) {
        return Arrays.toString(new char[] ((i + "" + (i*2) + "" + (i*3)).toCharArray());).replaceAll( "[^\\d]", "" ).equals("123456789");
	}
}
// 
// 