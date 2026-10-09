import java.util.Scanner;

public class CI_calc {

    public static double finalAmount(double principal, double ratePercent, int timesPerYear, double years) {
        double rate = ratePercent / 100;
        return principal * Math.pow(1 + rate / timesPerYear, years * timesPerYear);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the principal amount: ");
            double principal = sc.nextDouble();

            System.out.print("Enter the annual rate (in %, e.g. 5 for 5%): ");
            double ratePercent = sc.nextDouble();

            System.out.print("Enter the number of times interest is compounded per year: ");
            int timesPerYear = sc.nextInt();

            System.out.print("Enter the time period (in years): ");
            double years = sc.nextDouble();

            if (principal < 0 || ratePercent < 0 || timesPerYear <= 0 || years < 0) {
                System.out.println("Invalid input: principal, rate and years must be non-negative, "
                        + "and compounding frequency must be at least 1.");
                return;
            }

            double amount = finalAmount(principal, ratePercent, timesPerYear, years);
            double interest = amount - principal;

            System.out.printf("Final amount:      %.2f%n", amount);
            System.out.printf("Compound interest: %.2f%n", interest);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input: please enter numbers only.");
        }
    }
}