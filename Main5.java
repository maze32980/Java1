import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        while (true) {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();

            int result = num1 * num2;
            System.out.println("Result of multiplication: " + result);

            System.out.println("Enter 1 to exit, or any other number to continue:");
            int choice = scanner.nextInt();

            if (choice == 1) {
                break;
            }
        }

        scanner.close();
    }
}
