import java.util.Scanner;
public class TempClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double tempCelsius = sc.nextDouble();
        String classification;
        if (tempCelsius < 0) {
            classification = "Freezing";
        } else if (tempCelsius >= 0 && tempCelsius < 10) {
            classification = "Cold";
        } else if (tempCelsius >= 10 && tempCelsius < 20) {
            classification = "Cool";
        } else if (tempCelsius >= 20 && tempCelsius < 30) {
            classification = "Warm";
        } else {
            classification = "Hot";
        }
        System.out.println("The temperature is classified as: " + classification);
    }
}