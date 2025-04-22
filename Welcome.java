import java.util.Scanner;
public class Welcome {
    private String initialChoice;
    // This class will check the person's access to smith buildings. If a student, will get a scavengerhunt that sends them to go to different campus houses, if not will not send them to publicly accessible buildings. 
    public static void main(String[] args) {
        System.out.println("Welcome to scavenger hunt");
        Scanner input= new Scanner(System.in);
        //String initialChoice= input.next();
        System.out.println(" You are just finished wtih your CSC class in Ford Hall 342 at 12:05pm. After the professors wraps up, you are givent a scavenger hunt to get done before your next class.");
        System.out.println(" If you can correctly guess the word, you are granted 5 extra credits for the class. \n The Rules of The Scavenger Hunt. \n 1. You are allowed to go to any of the buildings on the Map and collect letters and points. \n 2. Every letter counts as 5 points \n 3. The correct Words given by STEM students earn 3 extra points. \n 4. You can WIN the game by collecting 500 words and running into 10 STEM students without necessarily guessing the right word. \n 5. You can guess the word at any point in the game; you just have to type -guess the game-. You have 5 trials before being exited from the game. \n 6. You are allowed to ask anybody you ran into. ");
        System.out.println("");
        System.out.println("Let's get started");
        
    }
}
