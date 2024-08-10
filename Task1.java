import java.util.Scanner;
public class Task1 {
    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
