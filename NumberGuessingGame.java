/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessinggame;

/**
 *
 * @author User
 */

  import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int attempts = 10;
            int score = 0;
            
            System.out.println("Welcome to the Number Guessing Game!");
            
            boolean playAgain = true;
            while (playAgain) {
                int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("\nA random number between 1 and 100 has been generated. You have " + attempts + " attempts.");
                
                int remainingAttempts = attempts;
                boolean guessedCorrectly = false;
                
                while (remainingAttempts > 0 && !guessedCorrectly) {
                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();
                    
                    if (userGuess == generatedNumber) {
                        System.out.println("Congratulations! Your guess is correct.");
                        guessedCorrectly = true;
                    } else if (userGuess < generatedNumber) {
                        System.out.println("Too low. Try a higher number.");
                    } else {
                        System.out.println("Too high. Try a lower number.");
                    }
                    
                    remainingAttempts--;
                }
                
                if (guessedCorrectly) {
                    score++;
                } else {
                    System.out.println("Sorry, you've run out of attempts. The number was: " + generatedNumber);
                }
                
                System.out.println("Your current score: " + score);
                
                System.out.print("Do you want to play again? (yes/no): ");
                String playChoice = scanner.next().toLowerCase();
                
                if (!playChoice.equals("yes")) {
                    playAgain = false;
                }
            }
            
            System.out.println("Thanks for playing the Number Guessing Game! Your final score: " + score);
        }
    }
}