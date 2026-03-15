import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two Pointer Method
    public static boolean twoPointerCheck(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    // Method 2: Stack Method
    public static boolean stackCheck(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }

    // Method 3: Reverse String Method
    public static boolean reverseCheck(String str) {

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Two Pointer timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Reverse timing
        long start3 = System.nanoTime();
        boolean result3 = reverseCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Two Pointer Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Reverse String Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}