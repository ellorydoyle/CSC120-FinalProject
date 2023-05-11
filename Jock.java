import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/** 
 *  Class representing a Jock
 */
public class Jock {
    /**  What is the first name? */
    public String firstName;
    /**  What is the last name? */
    public String lastName;
    /**  What is the nick name? */
    public String nickName;
    /**  What is the full name? */
    public String fullName;
    /**  How much does the Jock want the gleeClub to win? */
    int wantToWin;
    /**  Is the Jock affiliated with the gleeClub? */
    public boolean gleeClub;
    /**  How does the user respond to the Jock */
    static String jockAnswer;
    /**  User input */
    static Scanner keyboard;
    /**  When is the user finished reading */
    static String finishedReading;
    /**  Who are the Jocks who are not in glee? */
    static ArrayList<Jock> nonGleeJocks;
    /**  Who are the Jocks who are in glee? */
    static ArrayList<Jock> gleeJocks;
    /**  Makes text appear blue */
    public static final String blue = "\u001B[34m";
    /**  Makes text appear red */
    public static final String red = "\u001B[31m";
    /**  Makes text appear green */
    public static final String green = "\u001B[32m";
    /**  Makes text reset to normal */
    public static final String reset = "\u001B[0m";

    /** 
  	 *  Constructor for Jock
     *  @param firstName The first name of the Jock
     *  @param lastName The last name of the Jock
     *  @param wantToWin The desire of the Jock for the glee club to win
     *  @param gleeClub If the Jock is affiliated with the glee club
 	 */
    public Jock (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeJocks = new ArrayList<Jock>();
        gleeJocks = new ArrayList<Jock>();
    }

    /** 
  	 *  Constructor for Jock
     *  @param firstName The first name of the Jock
     *  @param lastName The last name of the Jock
     *  @param nickName The nickname of the Jock
     *  @param wantToWin The desire of the Jock for the glee club to win
     *  @param gleeClub If the Jock is affiliated with the glee club
 	 */
    public Jock (String firstName, String lastName, String nickName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeJocks = new ArrayList<Jock>();
        gleeJocks = new ArrayList<Jock>();
    }

