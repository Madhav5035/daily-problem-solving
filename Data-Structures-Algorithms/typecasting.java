import java .util.Scanner;
// User Information Program
public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your height in feet: ");
        double height = sc.nextDouble();
        sc.nextLine(); 

            System.out.print("Do you know Python? (true/false): ");
            String boolInput = sc.nextLine().trim().toLowerCase();
            boolean knowsJava = Boolean.parseBoolean(boolInput);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " feet");
        System.out.println("Knows Java: " + knowsJava);
        // Print types (Using Wrapper classes to demonstrate the type)
        System.out.println("\nType of name: " + name.getClass().getSimpleName());
        System.out.println("Type of age: int");
        System.out.println("Type of height: double");
        System.out.println("Type of knowsJava: boolean");
        //Message using formatted string
        System.out.printf("\nHello %s, you are %d years old, %.2f feet tall, and it is %b that you know Java.\n", name, age, height, knowsJava);
    }}
