import java.util.Locale;

public class Task2 {

    public static boolean isPALindrome(String s , int l){

        if (l <= 1){ // if length is 0 and 1 its a palindrome
            return true;
        }

        if (s.charAt(0) == s.charAt(l - 1)){

            return isPALindrome(s.substring(1, l - 1) , l -2 );

        }

        return false;

    }


    public static void main(String[] args) {

        String input = "MadamImAdam";

        String modifyInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = modifyInput.length();

        // yes or no function
        boolean result = isPALindrome(modifyInput, length);

        if (result){
            System.out.println(input + " is palindrome");
        }
        else {
            System.out.println(input + " is not palindrome");
        }

    }
}