    /** 
  	 *  Create an ArrayList of all the Jocks that are not in Glee
 	 *  @return the non-Glee Jocks
 	 */
    public static ArrayList<Jock> pullNonGleeJocks(){
        for (int i = 0; i < McKinleyHigh.jocks.size(); i++){
            Jock person = McKinleyHigh.jocks.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == false){
                nonGleeJocks.add(person);
            }
        }
        return nonGleeJocks;
    }

    /** 
  	 *  Create an ArrayList of all the Jocks that are in Glee
 	 *  @return the Glee Jocks
 	 */
    public static ArrayList<Jock> pullGleeJocks(){
        for (int i = 0; i < McKinleyHigh.jocks.size(); i++){
            
            Jock person = McKinleyHigh.jocks.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == true){
                gleeJocks.add(person);
            }
        }
        return gleeJocks;
    }

    /** 
  	 *  Randomly pick one of the Jock interactions to have
 	 */
    public static void generateRandomInteraction(){
        keyboard = new Scanner(System.in);
        ArrayList<Jock> gleeJocks = GleeClub.compileGleeJocks();
		Random rand1 = new Random();
		Jock randomJock = gleeJocks.get(rand1.nextInt(gleeJocks.size()));
		String jockName = randomJock.firstName;
        Random rand = new Random();
        int randomInteraction = rand.nextInt((3));
        if (randomInteraction == 0){
            interaction1(jockName);
        }
        if (randomInteraction == 1){
            interaction2(jockName);
        }
        if (randomInteraction == 2){
            interaction3(jockName);
        }
    }

    /** 
  	 * The one of the interactions you could have with a Jock
     * @param jockName The name of the Jock you are having a conversation with
 	 */
    public static void interaction1(String jockName){
        System.out.println("\nYou feel a hard punch to the shoulder, and look up to see " + jockName + ". You wonder why he approached you like that.");
        System.out.println(green + jockName.toUpperCase() + ": Heyyyyy, " + Main.firstName + "! You got some time to talk? I need someone to play bass guitar in my band I'm trying to form, and I'd like someone else in Glee Club to do it, because I trust you guys.\n" + reset);
        System.out.print("\nYou wait a moment.\na. You think I play bass? Gross. \nb. I'll shred it up with you anyday, man!\n> ");
        boolean valid = false;
        while (valid == false){
            jockAnswer = keyboard.nextLine().toLowerCase(); 
            if (jockAnswer.equals("a")){
                valid = true;
            }
            else if (jockAnswer.equals("b")){
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. You think I play bass? Gross.\nb. I'll shred it up with you anyday, man!\n> ");
            }
        }
        if (jockAnswer.equals("a")){
            System.out.println("\n" + Main.firstName + ": You think I play bass? Gross.");
            System.out.println(green + jockName.toUpperCase() + ": Get your head out of the dumpster, dude. It almost seems like you don't care about making friends.\n" + reset);
            if (Main.group.equals("b")){
                Main.wantToWin = Main.wantToWin - 3;
            }
            else if (!Main.group.equals("b")){
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
        if (jockAnswer.equals("b")){
            System.out.println("\n" + Main.firstName + ": I'll shred it up with you anyday, man!");
            System.out.println(green + jockName.toUpperCase() + ": Hell yeah, bro. I'll see if I can bribe a Cheerio into telling me when the practice rooms are next available.\n" + reset);
            if (Main.group.equals("b")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("b")){
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
  	 * The one of the interactions you could have with a Jock
     * @param jockName The name of the Jock you are having a conversation with
 	 */
    public static void interaction2(String jockName){
        System.out.println("\nAcross the hallway, you notice " + jockName + " standing at his locker. He notices you and walks up.");
        System.out.println(green + jockName.toUpperCase() + ": What's up, " + Main.firstName + "? I was thinking about planning a duet with someone else in the club to do later this week. Do you want to do one with me?\n" + reset);
        System.out.print("\nYou wait a moment.\na. No way, man. Sounds lame as hell. \nb. Absolutely! Sounds like a good opportunity to get the group to notice me.\n> ");
        boolean valid = false;
        while (valid == false){
            jockAnswer = keyboard.nextLine().toLowerCase(); 
            if (jockAnswer.equals("a")){
                valid = true;
            }
            else if (jockAnswer.equals("b")){
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. No way, man. Sounds lame as hell.\nb. Absolutely! Sounds like a good opportunity to get the group to notice me.\n> ");
            }
        }
        if (jockAnswer.equals("a")){
            System.out.println("\n" + Main.firstName + ": No way, man. Sounds lame as hell.");
            System.out.println(green + jockName.toUpperCase() + ": Harsh much? Sounds like you took a note from some of the other guys on the team. Get a grip and figure out your priorities.\n" + reset);
            if (Main.group.equals("b")){
                Main.wantToWin = Main.wantToWin - 3;
            }
            else if (!Main.group.equals("b")){
                Main.wantToWin = Main.wantToWin - 1;
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
        if (jockAnswer.equals("b")){
            System.out.println("\n" + Main.firstName + ": Absolutely! Sounds like a good opportunity to get the group to notice me.");
            System.out.println(green + jockName.toUpperCase() + ": That's exactly what I wanted to hear, dude. Let's get this ball rolling.\n" + reset);
            if (Main.group.equals("b")){
                Main.wantToWin = Main.wantToWin + 3;
            }
            else if (!Main.group.equals("b")){
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
  	 * The one of the interactions you could have with a Jock
     * @param jockName The name of the Jock you are having a conversation with
 	 */
    public static void interaction3(String jockName){
        System.out.println("\n" + jockName + " catches your eye while he's putting up posters with GLEE CLUB SIGNUP written in large letters. It seems he also notices you and walks over.");
        System.out.println(green + jockName.toUpperCase() + ": Hey " + Main.firstName + "! You should help me put up some more posters. If we're gonna win Sectionals, we need to pack out our team.\n" + reset);
        System.out.print("\nYou wait a moment.\na. And risk papercuts? No way. \nb. Papercuts are my favorite thing besides a clean gin martini. Let's get to it.\n> ");
        boolean valid = false;
        while (valid == false){
            jockAnswer = keyboard.nextLine().toLowerCase(); 
            if (jockAnswer.equals("a")){
                valid = true;
            }
            else if (jockAnswer.equals("b")){
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. And risk papercuts? No way.\nb. Papercuts are my favorite thing besides a clean gin martini. Let's get to it.\n> ");
            }
        }
        if (jockAnswer.equals("a")){
            System.out.println("\n" + Main.firstName + ": And risk papercuts? No way.");
            System.out.println(green + jockName.toUpperCase() + ": Keep the tone to yourself, I get it.\n" + reset);
            if (Main.group.equals("b")){
                Main.wantToWin = Main.wantToWin - 2;
            }
            else if (!Main.group.equals("b")){
                Main.wantToWin = Main.wantToWin - 1;
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
        if (jockAnswer.equals("b")){
            System.out.println("\n" + Main.firstName + ": Papercuts are my favorite thing besides a clean gin martini. Let's get to it.");
            System.out.println(green + jockName.toUpperCase() + ": I bet you don't even know what that is, but I like the enthusiasm.\n" + reset);
            if (Main.group.equals("b")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("b")){
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
