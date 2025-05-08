import java.util.Scanner;

public class Welcome {
    //private String initialChoice;
    private String input;

    public static void showInstructions() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Hi, My name is bot! Welcome to my Scavenger Hunt. What's your name?");
        String name = input.next();
        System.out.println("Hi " + name + "! Welcome to 'Is common sense common?");
        System.out.println("");
        System.out.println("GAME RULES");
        System.out.println("====================== \n");
        System.out.println("1. Collect letters from around campus to guess a secret word");
        System.out.println("2. Each correct letter gives you 5 points");
        System.out.println("2. You lose 5 points for every 3 wrong guesses");
        System.out.println("3. Guess the secret word at any point with 'guess' command");
        System.out.println("4. Type 'help' for directions");
        System.out.println("5. Remember: Simple commands will take you a long way.\n");

        System.out.println("Press enter to begin the adventure...");
        input.nextLine();
        input.nextLine();
    }
    public static void main(String[] args) {
        showInstructions();
    }

}
