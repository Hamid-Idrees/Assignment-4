public class Task6 {

    public static int power(int base, int exponent) {
       // if exponent is 1, return base

        if (exponent == 1) {
            return base;
        }

        // formula
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        int base = 100;
        int exponent = 2;

        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
