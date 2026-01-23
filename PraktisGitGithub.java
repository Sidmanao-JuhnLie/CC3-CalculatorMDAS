package practice;
import java.util.Scanner;
public class PraktisGitGithub {
    static int operators(int a, int b, char isOperators) {
        if (isOperators == '+') {
            return a + b;
        } else if (isOperators == '-') {
            return a - b;
        } else if (isOperators == '*') {
            return a * b;
        } else if (isOperators == '/') {
            if (b == 0) {
                throw new ArithmeticException("Cannot Divide by Zero");
            } else {
                return a / b;
            }
        } else {
            throw new IllegalArgumentException("Invalid Operator");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Statement Added");
        System.out.println("CC3-CalculatorMDAS");
        System.out.println("Hello World");


        System.out.print("Enter Operator: ");
        char isOperators = scanner.next().charAt(0);

        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();

        try {
            int result = operators(num1, num2, isOperators);
            System.out.println("Answer: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
