import java.util.Scanner;

public class OnlineReservationSystem {

    static String username = "admin";
    static String password = "1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE RESERVATION SYSTEM =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("Invalid Login Credentials");
            return;
        }

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Reserve Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.print("PNR Number: ");
                    String pnr = sc.nextLine();

                    System.out.print("Train Number: ");
                    String trainNo = sc.nextLine();

                    System.out.print("Train Name: ");
                    String trainName = sc.nextLine();

                    System.out.print("From: ");
                    String source = sc.nextLine();

                    System.out.print("To: ");
                    String destination = sc.nextLine();

                    System.out.println("\n===== TICKET BOOKED =====");
                    System.out.println("Passenger: " + name);
                    System.out.println("PNR: " + pnr);
                    System.out.println("Train Number: " + trainNo);
                    System.out.println("Train Name: " + trainName);
                    System.out.println("From: " + source);
                    System.out.println("To: " + destination);

                    break;

                case 2:

                    System.out.print("Enter PNR Number: ");
                    String cancelPNR = sc.nextLine();

                    System.out.println("Ticket with PNR "
                            + cancelPNR +
                            " cancelled successfully.");

                    break;

                case 3:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
