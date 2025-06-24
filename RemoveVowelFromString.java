// RemoveVowelFromString.java
// create a function to remove all the vowels from a strings

public class RemoveVowelFromString {

    // Method to remove all vowels from a string
    public static String removeVowelFromString(String input) {
        if (input == null) {
            return null; // Handle null input
        }
        // Use regex to remove both uppercase and lowercase vowels
        return input.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        // Happy test cases
        printOriginalAndModified("Hello World");      // Contains vowels
        printOriginalAndModified("AEIOUaeiou");       // Only vowels
        printOriginalAndModified("Java Programming"); // Mixed vowels and consonants
        printOriginalAndModified("BCDFG");            // No vowels
        printOriginalAndModified("");                 // Empty string

        // Unhappy test cases
        printOriginalAndModified(null);               // Null input
        printOriginalAndModified("12345");            // Only digits
        printOriginalAndModified("!@#$%");            // Only special characters
        printOriginalAndModified("AaEeIiOoUu");       // All vowels in mixed case
    }

    // Helper method to print original and modified strings side by side
    private static void printOriginalAndModified(String input) {
        String result = removeVowelFromString(input);
        // Print the original and modified strings in formatted output
        System.out.printf("Original: %-20s | Modified: %s\n", input, result);
    }
}
