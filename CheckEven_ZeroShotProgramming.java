
public class CheckEven_ZeroShotProgramming {

    // Function to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Example usage
    public static void main(String[] args) {
        int testNumber = 4;
        if (isEven(testNumber)) {
            System.out.println(testNumber + " is even.");
        } else {
            System.out.println(testNumber + " is odd.");
        }
    }
}
