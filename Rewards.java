import java.util.ArrayList;
import java.util.Scanner;

public class Rewards {
    //Attributes
    private int points;
    private ArrayList<String> collectedLetters;
    private ArrayList<String> correctLetters;
    private String secretWord;
    private String displayWord; 
    private int wrongGuessCounter;
    private Scanner input;
/**
 * sets the secret word
 */
    public Rewards() {
        this.points = 0;
        this.collectedLetters = new ArrayList<>();
        this.correctLetters = new ArrayList<>();
        this.secretWord = "MCCARTNEYHALL"; 
        this.displayWord = "MCCARTNEY HALL"; 
        this.wrongGuessCounter = 0;
        this.input = new Scanner(System.in);
    }
/**
 * earns points for collecting the secret letters and 
 * @param letter
 */
    public void earnPoints(String letter) {
        String upperLetter = letter.toUpperCase().trim();
        
        if (upperLetter.isEmpty()) {
            System.out.println("Spaces don't count as letters!");
            return;
        }
        if (secretWord.contains(upperLetter)) {
            if (!correctLetters.contains(upperLetter)) {
                correctLetters.add(upperLetter);
                points += 5;
                if (correctLetters.size() == secretWord.length()) {
                    System.out.println("\n⭐ You've collected all unique letters!");
                }
            } else {
                System.out.println("You already collected '" + letter + "'");
                points += 1;
            }
        }
        collectedLetters.add(upperLetter);
        promptForGuess();
    }
/**
 * Displays the letters you have collected so far in the game. 
 * @param collectedLetters ArrayList of letters that make up the secret word.
 */
    public void showCollectedLetters() {
        if (collectedLetters.isEmpty()) {
            System.out.println("No letters collected yet.");
        } else {
            System.out.print("📦 Collected Letters: ");
            for (String letter : collectedLetters) {
                System.out.print(letter + ", ");
            }
            System.out.println();
        }
    }

    private void promptForGuess() {
        System.out.print("\n Do you want to make a guess? (yes/no): ");
        if (input.nextLine().equalsIgnoreCase("yes")) {
            guess();
        }
        else{
            System.out.println("Keep exploring!");
        }
    }
/**
 * allows you to guess the word.
 * @param userGuess stores the user's guess and compares it to the secret word. 
 * @param wrongGuessCounter counts the number of times you get the guess wrong and substitutes 5 points everytime you gets 3 guesses wrong. 
 */
    public void guess() {
        System.out.print("Enter your guess: ");
        String userGuess = input.nextLine().toUpperCase().replace(" ", "");
        
        if (userGuess.equals(secretWord)) {
            System.out.print("\n Hurray! The secret word was '" + displayWord + "'.");
            System.out.println(" The collected points are: " + points);
            System.out.println("You won the game!! Please slack the word to Professor Crousser for the extra po");
        } else {
            System.out.println("Incorrect guess");
            wrongGuessCounter++;
            
            if (wrongGuessCounter % 3 == 0) {
                points = Math.max(0, points - 5);
                System.out.println("⚠️  Penalty: -5 point (3 wrong guesses)");
            }
        }
    }
    
}