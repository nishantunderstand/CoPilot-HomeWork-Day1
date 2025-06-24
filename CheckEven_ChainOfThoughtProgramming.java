// CheckEven_ChainOfThoughtProgramming.java
// This program checks if a number is even or odd using Separation of Concerns.

class EvenOddChecker {

    // Logic to check if a number is even
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}

class EvenOddPresenter {

    // Responsible for presenting the result
    public void printResult(int num, boolean isEven) {
        if (isEven) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is oddd");
        }
    }
}

public class CheckEven_ChainOfThoughtProgramming {

    public static void main(String[] args) {
        int num = 7; // You can change this value for testing
        EvenOddChecker checker = new EvenOddChecker();
        EvenOddPresenter presenter = new EvenOddPresenter();
        boolean result = checker.isEven(num);
        presenter.printResult(num, result);
    }
}
