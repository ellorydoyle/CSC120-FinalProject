

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/** 
 *  Class representing a Cheerio
 */
public class Cheerio {
    /**  What is the first name? */
    public String firstName;
    /**  What is the last name? */
    public String lastName;
    /**  What is the full name? */
    public String fullName;
    /**  How much does the Cheerio want the gleeClub to win? */
    int wantToWin;
    /**  Is the Cheerio affiliated with the gleeClub? */
    public boolean gleeClub;
    /**  Who are the Cheerios who are not in glee? */
    static ArrayList<Cheerio> nonGleeCheerios;
    /**  Who are the Cheerios who are in glee? */
    static ArrayList<Cheerio> gleeCheerios;
    /**  User input */
    static Scanner keyboard;
    /**  How does the user respond to the Cheerio */
    static String cheerioAnswer;
    /**  When is the user finished reading */
    static String finishedReading;
    /**  Makes text appear blue */
    public static final String blue = "\u001B[34m";
    /**  Makes text appear red */
    public static final String red = "\u001B[31m";
    /**  Makes text appear green */
    public static final String green = "\u001B[32m";
    /**  Makes text reset to normal */
    public static final String reset = "\u001B[0m";

    /** 
  	 *  Constructor for Cheerio
     *  @param firstName The first name of the Cheerio
     *  @param lastName The last name of the Cheerio
     *  @param wantToWin The desire of the Cheerio for the glee club to win
     *  @param gleeClub If the Cheerio is affiliated with the glee club
 	 */
    public Cheerio (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeCheerios = new ArrayList<Cheerio>();
        gleeCheerios = new ArrayList<Cheerio>();
    }

