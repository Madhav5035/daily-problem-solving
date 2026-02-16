import java.util.Scanner;
public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse its bits: ");
        int num = sc.nextInt();
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed <<= 1; // Shift left to make room for the next bit
            reversed |= (num & 1); // Add the least significant bit of num to reversed
            num >>= 1; // Shift right to process the next bit
        }
        System.out.println("Reversed bits: " + reversed);
    }
}