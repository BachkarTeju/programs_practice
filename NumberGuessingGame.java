import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int attemptsLimit = 10;
        int currentRound = 1;
        int totalScore = 0;
        
        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("Round " + currentRound);
            System.out.println("I've selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
            
            while (!guessedCorrectly && attempts < attemptsLimit) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == targetNumber) {
                    guessedCorrectly = true;
                    int roundScore = attemptsLimit - attempts + 1;
                    totalScore += roundScore;
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    System.out.println("Round Score: " + roundScore);
                    System.out.println("Total Score: " + totalScore);
                } else {
                    if (userGuess < targetNumber) {
                        System.out.println("Try a higher number.");
                    } else {
                        System.out.println("Try a lower number.");
                    }
                    System.out.println("Attempts left: " + (attemptsLimit - attempts));
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you couldn't guess the number. It was " + targetNumber + ".");
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scanner.next();
            if (playAgainChoice.equalsIgnoreCase("no")) {
                playAgain = false;
            }
            
            currentRound++;
        }
        
        System.out.println("Thanks for playing! Your final score is: " + totalScore);
    }
}
