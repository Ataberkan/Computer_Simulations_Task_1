import java.util.Scanner;

public class Main {
    public static double calculateFactorial(int number) {
        double factorial = 1;
        for (int j = 1; j <= number; j++) {
            factorial *= j;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Please enter a value for x: ");
        double xValue = inputScanner.nextDouble();

        System.out.print("Specify the number of terms for approximation: ");
        int numberOfTerms = inputScanner.nextInt();

        double sinX = 0;
        for (int k = 0; k < numberOfTerms; k++) {
            sinX += Math.pow(-1, k) * Math.pow(xValue, 2 * k + 1) / calculateFactorial(2 * k + 1);
        }

        System.out.println("Approximation of sin(" + xValue + ") is: " + sinX);

        inputScanner.close();
    }
}
