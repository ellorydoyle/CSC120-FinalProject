import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/** 
 *  Class representing a Normie
 */
public class Normie {
    /**  What is the first name? */
    public String firstName;
    /**  What is the last name? */
    public String lastName;
    /**  What is the full name? */
    public String fullName;
    /**  How much does the Normie want the gleeClub to win? */
    int wantToWin;
    /**  Is the Normie affiliated with the gleeClub? */
    public boolean gleeClub;
    /**  How does the user respond to the Normie */
    static String normieAnswer;
    /**  User input */
    static Scanner keyboard;
    /**  When is the user finished reading */
    static String finishedReading;
    /**  Who are the Normies who are not in glee? */
    static ArrayList<Normie> nonGleeNormies;
    /**  Who are the Normies who are in glee? */
    static ArrayList<Normie> gleeNormies;
    /**  Makes text appear blue */
    public static final String blue = "\u001B[34m";
    /**  Makes text appear red */
    public static final String red = "\u001B[31m";
    /**  Makes text appear green */
    public static final String green = "\u001B[32m";
    /**  Makes text reset to normal */
    public static final String reset = "\u001B[0m";

    /** 
  	 *  Constructor for Normie
     *  @param firstName The first name of the Normie
     *  @param lastName The last name of the Normie
     *  @param wantToWin The desire of the Normie for the glee club to win
     *  @param gleeClub If the Normie is affiliated with the glee club
 	 */
    public Normie (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeNormies = new ArrayList<Normie>();
        gleeNormies = new ArrayList<Normie>();
    }

