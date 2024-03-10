import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        }

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + number + " is: " + sum);

        scanner.close();
    }
}
