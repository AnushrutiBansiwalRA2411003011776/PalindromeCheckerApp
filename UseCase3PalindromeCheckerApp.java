public class UseCase3PalindromeCheckerApp {


public static void main(String[] args) {

    String original = "madam";
    String reversed = "";

    // reverse string using loop
    for (int i = original.length() - 1; i >= 0; i--) {
        reversed = reversed + original.charAt(i);
    }

    // compare original and reversed
    if (original.equals(reversed)) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not a Palindrome");
    }
}


}
