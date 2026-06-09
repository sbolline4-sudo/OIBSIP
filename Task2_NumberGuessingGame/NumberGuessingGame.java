import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char playAgain;

        do {

            System.out.println("Choose Difficulty");
            System.out.println("1. Easy (1-50)");
            System.out.println("2. Medium (1-100)");
            System.out.println("3. Hard (1-500)");

            int choice = sc.nextInt();

            int limit;

            if(choice == 1)
                limit = 50;
            else if(choice == 2)
                limit = 100;
            else
                limit = 500;

            int number = rand.nextInt(limit) + 1;

            int score = 100;
            int attempts = 0;

            while(attempts < 10) {

                System.out.print("Enter Guess: ");
                int guess = sc.nextInt();

                attempts++;

                if(guess == number) {
                    System.out.println("Correct!");
                    System.out.println("Attempts: " + attempts);
                    System.out.println("Score: " + score);
                    break;
                }

                if(guess > number)
                    System.out.println("Too High");
                else
                    System.out.println("Too Low");

                score -= 10;
            }

            System.out.println("Play Again? (Y/N)");
            playAgain = sc.next().charAt(0);

        } while(playAgain == 'Y' || playAgain == 'y');

        sc.close();
    }
}
