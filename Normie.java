import java.util.ArrayList;
///three options for each glee interaction per clique
	///desire to win goes up if you talk with a glee member in your clique
	///desire to win falls if you talk with a glee member not in your clique
	///club unity goes up if you talk nice with person
import java.util.Random;
import java.util.Scanner;

public class Normie {
      
    public String firstName;
    public String lastName;
    public String fullName;
    int wantToWin;
    public boolean gleeClub;
    static String normieAnswer;
    static Scanner keyboard;
    static String finishedReading;
    static ArrayList<Normie> nonGleeNormies;
    static ArrayList<Normie> gleeNormies;
    public static final String blue = "\u001B[34m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public Normie (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeNormies = new ArrayList<Normie>();
        gleeNormies = new ArrayList<Normie>();
    }

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
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 1;
            }
            else if (!Main.group.equals("a")){
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
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin - 1;
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
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("a")){
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
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin - 1;
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
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("a")){
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
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin - 1;
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
