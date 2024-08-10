public class Task4 {

        // Recursive function
        public static int handshake(int n) {

            if (n == 1) {
                return 0;
            }

            else if (n == 2) {
                return 1;
            }

            return handshake(n - 1) + (n - 1);
        }

        public static void main(String[] args) {

            int numberOfPeople = 4;

            int result = handshake(numberOfPeople);

            System.out.println("The number of handshakes for " + numberOfPeople + " people is: " + result);

        }
}
