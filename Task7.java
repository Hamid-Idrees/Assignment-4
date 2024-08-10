public class Task7 {

    public static String reverse(String s, int length) {

        if (length == 0) {
            return "";
        }
        // Recursive case: reverse the substring and add the last character
        return s.charAt(length - 1) + reverse(s, length - 1);
    }

    public static void main(String[] args) {
        String input = "Cristiano Ronaldo";

        String reversed = reverse(input, input.length());
        System.out.println("Reversed string: " + reversed);
    }
}
