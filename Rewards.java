public class Rewards {
    //Atttributes
    int points;
    String letters;

    void Rewards(){
        //constructor
    }
    int earnPoints( int points){
        // defines what counts as gaining points
        return points;
    }
    int losePoints(in points){
        //defines what makes the person lose points
        return points;
    }
    String wordBank( String c){
        // collects the words you get from people
        return c;
    }
    void win(){
        // Defines what makes the person win
    }
    void lose(){
        //defines what makes the person lose the game. 
    }
    void guess(){
        String secretWord;
        // Guesses the secret word. If true you win the game, otherwise have 5 trials to get it right before you are exited from the game. 
    }
}
