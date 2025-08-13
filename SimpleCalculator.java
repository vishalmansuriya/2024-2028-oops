import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Choose operation: +, -, *, /, %");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Cannot perform modulus by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        scanner.close();
    }
}
