import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Checking divisibility by integers from 1 to 9 | NOTE: 0 is excluded as every number is divisible by 0
        for (int i = 1; i <= 9; i++) {
            if (isDivisible(number, i)) {
                System.out.println("The number " + number + " is divisible by " + i + " because " + getReason(number, i));
            } else {
                System.out.println("The number " + number + " is not divisible by " + i + ".");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // A Method for checking if a number is divisible by another number
    private static boolean isDivisible(int num, int divisor) {
        return num % divisor == 0;
    }

    // A Method for providing the reason for divisibility
    private static String getReason(int num, int divisor) {
        switch (divisor) {
            case 1:
                return "every number is divisible by 1.";
            case 2:
                return "it is even.";
            case 3:
                return "the sum of its digits is divisible by 3.";
            case 4:
                return "the last two digits form a number that is divisible by 4.";
            case 5:
                return "it ends with 0 or 5.";
            case 6:
                return "it is divisible by both 2 and 3.";
            case 7:
                return "twice the last digit subtracted from the rest of the number is divisible by 7.";
            case 8:
                return "the last three digits form a number that is divisible by 8.";
            case 9:
                return "the sum of its digits is divisible by 9.";
            default:
                return "";
        }
    }
}
