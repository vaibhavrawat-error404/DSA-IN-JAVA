import java.util.Scanner;

public class bankingP {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        boolean isRunning=true;
        double balance=1.95;

        while(isRunning) {

            System.out.println("----------------------------------------");
            System.out.println("Welcome to the Online Banking Facility :");
            System.out.println("----------------------------------------");

            System.out.println("Services Provided: ");
            System.out.println("1.Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");

            System.out.println("----------------------------------------");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> checkBalance(balance);
                case 2 -> balance += balance+deposit();
                case 3 -> System.out.println("Please enter your withdrawal");
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

    }
    static void checkBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        System.out.print("Enter amount to deposit: ");
        double amount =sc.nextDouble();

        if(amount < 0){
            System.out.println("Invalid amount");
            return 0;
        }
        else{
            return amount;
        }

    }
}
