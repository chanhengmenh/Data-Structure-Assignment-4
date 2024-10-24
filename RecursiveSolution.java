public class RecursiveSolution {

    // c) Recursive method to find the nth Fibonacci number
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // d) Recursive method to reverse a string
    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // e) Recursive method to check if a character exists in a string
    public boolean charExists(String str, char c) {
        // Base case: empty string
        if (str.isEmpty()) {
            return false;
        }
        // Check first character
        if (str.charAt(0) == c) {
            return true;
        }
        // Recursive step
        return charExists(str.substring(1), c);
    }

    // f) Recursive method to find the Greatest Common Divisor (GCD) of two numbers
    public int gcd(int n, int m) {
        // Base case: when m becomes 0
        if (m == 0) {
            return n;
        }
        // Recursive step: apply Euclidean algorithm
        return gcd(m, n % m);
    }
}
