public class disariumNumber {
    int num;
    int size;

    disariumNumber(int nn) {
        this.num = nn;
        this.size = 0;
    }

    public static void main(String[] args) {
        disariumNumber o = new disariumNumber(135);
        o.countDigit();
        o.check();
        System.out.println(o.sumOfDigits(135, 3));
    }

    void countDigit() {
        this.size = String.valueOf(this.num).length();
    }

    int sumOfDigits(int n, int p) {
        return p == 0 ? 0 : (int) Math.pow(n % 10, p) +
                this.sumOfDigits(n / 10, p - 1);
    }

    void check() {
        if (this.num == this.sumOfDigits(this.num, this.size)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}