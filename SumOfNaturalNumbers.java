import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();

            int result = calculateSumOfNaturalNumbers(num);
            System.out.println("The sum of the first " + num + " natural numbers is: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        } finally {
            scanner.close();
        }
    }

    public static int calculateSumOfNaturalNumbers(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Please enter a positive integer.");
        }

        int sum = n * (n + 1) / 2;
        return sum;
    }
}