    /** 
  	 *  Create an ArrayList of all the Cheerios that are not in Glee
 	 *  @return the non-Glee Cheerios
 	 */
    public static ArrayList<Cheerio> pullNonGleeCheerios(){
        for (int i = 0; i < McKinleyHigh.cheerios.size(); i++){
            Cheerio person = McKinleyHigh.cheerios.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == false){
                nonGleeCheerios.add(person);
            }
        }
        return nonGleeCheerios;
    }

    /** 
  	 *  Create an ArrayList of all the Cheerios that are in Glee
 	 *  @return the Glee Cheerios
 	 */
    public static ArrayList<Cheerio> pullGleeCheerios(){
        for (int i = 0; i < McKinleyHigh.cheerios.size(); i++){
            
            Cheerio person = McKinleyHigh.cheerios.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == true){
                gleeCheerios.add(person);
            }
        }
        return gleeCheerios;
    }

    /** 
  	 *  Randomly pick one of the Cheerio interactions to have
 	 */
    public static void generateRandomInteraction(){
        keyboard = new Scanner(System.in);
        ArrayList<Cheerio> gleeCheerios = GleeClub.compileGleeCheerios();
		Random rand2 = new Random();
		Cheerio randomCheerio = gleeCheerios.get(rand2.nextInt(gleeCheerios.size()));
		String cheerioName = randomCheerio.firstName;
        Random rand = new Random();
        int randomInteraction = rand.nextInt((3));
        if (randomInteraction == 0){
            interaction1(cheerioName);
        }
        if (randomInteraction == 1){
            interaction2(cheerioName);
        }
        if (randomInteraction == 2){
            interaction3(cheerioName);
        }
    }

    /** 
  	 * The one of the interactions you could have with a Cheerio
     * @param cheerioName The name of the Cheerio you are having a conversation with
 	 */
    public static void interaction1(String cheerioName){
        System.out.println("\nYou walk down the hallway on the way to the Glee Club classroom, and who do you see but " + cheerioName + ".");
        System.out.println(green + cheerioName.toUpperCase() + ": Hey, " + Main.firstName + "! How are you feeling about this crunch before sectionals? I have so many songs I need to rehearse.\n" + reset);
        System.out.print("\nYou wait a moment.\na. I don't really care about it so much, just something to do.\nb. I'm so pumped! This is all I've ever wanted to do.\n> ");
        boolean valid = false;
        while (valid == false){
            cheerioAnswer = keyboard.nextLine().toLowerCase(); 
            if (cheerioAnswer.equals("a")){
                valid = true;
            }
            else if (cheerioAnswer.equals("b")){
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. I don't really care about it so much, just something to do.\nb. I'm so pumped! This is all I've ever wanted to do.\n> ");
            }
        }
        if (cheerioAnswer.equals("a")){
            System.out.println("\n" + Main.firstName + ": I don't really care about it so much, just something to do.");
            System.out.println(green + cheerioName.toUpperCase() + ": I didn't take you for so rude. You know, you should learn to love this club just like I did.\n" + reset);
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin - 2;
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
            Main.gleeOutcome = Main.gleeOutcome - 3;
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
        if (cheerioAnswer.equals("b")){
            System.out.println("\n" + Main.firstName + ": I'm so pumped! This is all I've ever wanted to do.");
            System.out.println(green + cheerioName.toUpperCase() + ": I'm glad to hear you're so on board, I wasn't really expecting it.\n" + reset);
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            else if (!Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 1;
            }
            System.out.print("");
            if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            Main.gleeOutcome = Main.gleeOutcome + 1;
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
  	 * The one of the interactions you could have with a Cheerio
     * @param cheerioName The name of the Cheerio you are having a conversation with
 	 */
    public static void interaction2(String cheerioName){
        System.out.println("\nYou walk past a couple of science rooms, and as you're craning your neck to catch a glimpse of the solar system with only five planets, you bump into " + cheerioName + ".");
        System.out.println(green + cheerioName.toUpperCase() + ": Watch Out! Oh, its you, " + Main.firstName + "! Did you happen to hear what Coach Sylvester about Mr. Schue? I'm starting to feel a little guilty being in both clubs.\n" + reset);
        System.out.print("\nYou wait a moment.\na. He deserves anything he's got coming to him.\nb. I know, it's terrible. I think they need to stop fighting so much.\n> ");
        boolean valid = false;
        while (valid == false){
            cheerioAnswer = keyboard.nextLine().toLowerCase(); 
            if (cheerioAnswer.equals("a")){
                valid = true;
            }
            else if (cheerioAnswer.equals("b")){
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. He deserves anything he's got coming to him.\nb. I know, it's terrible. I think they need to stop fighting so much.\n> ");
            }
        }
        if (cheerioAnswer.equals("a")){
            System.out.println("\n" + Main.firstName + ": He deserves anything he's got coming to him.");
            System.out.println(green + cheerioName.toUpperCase() + ": I can't believe you would talk about Mr. Schue like that. He might not be perfect, but he's trying.\n" + reset);
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin - 2;
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
        if (cheerioAnswer.equals("b")){
            System.out.println("\n" + Main.firstName + ": I know, it's terrible. I think they need to stop fighting so much.");
            System.out.println(green + cheerioName.toUpperCase() + ": Nice to hear you have some sympathy, unlike some other people I've talked to.\n" + reset);
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 3;
            }
            else if (!Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 1;
            }
            System.out.print("");
            if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            Main.gleeOutcome = Main.gleeOutcome + 1;
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
  	 * The one of the interactions you could have with a Cheerio
     * @param cheerioName The name of the Cheerio you are having a conversation with
 	 */
    public static void interaction3(String cheerioName){
        System.out.println("\nYou walk up to a vending machine to try and get the newest high-calorie sparkling water, but the can got stuck right at the dispenser. Luckily, " + cheerioName + " stops to help you, and wants to talk.");
        System.out.println(green + cheerioName.toUpperCase() + ": I love this stuff too, " + Main.firstName + "! Shame it has so much sugar. If Coach Sylvester catches me drinking this, she'll flip!\n" + reset);
        System.out.print("\nYou wait a moment.\na. Maybe she has a point. Our bodies are temples. No excuses. \nb. Yeah, she really should let the Cheerios live a little.\n> ");
        boolean valid = false;
        while (valid == false){
            cheerioAnswer = keyboard.nextLine().toLowerCase(); 
            if (cheerioAnswer.equals("a")){
                valid = true;
            }
            else if (cheerioAnswer.equals("b")){
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Maybe she has a point. Our bodies are temples. No excuses. \nb. Yeah, she really should let the Cheerios live a little.\n> ");
            }
        }
        if (cheerioAnswer.equals("a")){
            System.out.println("\n" + Main.firstName + ": Maybe she has a point. Our bodies are temples. No excuses.");
            System.out.println(green + cheerioName.toUpperCase() + ": Stop and think, do you really want this school to become a place where we all just hyper-analyze each other? Bug off.\n" + reset);
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin - 1;
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
        if (cheerioAnswer.equals("b")){
            System.out.println("\n" + Main.firstName + ": Yeah, she really should let the Cheerios live a little.");
            System.out.println(green + cheerioName.toUpperCase() + ": Agreed. We're the most scrutinized group on campus, we deserve a break sometimes.\n" + reset);
            if (Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 1;
            }
            else if (!Main.group.equals("a")){
                Main.wantToWin = Main.wantToWin + 2;
            }
            System.out.print("");
            if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            Main.gleeOutcome = Main.gleeOutcome + 1;
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
