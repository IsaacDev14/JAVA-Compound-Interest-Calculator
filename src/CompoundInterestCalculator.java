import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int  years;
        double amount;

        System.out.print("Enter the Principal Amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest (in % form): ");
        rate = scanner.nextDouble()/ 100;

        System.out.print("Enter the number of times compounded: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/ timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d is: $%.2f",years , amount);

        scanner.close();
    }

}