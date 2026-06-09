import java.util.Scanner;

public class OnlineReservationSystem {

    static String username = "admin";
    static String password = "1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ONLINE RAILWAY RESERVATION SYSTEM ");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("Invalid Login Credentials!");
            return;
        }

        System.out.println("\nLogin Successful!");

        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Reserve Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    int pnr = (int)(Math.random() * 900000) + 100000;

                    System.out.print("Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.print("Journey Date (DD-MM-YYYY): ");
                    String date = sc.nextLine();

                    System.out.print("Train Number: ");
                    String trainNo = sc.nextLine();

                    System.out.print("Train Name: ");
                    String trainName = sc.nextLine();

                    System.out.print("Boarding Station: ");
                    String source = sc.nextLine();

                    System.out.print("Destination Station: ");
                    String destination = sc.nextLine();

                    System.out.println("\nSelect Seat Type");
                    System.out.println("1. Sleeper");
                    System.out.println("2. AC");

                    int seatChoice = sc.nextInt();
                    sc.nextLine();

                    String seatType;

                    if (seatChoice == 1)
                        seatType = "Sleeper";
                    else
                        seatType = "AC";

                    System.out.println("\n=================================");
                    System.out.println("         TRAIN TICKET");
                    System.out.println("=================================");
                    System.out.println("PNR Number      : " + pnr);
                    System.out.println("Passenger Name  : " + name);
                    System.out.println("Journey Date    : " + date);
                    System.out.println("Train Number    : " + trainNo);
                    System.out.println("Train Name      : " + trainName);
                    System.out.println("Seat Type       : " + seatType);
                    System.out.println("From            : " + source);
                    System.out.println("To              : " + destination);
                    System.out.println("=================================");

                    break;

                case 2:

                    System.out.print("Enter PNR Number to Cancel: ");
                    int cancelPNR = sc.nextInt();

                    System.out.println("\nTicket with PNR "
                            + cancelPNR
                            + " has been cancelled successfully.");

                    break;

                case 3:

                    System.out.println("Thank You For Using Online Reservation System!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
