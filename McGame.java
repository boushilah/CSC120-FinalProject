import java.util.*;

public class McGame{
    //Attributes 
    private static Scanner scanner = new Scanner(System.in);
    private static CampusMap campusMap = new CampusMap();
    private static Rewards rewards = new Rewards();
    private static String currentLocation = "Ford Hall";
    private static int currentFloor = 3;
    private static Random random = new Random();
    private static final Set<String> trapBuildings = new HashSet<>(Arrays.asList(
    "mcconnel" ,"parsons house",  "lawrence house","tyler house"
));


    private static final String[] randomResponses = {
        "Hmm... that's an odd move.",
        "Try something else!",
        "Interesting input, but it doesn't do much.",
        "That command does not exist.",
        "I don't recognize that one. Are you guessing?",
        "Interesting ... Never heard of that.",
        "Tell me more",
        "Don't know what that means",
        "You might need to use help",
        "Not sure what that is"
    };
    private static void initializeMap() {
        campusMap.addBuilding(new Building("Ford Hall", "100 Green Street",true));
        campusMap.addBuilding(new Building("McConnel", "45 Green Street",true));
        campusMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive"));
        campusMap.addBuilding(new House("King House", "7 King Drive"));
        campusMap.addBuilding(new House("Cutter House", "10 Prospect Street"));
        campusMap.addBuilding(new House("Capin House", "3 Neilson Drive"));
        campusMap.addBuilding(new House("Campus Center", "105 Main Street"));
        campusMap.addBuilding(new House("Ziskind House", "10 Elm Street"));
        campusMap.addBuilding(new House("Lawrence house", "5 Elm Street"));
        campusMap.addBuilding(new House("Tyler house", "36 Main Street"));
        campusMap.addBuilding(new House("Seelye", "6 Seelye Drive "));
        campusMap.addBuilding(new House("Chase House", "45 Elm Street"));
        campusMap.addBuilding(new House("Baldwin House", "34 Main Street"));
        campusMap.addBuilding(new House("Parsons house", "36 Cook Street"));
        campusMap.addBuilding(new Building("Bass Hall", "4 Tyler Court", true));
        campusMap.addBuilding(new Library("Hillyer Art Library", "22 Elm Street"));
    }
/**
 * Allows the user to make choices on how to move about the game.
 * @param command takes command from the user.
 * @param currentLocation displays the user's current location
 * @param currentFloor displays the floor on which the user is on.
 */
    private static void gameLoop() {
        System.out.println("📍 Current location: " + currentLocation + ", Floor: " + currentFloor);
        while (true) {
            String command = scanner.nextLine().toLowerCase().trim();
            System.out.println("");
            switch (command) {
                case "help":
                    showHelp();
                    break;
                case "map":
                    System.out.println(campusMap.toString());
                    break;
                case "go":
                    goToBuilding();
                    break;
                case "scan":
                    scanRoom();
                    break;
                case "show letters":
                    rewards.showCollectedLetters();
                    break;
                case "guess":
                    rewards.guess();
                    break;
                case "location":
                    showlocation();
                    break;
                case "exit":
                    System.out.println("You are now out of "+ currentLocation);
                    break;
                case "quit":
                    System.out.println("Thanks for playing! Bye!");
                    return;
                default:
                    System.out.println(randomResponses[random.nextInt(randomResponses.length)]);
            }
        }
    }

    private static void showHelp() {
        System.out.println(" \nCommands:");
        System.out.println("- map     : Show campus buildings");
        System.out.println("- go      : Go to a different building");
        System.out.println("- scan    : Scan the current building for envelopes");
        System.out.println("- show letters : glimpse at the collected letters");
        System.out.println("- guess   : Try to guess the secret word");
        System.out.println("- location: Show the current location");
        System.out.println("- exit    : Moves you out of the house");
        System.out.println("- quit    : Exit the game");
    }
/**
 * Displays the user's location 
 * @param currentLocation displays the user's current location
 * @param currentFloor displays the floor on which the user is on.
 */

