import java.util.ArrayList;
import java.util.Scanner;

public class ATMInterface {

    static String userId = "admin";
    static String pin = "1234";
    static double balance = 10000;

    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ATM INTERFACE =====");

        System.out.print("Enter User ID: ");
        String enteredUser = sc.nextLine();

        System.out.print("Enter PIN: ");
        String enteredPin = sc.nextLine();

        if (!enteredUser.equals(userId) || !enteredPin.equals(pin)) {
            System.out.println("Invalid Credentials");
            return;
        }

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Quit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    showHistory();
                    break;

                case 2:
                    withdraw(sc);
                    break;

                case 3:
                    deposit(sc);
                    break;

                case 4:
                    transfer(sc);
                    break;

                case 5:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }

    static void deposit(Scanner sc) {

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        balance += amount;

        history.add("Deposited ₹" + amount);

        System.out.println("Deposit Successful");
    }

    static void withdraw(Scanner sc) {

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {

            balance -= amount;

            history.add("Withdrawn ₹" + amount);

            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    static void transfer(Scanner sc) {

        sc.nextLine();

        System.out.print("Enter Receiver Account Number: ");
        String receiver = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {

            balance -= amount;

            history.add("Transferred ₹" + amount +
                    " to Account " + receiver);

            System.out.println("Transfer Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    static void showHistory() {

        System.out.println("\n===== TRANSACTION HISTORY =====");

        if (history.isEmpty()) {
            System.out.println("No Transactions Yet");
        } else {

            for (String transaction : history) {
                System.out.println(transaction);
            }
        }
    }
}
