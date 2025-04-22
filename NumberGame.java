import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String playAgain;

        do {
            int randomNumber = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean hasWon = false;

            System.out.println("🎯 Welcome to the Number Guessing Game!");
            System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("✅ Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    hasWon = true;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("📉 Too low!");
                } else {
                    System.out.println("📈 Too high!");
                }
            }

            if (!hasWon) {
                System.out.println("❌ You’ve used all attempts. The number was: " + randomNumber);
            }

            System.out.println("Current Score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! 🎉 Final Score: " + score);
        sc.close();
    }
}