    /** 
  	 *  Create an ArrayList of all the Normies that are not in Glee
 	 *  @return the non-Glee Normies
 	 */
    public static ArrayList<Normie> pullNonGleeNormies(){
        for (int i = 0; i < McKinleyHigh.normies.size(); i++){
            Normie person = McKinleyHigh.normies.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == false){
                nonGleeNormies.add(person);
            }
        }
        return nonGleeNormies;
    }

    /** 
  	 *  Create an ArrayList of all the Normies that are in Glee
 	 *  @return the Glee Normies
 	 */
    public static ArrayList<Normie> pullGleeNormies(){
        for (int i = 0; i < McKinleyHigh.normies.size(); i++){
            
            Normie person = McKinleyHigh.normies.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == true){
                gleeNormies.add(person);
            }
        }
        return gleeNormies;
    }

    /** 
  	 *  Randomly pick one of the Normie interactions to have
 	 */
    public static void generateRandomInteraction(){
        keyboard = new Scanner(System.in);
        ArrayList<Normie> gleeNormies = GleeClub.compileGleeNormies();
		Random rand3 = new Random();
		Normie randomNormie = gleeNormies.get(rand3.nextInt(gleeNormies.size()));
        String normieName = randomNormie.firstName;
        Random rand = new Random();
        int randomInteraction = rand.nextInt((3));
        if (randomInteraction == 0){
            interaction1(normieName);
        }
        if (randomInteraction == 1){
            interaction2(normieName);
        }
        if (randomInteraction == 2){
            interaction3(normieName);
        }
    }

    /** 
  	 * The one of the interactions you could have with a Normie
     * @param normieName The name of the Normie you are having a conversation with
 	 */
    public static void interaction1(String normieName){
        System.out.println("\nYou enter the library and notice " + normieName + " sitting at the oldest computer you've ever seen.");
        System.out.println(green + normieName.toUpperCase() + ": Please, " + Main.firstName + ", Please can you help me with this piece of junk? It's not even loading the twenty minute Rush 2112 Overture and I was thinking of pitching it as an ensemble piece.\n" + reset);
        System.out.print("\nYou wait a moment.\na. Do you hear yourself? I hope that computer never loads. \nb. I've never listened to it before, but I trust your judgement. Sure! I'll help.\n> ");
        boolean valid = false;
        while (valid == false){
            normieAnswer = keyboard.nextLine().toLowerCase(); 
            if (normieAnswer.equals("a")){
                valid = true;
            }
            else if (normieAnswer.equals("b")){
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Do you hear yourself? I hope that computer never loads.\nb. I've never listened to it before, but I trust your judgement. Sure! I'll help.\n> ");
            }
        }
        if (normieAnswer.equals("a")){
            System.out.println("\n" + Main.firstName + ": Do you hear yourself? I hope that computer never loads.");
            System.out.println(green + normieName.toUpperCase() + ": I think your presence is actually making it lag more. Just leave, I don't care anyway.\n" + reset);
            if (Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin - 1;
            }
            else if (!Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin - 3;
            }
            System.out.print("");
            if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            Main.gleeOutcome = Main.gleeOutcome - 2;
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
            System.out.println("Maybe be nicer next time. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
        }
        if (normieAnswer.equals("b")){
            System.out.println("\n" + Main.firstName + ": I've never listened to it before, but I trust your judgement. Sure! I'll help.");
            System.out.println(green + normieName.toUpperCase() + ": Nice. I'll let you have the big guitar solo!\n" + reset);
            if (Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin + 1;
            }
            System.out.print("");
            if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            Main.gleeOutcome = Main.gleeOutcome + 2;
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
            System.out.println("You've increased how much people like you. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
        }
    }

    /** 
  	 * The one of the interactions you could have with a Normie
     * @param normieName The name of the Normie you are having a conversation with
 	 */
    public static void interaction2(String normieName){
        System.out.println("\nYou slip on a curiously placed banana peel in the middle of the hallway, but luckily " + normieName + " was there to help you up.");
        System.out.println(green + normieName.toUpperCase() + ": Watch where you're stepping, " + Main.firstName + ". I'm almost confident Coach Sylvester plants those for people who are on their phones in the hallway. We should totally tinfoil her office as a Glee Club bonding activity.\n" + reset);
        System.out.print("\nYou wait a moment.\na. That's the dumbest idea I've ever heard. \nb. I thought you'd never ask.\n> ");
        boolean valid = false;
        while (valid == false){
            normieAnswer = keyboard.nextLine().toLowerCase(); 
            if (normieAnswer.equals("a")){
                valid = true;
            }
            else if (normieAnswer.equals("b")){
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. That's the dumbest idea I've ever heard.\nb. I thought you'd never ask.\n> ");
            }
        }
        if (normieAnswer.equals("a")){
            System.out.println("\n" + Main.firstName + ": That's the dumbest idea I've ever heard.");
            System.out.println(green + normieName.toUpperCase() + ": And you're the dumbest person I've ever met, seems we're at an impasse.\n" + reset);
            if (Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin - 2;
            }
            else if (!Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin - 2;
            }
            System.out.print("");
            if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            Main.gleeOutcome = Main.gleeOutcome - 1;
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
            System.out.println("Maybe be nicer next time. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
        }
        if (normieAnswer.equals("b")){
            System.out.println("\n" + Main.firstName + ": I thought you'd never ask.");
            System.out.println(green + normieName.toUpperCase() + ": I'll go ask Mr. Schue where the cameras in the hallway are!\n" + reset);
            if (Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin + 1;
            }
            System.out.print("");
            if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            Main.gleeOutcome = Main.gleeOutcome + 2;
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
            System.out.println("You've increased how much people like you. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
        }
    }

    /** 
  	 * The one of the interactions you could have with a Normie
     * @param normieName The name of the Normie you are having a conversation with
 	 */
    public static void interaction3(String normieName){
        System.out.println("\nYou begin to open up the door to the guidance counselor's office, but " + normieName + " pushes it shut, grabs your wrist, and pulls you aside.");
        System.out.println(green + normieName.toUpperCase() + ": Hey, sorry to startle you, " + Main.firstName + ", but I wanted your help planning a surprise birthday for Finn. Can you lend a hand?\n" + reset);
        System.out.print("\nYou wait a moment.\na. Why? I don't care about birthdays, I think they're stupid.\nb. Of course! Maybe we can meet after school to plan it.\n> ");
        boolean valid = false;
        while (valid == false){
            normieAnswer = keyboard.nextLine().toLowerCase(); 
            if (normieAnswer.equals("a")){
                valid = true;
            }
            else if (normieAnswer.equals("b")){
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Why? I don't care about birthdays, I think they're stupid.\nb. Of course! Maybe we can meet after school to plan it.\n> ");
            }
        }
        if (normieAnswer.equals("a")){
            System.out.println("\n" + Main.firstName + ": Why? I don't care about birthdays, I think they're stupid.");
            System.out.println(green + normieName.toUpperCase() + ": You just like sucking all the fun out of everything.\n" + reset);
            if (Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin - 2;
            }
            else if (!Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin - 2;
            }
            System.out.print("");
            if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            Main.gleeOutcome = Main.gleeOutcome - 1;
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
            System.out.println("Maybe be nicer next time. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
        }
        if (normieAnswer.equals("b")){
            System.out.println("\n" + Main.firstName + ": Of course! Maybe we can meet after school to plan it.");
            System.out.println(green + normieName.toUpperCase() + ": Yes!!! I'll ask Puck to pick us up.\n" + reset);
            if (Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("c")){
                Main.wantToWin = Main.wantToWin + 1;
            }
            System.out.print("");
            if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            Main.gleeOutcome = Main.gleeOutcome + 2;
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
            System.out.println("You've increased how much people like you. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
        }
    }
    
}
