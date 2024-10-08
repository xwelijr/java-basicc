import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Mortgage Calculator
 * This program calculates the monthly mortgage payment based on the principal, annual interest rate,
 * and loan term entered by the user.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for principal amount
        double principal = getValidPrincipal(scanner);

        // Get user input for annual interest rate
        double annualInterestRate = getAnnualInterestRate(scanner);

        // Get user input for loan term in years
        int loanTerm = getLoanTerm(scanner);

        // Calculate monthly payment
        double monthlyPayment = calculateMonthlyPayment(principal, annualInterestRate, loanTerm);

        // Format and display the result
        String formattedPayment = formatCurrency(monthlyPayment);
        System.out.println("Monthly Mortgage Payment: " + formattedPayment);

        // Close the scanner
        scanner.close();
    }

    /**
     * Prompts the user for a valid principal amount.
     * @param scanner the Scanner object for user input
     * @return a valid principal amount
     */
    private static double getValidPrincipal(Scanner scanner) {
        double principal; // Declare variable here
        while (true) {
            System.out.print("Principal (between $1,000 and $1,000,000): ");
            principal = scanner.nextDouble(); // Initialize here
            if (principal >= 1000 && principal <= 1000000) {
                return principal; // Valid principal, exit the loop
            } else {
                System.out.println("Please enter a number between 1,000 and 1,000,000.");
            }
        }
    }

    /**
     * Prompts the user for the annual interest rate.
     * @param scanner the Scanner object for user input
     * @return the annual interest rate
     */
    private static double getAnnualInterestRate(Scanner scanner) {
        System.out.print("Annual Interest Rate (%): ");
        return scanner.nextDouble(); // Directly return the input
    }

    /**
     * Prompts the user for the loan term in years.
     * @param scanner the Scanner object for user input
     * @return the loan term in years
     */
    private static int getLoanTerm(Scanner scanner) {
        System.out.print("Loan Term (in years): ");
        return scanner.nextInt(); // Directly return the input
    }

    /**
     * Calculates the monthly mortgage payment.
     * @param principal the loan amount
     * @param annualInterestRate the annual interest rate
     * @param loanTerm the loan term in years
     * @return the monthly payment amount
     */
    private static double calculateMonthlyPayment(double principal, double annualInterestRate, int loanTerm) {
        double monthlyInterestRate = annualInterestRate / 100 / 12; // Convert annual rate to monthly
        int totalPayments = loanTerm * 12; // Total number of monthly payments
        return (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments))
                / (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);
    }

    /**
     * Formats a double value as currency in USD.
     * @param amount the amount to format
     * @return the formatted currency string
     */
    private static String formatCurrency(double amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        return currencyFormatter.format(amount); // Return formatted currency
    }
}
