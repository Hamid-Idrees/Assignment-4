public class Task3 {

    // Recursive function
    public static int countDigit(int n, int digit) {

        if (n == 0) {
            return 0;
        }

        // Get last digit of number
        int lastDigit = n % 10;

        // Count if the last digit is the specified digit
        int count = (lastDigit == digit) ? 1 : 0;

        // Recursive call with the number reduced by removing the last digit
        return count + countDigit(n / 10, digit);
    }

    public static void main(String[] args) {

                int number = 220;
                int searchDigit = 2;


                int result = countDigit(number, searchDigit);
                System.out.println("The digit " + searchDigit + " appears " + result + " times in " + number + ".");

    }
}
