

import java.util.ArrayList;
///three options for each glee interaction per clique
	///desire to win goes up if you talk with a glee member in your clique
	///desire to win falls if you talk with a glee member not in your clique
	///club unity goes up if you talk nice with person
import java.util.Random;
import java.util.Scanner;

public class Cheerio {
      
    public String firstName;
    public String lastName;
    public String fullName;
    int wantToWin;
    public boolean gleeClub;
    static ArrayList<Cheerio> nonGleeCheerios;
    static ArrayList<Cheerio> gleeCheerios;
    static Scanner keyboard;
    public static final String blue = "\u001B[34m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public Cheerio (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeCheerios = new ArrayList<Cheerio>();
        gleeCheerios = new ArrayList<Cheerio>();
    }

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

    public static void interaction1(String cheerioName){
        System.out.println("\nYou walk down the hallway on the way to the Glee Club classroom, and who do you see but " + cheerioName + ".");
        System.out.println(green + cheerioName.toUpperCase() + ": Hey, " + Main.firstName + "! ");
    }

    public static void interaction2(String cheerioName){
    }

    public static void interaction3(String cheerioName){
    }
}
