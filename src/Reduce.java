public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int a = 0;
        while (n > 0) {
            boolean divisibleby2 = n % 2 == 0;

            if (divisibleby2) {
                n /= 2;
                a += 1;
            } else {
                n -= 1;
                a += 1;
            }
        }
        System.out.println(a);
    }
}
