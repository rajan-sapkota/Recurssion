public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(facAns(n));
    }

    static int facAns(int n) {
        if (n == 0) {
            return 1;

        } else {
            return n * facAns(n - 1);
        }
    }
}