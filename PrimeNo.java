public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(isPrimeNo(25));
    }
    public static int isPrimeNo(int n) {
        if (n <= 1) {
            return 1;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 1;
            }
        }
        return 0;
    }
}
