// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class OnlineExaminationSystem {
   static String username = "admin";
   static String password = "1234";

   public OnlineExaminationSystem() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("===== ONLINE EXAMINATION SYSTEM =====");
      System.out.print("Username: ");
      String var2 = var1.nextLine();
      System.out.print("Password: ");
      String var3 = var1.nextLine();
      if (var2.equals(username) && var3.equals(password)) {
         int var4;
         do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Update Password");
            System.out.println("2. Start Exam");
            System.out.println("3. Logout");
            System.out.print("Enter Choice: ");
            var4 = var1.nextInt();
            var1.nextLine();
            switch (var4) {
               case 1:
                  System.out.print("Enter New Password: ");
                  password = var1.nextLine();
                  System.out.println("Password Updated Successfully");
                  break;
               case 2:
                  startExam(var1);
                  break;
               case 3:
                  System.out.println("Logged Out Successfully");
                  break;
               default:
                  System.out.println("Invalid Choice");
            }
         } while(var4 != 3);

         var1.close();
      } else {
         System.out.println("Invalid Login");
      }
   }

   static void startExam(Scanner var0) {
      int var1 = 0;
      System.out.println("\n===== EXAM STARTED =====");
      System.out.println("Q1. Java is?");
      System.out.println("1. Language");
      System.out.println("2. Animal");
      System.out.println("3. Fruit");
      System.out.println("4. Game");
      int var2 = var0.nextInt();
      if (var2 == 1) {
         ++var1;
      }

      System.out.println("\nQ2. JVM stands for?");
      System.out.println("1. Java Virtual Machine");
      System.out.println("2. Java Variable Method");
      System.out.println("3. Joint Virtual Memory");
      System.out.println("4. None");
      int var3 = var0.nextInt();
      if (var3 == 1) {
         ++var1;
      }

      System.out.println("\nQ3. Java is developed by?");
      System.out.println("1. Microsoft");
      System.out.println("2. Oracle");
      System.out.println("3. Google");
      System.out.println("4. IBM");
      int var4 = var0.nextInt();
      if (var4 == 2) {
         ++var1;
      }

      System.out.println("\n===== EXAM SUBMITTED =====");
      System.out.println("Score = " + var1 + "/3");
   }
}
