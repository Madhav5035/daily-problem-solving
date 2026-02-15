import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "Madhav";
        String correctPassword = "745185";
        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome, " + username + "!");
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }
    }
}