    public static void showlocation(){
        System.out.println("\n📍 Current location: " + currentLocation + ", Floor: " + currentFloor);
    }

/**
 * Takes the user to chosen buildings
 * @param name name of the building
 * @param currentLocation displays the user's current location
 * @param currentFloor displays the floor on which the user is on.
 */
    private static void goToBuilding() {
        System.out.print("Enter the name of the building: ");
        String name = scanner.nextLine().trim();
        Building b = campusMap.getBuildingByName(name);
        if (b != null) {
            currentLocation = b.getName();
            currentFloor = 1;
            System.out.println("You are now in " + currentLocation + ".");
        } else {
            System.out.println("That building is not included in the game. Please try again.");
        }
    }
/**
 * scans currentLocation for letters.
 * @param currentLocation stores the building you are in at the moment. 
 */
    private static void scanRoom() {
        if (trapBuildings.contains(currentLocation.toLowerCase())) {
            System.out.println("Oh no! You opened a booby-trapped building! You've been eliminated from the game.\n");
            System.exit(0);
        }
        switch(currentLocation.toLowerCase()) {
            case "ford hall":
                System.out.println("You find Britney in the attrium. She hands you a red envelope. Do you want to open it? (yes/no).");
                String choice = scanner.nextLine().trim().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.print(" Hurray!! The envelop contains the letter M!");
                    rewards.earnPoints("M");
                } 
                else {
                    System.out.println("Keep exploring!");
                    goToBuilding();
                }
                break;
            case "neilson library":
                System.out.println("You see Layla at the front desk. Sitting infront of her is a purple envelope. She hands it to you. Do you want to open it? (yes/no)");
                String choice1 = scanner.nextLine().trim().toLowerCase();
                if (choice1.equals("yes")) {
                    System.out.println("You open the envelope and find the letter C!");
                    rewards.earnPoints("C");
                } 
                else {
                    System.out.println("Seems like someone is scared.");
                    goToBuilding();
                }
                break;
         
            case "king house": 
            System.out.println("You see Kate in the living room studying. Next to her cat Bunny is a red envelope. She hands it to you. Do you want to open it? (yes/no)");
                String choice2 = scanner.nextLine().trim().toLowerCase();
                if (choice2.equals("yes")) {
                System.out.println("You open the envelope and find the letter C!");
                rewards.earnPoints("C"); 
            } 
            else {
                System.out.print("A wise man once said, 'Your fear will never get you anywhere!!' lol Keep exploring");
                goToBuilding();
            }
                break;
            case "cutter house": 
                System.out.println("While scanning the room, you see Shristi setting up the house tea. In the goodies bag the kitchen staff gave her is a note addressed to you. She hands it to you. Do you want to open it? (yes/no)");
                String choice3 = scanner.nextLine().trim().toLowerCase();
                if (choice3.equals("yes")) {
                System.out.println("You read the note and find the letter A!");
                rewards.earnPoints("A");
                } 
                else {
                goToBuilding();
                }   
                 break;
            case "capin house": 
            System.out.println("Jasmine, who is the best Fresbee player on campus greets you as you enter. She says she might have something meant for you. She hands you a book with a note sticking out of it. Do you want to open it? (yes/no)");
            String choice4 = scanner.nextLine().trim().toLowerCase();
                if (choice4.equals("yes")) {
                System.out.println("You read the note and find the letter T!");
                rewards.earnPoints("T");
                }
                else {
                    goToBuilding();
                    } 
                break;
            case "ziskind house": 
                System.out.println("Unfortunately today is not your lucky day. You find your HCA Nimco sitting in the livingroom. You hesitate whether you should go talk to her or just ignore the whole scavenger hunt thing. However, your grades are too bad for you to be caring that much about your HCA that you have a beef with. You swallow your pride and go say hi to Nimco. She hands you a shiny green envelop and just leaves. Do you want to open it or not( Yes/No)? ");
                String choice9 = scanner.nextLine().trim().toLowerCase();
                if (choice9.equals("yes")) {
                System.out.println("You read the note and find the letter N!");
                rewards.earnPoints("N");
                }
                else {
                    goToBuilding();
                    } 
                break;
            case "seelye":
                 System.out.println("Did I just see a wrong turn? Yes I did. BYE FOR NOW!!");
                 System.exit(0);
                 break;
            case "chase house": 
                System.out.println("I am sure you have been chased by Nafisa down the Chase stairs before. If you haven't today might be the day you do or get screamed at. In the elevator Hodan just told you that Nafisa is in her room, but she also mentioned that, on her way to her room from the CC, she spilled her Milkshake. What you need right now is the letter so that you can get to your business. However, you are unsure of whether you want to approach Nafisa or not to ask her for the word. Are you willing to knock or not?( Yes/No) ");
                String choice11 = scanner.nextLine().trim().toLowerCase();
                if (choice11.equals("yes")) {
                System.out.println("The universe might be on your side today. Gretta, Nafisa's friend, opens and hands you an envelop with a letter 'E' written on it.");
                rewards.earnPoints("E");
                }
                else {
                    System.out.println("I guess I am not the only one scared of Nafisa. Good job?!");
                    goToBuilding();
                    } 
                break;

            case "baldwin house": 
                System.out.println("You step into Baldwin House, and the scent of freshly baked cookies fills the air. In the lounge, a group of students are hosting a poetry reading. You quietly take a seat. After some time you are conflicted on whether to stay or not however you remember someone mentioning envelop handling that is going to happen after the event. Do you want to stay or leave now?( Yes/No)");
                String choice12 = scanner.nextLine().trim().toLowerCase();
                if (choice12.equals("yes")) {
                System.out.println("After the event, one of the poets hands you a folded napkin. Inside it, scribbled in pen, is a single letter: Y");
                rewards.earnPoints("Y"); 
                }
                else {
                    goToBuilding();
                    } 
                break;
            case "bass hall": 
                System.out.println("You walk into Bass Hall and find the lobby unusually quiet. A janitor waves you over mysteriously. \\\"Looking for something special?\\\" he asks, handing you a small key. You follow a hallway to an old storage closet. Inside, tucked between stacks of unused lab coats, you find a box. Do you want to open the box (Yes/No)?");
                String choice13 = scanner.nextLine().trim().toLowerCase();
                if (choice13.equals("yes")) {
                System.out.println("You open it, and inside is a slip of paper with the letter H.");
                rewards.earnPoints("H");
                 }
                 else {
                    goToBuilding();
                    } 
                break;
            case "Campus Center":
                System.out.println("The OSE is the only open office in the CC right now. You walk in and ask for a clue for your CSC assignment. Mike, as generous as always, he gives you a popcorn bag. Do you want to open it(Yes/No)?");
                String choice7 = scanner.nextLine().trim().toLowerCase();
                if (choice7.equals("yes")) {
                    rewards.earnPoints("R");
                }
                else {
                    goToBuilding();
                    } 
                break;    
                case "hillyer art library":
                System.out.println("It's your friend Jenny's shift today. As soon as she sees you, she waves to call you to the front desk.");
                System.out.println("She gives you names of 3 books in the collection to choose from:");
                System.out.println("A) The Art of Seeing");
                System.out.println("B) Colors of Imagination");
                System.out.println("C) Hidden Messages in Paint");
            
                System.out.println("\nThe only way to get the letter hidden in the library is if you guess the correct book.");
                System.out.println("Do you want to guess the book or continue looking through other houses?");
                System.out.println("Type 'yes' to guess the book, or 'no' to keep searching.");
            
                String choice8 = scanner.nextLine().trim().toLowerCase();
            
                if (choice8.equals("yes")) {
                    System.out.print("Which book do you choose? (A, B, or C): ");
                    String bookChoice = scanner.nextLine().trim().toUpperCase();
            
                    switch (bookChoice) {
                        case "A":
                            System.out.println("Girl not this one.");
                            break;
                        case "B":
                            System.out.println("Opps wrong choice!!");
                            break;
                        case "C":
                            System.out.println("Great choice! The secret letter is 'A'");
                            rewards.earnPoints("A");
                            break;
                        default:
                            System.out.println("That's not a valid choice. Try typing A, B, or C.");
                    }
                } else {
                    goToBuilding();
                }
                break;
            
            default:
                System.out.println("No letters found here.");
        }
    }
    public static void main(String[] args) {
        initializeMap();
        Welcome.showInstructions();
        System.out.print("Your class just ended in Ford Hall 342 at 12:05pm. After the professor wraps up, you're given a scavenger hunt to complete before your next class. The secret word is a space on campus with a 13 letter name. The building is located in central campus and most people on campus don't have access to it.As you go into houses, you will meet people or find envelops that may or may not contain the letters. Some envelops will contain explosives and certain buildings will be booty trapped!!");
        System.out.println(" If you can correctly guess the word, you are granted 5 extra points towards the final grade for the class.\n");
        gameLoop();
    }
}
