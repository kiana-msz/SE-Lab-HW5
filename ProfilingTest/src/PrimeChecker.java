import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an upper limit to find prime numbers:");
        int limit = scanner.nextInt();
        calculatePrimes(limit);
    }

    public static void calculatePrimes(int limit) {
        int count = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Number of primes up to " + limit + ": " + count);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) { // Only iterate up to the square root of n
            if (n % i == 0) return false;
        }
        return true;
    }

}
