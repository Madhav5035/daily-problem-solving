public class GreatestDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(48, 18));  // Output: 6
        System.out.println(gcd(100, 50)); // Output: 50
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}