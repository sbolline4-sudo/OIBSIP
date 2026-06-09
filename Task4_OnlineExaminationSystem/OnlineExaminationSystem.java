import java.util.Scanner;

public class OnlineExaminationSystem {

    static String username = "admin";
    static String password = "1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("   ONLINE EXAMINATION SYSTEM");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("Invalid Login Credentials!");
            return;
        }

        System.out.println("Login Successful!");

        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Update Password");
            System.out.println("2. Start Exam");
            System.out.println("3. Logout");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter New Password: ");
                    password = sc.nextLine();

                    System.out.println("Password Updated Successfully!");
                    break;

                case 2:

                    startExam(sc);
                    break;

                case 3:

                    System.out.println("Logged Out Successfully!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    static void startExam(Scanner sc) {

        int score = 0;

        try {

            System.out.println("\nExam Starts In...");

            for (int i = 3; i >= 1; i--) {

                System.out.println(i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {

            System.out.println("Timer Error");
        }

        System.out.println("\n===== EXAM STARTED =====");

        // Question 1
        System.out.println("\nQ1. Java is a ?");
        System.out.println("1. Programming Language");
        System.out.println("2. Operating System");
        System.out.println("3. Browser");
        System.out.println("4. Database");

        int ans1 = sc.nextInt();

        if (ans1 == 1)
            score++;

        // Question 2
        System.out.println("\nQ2. JVM stands for ?");
        System.out.println("1. Java Variable Method");
        System.out.println("2. Java Virtual Machine");
        System.out.println("3. Joint Virtual Memory");
        System.out.println("4. None");

        int ans2 = sc.nextInt();

        if (ans2 == 2)
            score++;

        // Question 3
        System.out.println("\nQ3. Which company owns Java ?");
        System.out.println("1. Google");
        System.out.println("2. Microsoft");
        System.out.println("3. Oracle");
        System.out.println("4. IBM");

        int ans3 = sc.nextInt();

        if (ans3 == 3)
            score++;

        // Question 4
        System.out.println("\nQ4. Which loop executes at least once ?");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do-while");
        System.out.println("4. none");

        int ans4 = sc.nextInt();

        if (ans4 == 3)
            score++;

        // Question 5
        System.out.println("\nQ5. Which package contains Scanner class ?");
        System.out.println("1. java.io");
        System.out.println("2. java.net");
        System.out.println("3. java.util");
        System.out.println("4. java.sql");

        int ans5 = sc.nextInt();

        if (ans5 == 3)
            score++;

        double percentage = (score * 100.0) / 5;

        System.out.println("\n===== EXAM SUBMITTED =====");

        System.out.println("Score      : " + score + "/5");
        System.out.println("Percentage : " + percentage + "%");

        if (percentage >= 40) {

            System.out.println("Result     : PASS");

        } else {

            System.out.println("Result     : FAIL");
        }
    }
}
