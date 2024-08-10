public class Task5 {

    public static int gcd (int x, int y) {
        //  if y is 0, the GCD is x
        if (y == 0) {
            return x;
        }
        // Recursive: gcd(x, y) = gcd(y, x % y)
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        int x = 56;
        int y = 98;

        int result = gcd(x, y);
        System.out.println("The GCD of " + x + " and " + y + " is: " + result);
    }
}
