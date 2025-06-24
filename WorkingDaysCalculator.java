
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WorkingDaysCalculator {

    public static boolean isValidDateFormat(String dateStr) {
        // Regex for DD/MM/YYYY
        return Pattern.matches("\\d{2}/\\d{2}/\\d{4}", dateStr);
    }

    public static boolean isValidDateValues(String dateStr) {
        String[] parts = dateStr.split("/");
        int dd = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int yyyy = Integer.parseInt(parts[2]);
        if (dd < 1 || dd > 31) {
            System.out.println("Invalid day (dd). Please enter a value between 01 and 31.");
            return false;
        }
        if (mm < 1 || mm > 12) {
            System.out.println("Invalid month (mm). Please enter a value between 01 and 12.");
            return false;
        }
        if (yyyy < 1000 || yyyy > 9999) {
            System.out.println("Invalid year (yyyy). Please enter a 4-digit year.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Automated test cases
        System.out.println("\n--- Automated Test Cases ---");
        runTestCase("24/06/2025", "25/06/2025"); // Happy: 2 working days
        runTestCase("23/06/2025", "29/06/2025"); // Happy: 5 working days (Mon-Sun)
        runTestCase("28/06/2025", "29/06/2025"); // Happy: 0 working days (weekend)
        runTestCase("01/01/2025", "10/01/2025"); // Happy: 8 working days
        runTestCase("31/12/2024", "01/01/2025"); // Happy: 2 working days
        runTestCase("25/06/2025", "24/06/2025"); // Unhappy: FROM after TO
        runTestCase("32/01/2025", "05/02/2025"); // Unhappy: Invalid day
        runTestCase("15/13/2025", "20/01/2025"); // Unhappy: Invalid month
        runTestCase("15/01/0999", "20/01/2025"); // Unhappy: Invalid year
        runTestCase("abc", "20/01/2025"); // Unhappy: Invalid format
        runTestCase("15/01/2025", "xyz"); // Unhappy: Invalid format
        System.out.println("\n--- End of Test Cases ---\n");

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the FROM date (DD/MM/YYYY):");
        String fromDateStr = scanner.nextLine();
        if (!isValidDateFormat(fromDateStr) || !isValidDateValues(fromDateStr)) {
            System.out.println("FROM date is not valid. Please use DD/MM/YYYY format and valid values.");
            return;
        }
        System.out.println("Enter the TO date (DD/MM/YYYY):");
        String toDateStr = scanner.nextLine();
        if (!isValidDateFormat(toDateStr) || !isValidDateValues(toDateStr)) {
            System.out.println("TO date is not valid. Please use DD/MM/YYYY format and valid values.");
            return;
        }

        try {
            LocalDate fromDate = LocalDate.parse(fromDateStr, formatter);
            LocalDate toDate = LocalDate.parse(toDateStr, formatter);

            if (fromDate.isAfter(toDate)) {
                System.out.println("FROM date should be before TO date.");
                return;
            }

            int workingDays = 0;
            LocalDate date = fromDate;
            while (!date.isAfter(toDate)) {
                if (date.getDayOfWeek().getValue() < 6) { // 1=Monday, 7=Sunday
                    workingDays++;
                }
                date = date.plusDays(1);
            }

            System.out.println("Number of working days between " + fromDateStr + " and " + toDateStr + ": " + workingDays);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter dates in DD/MM/YYYY format.");
        }
    }

    // Helper method for test cases
    private static void runTestCase(String from, String to) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("FROM: %-12s TO: %-12s => ", from, to);
        if (!isValidDateFormat(from) || !isValidDateValues(from)) {
            System.out.println("FROM date is not valid.");
            return;
        }
        if (!isValidDateFormat(to) || !isValidDateValues(to)) {
            System.out.println("TO date is not valid.");
            return;
        }
        try {
            LocalDate fromDate = LocalDate.parse(from, formatter);
            LocalDate toDate = LocalDate.parse(to, formatter);
            if (fromDate.isAfter(toDate)) {
                System.out.println("FROM date should be before TO date.");
                return;
            }
            int workingDays = 0;
            LocalDate date = fromDate;
            while (!date.isAfter(toDate)) {
                if (date.getDayOfWeek().getValue() < 6) {
                    workingDays++;
                }
                date = date.plusDays(1);
            }
            System.out.println("Working Days: " + workingDays);
        } catch (Exception e) {
            System.out.println("Invalid date format.");
        }
    }
}
