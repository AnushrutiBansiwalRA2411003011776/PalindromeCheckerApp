public class UseCase4PalindromeCheckerApp {


public static void main(String[] args) {

    String word = "madam";

    // convert string to character array
    char[] characters = word.toCharArray();

    int start = 0;
    int end = characters.length - 1;

    boolean isPalindrome = true;

    // two-pointer comparison
    while (start < end) {
        if (characters[start] != characters[end]) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    // print result
    if (isPalindrome) {
        System.out.println(word + " is a Palindrome");
    } else {
        System.out.println(word + " is NOT a Palindrome");
    }
}


}
