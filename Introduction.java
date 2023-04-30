import java.util.Scanner;

import Groups.Cheerio;
import Groups.Jock;
import Groups.Normie;
import Groups.Adult;

public class Introduction {

    String firstName;
    String lastName;
    String group;
    int wantToWin;
    String playedBefore;

    public Introduction(String firstName, String lastName, String group, int wantToWin, String playedBefore){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.wantToWin = wantToWin;
        this.playedBefore = playedBefore;
    }

    public void beginning(){
        System.out.println("Welcome to GLEE: The Road to Sectionals!\nWhat is your first name?");
        Scanner introUserInput = new Scanner(System.in);
        firstName = introUserInput.nextLine().toLowerCase();
        System.out.println("What is your last name?");
        lastName = introUserInput.nextLine().toLowerCase();
        System.out.println("Amazing! Now what group in McKinley High would you be a part of? There are:\na. Cheerios\nb. Jocks\nc. Normies");
        group = introUserInput.nextLine().toLowerCase();
        McKinleyHigh.main();
        if (group == "a"){
            System.out.println("Welcome to McKinley High! Your name is " + firstName + " " + lastName + "and you decided to join the Cheerios. This means that in a count from 1 to 10, your current desire for the Glee Club to survive is at a 2.");
            wantToWin = 2;
            System.out.println("You will be able to check your stats whevever you are told to make a choice, and it will not affect character interactions. Just type the letter before the option that says Check Stats.");
        }
        if (group == "b"){
            System.out.println("Welcome to McKinley High! Your name is " + firstName + " " + lastName + "and you decided to join the Jocks. This means that in a count from 1 to 10, your current desire for the Glee Club to survive is at a 4.");
            wantToWin = 4;
            System.out.println("You will be able to check your stats whevever you are told to make a choice, and it will not affect character interactions. Just type the letter before the option that says Check Stats.");
        }
        if (group == "c"){
            System.out.println("Welcome to McKinley High! Your name is " + firstName + " " + lastName + "and you decided to just be a normie. This means that in a count from 1 to 10, your current desire for the Glee Club to survive is at a 5.");
            wantToWin = 5;
            System.out.println("You will be able to check your stats whevever you are told to make a choice, and it will not affect character interactions. Just type the letter before the option that says Check Stats.");
        }
        System.out.println("Have you played this game before? Please pick one of the following:\na. Yes\nb. No");
        playedBefore = introUserInput.nextLine().toLowerCase();
        System.out.println("Thank you for your patience. Now on to the game!");
        introUserInput.close();
        if (playedBefore == "a"){
            notFirstTime();
        }
        if (playedBefore == "b"){
            firstTime();
        }
    }

    public void notFirstTime(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void firstTime(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("You find yourself sitting in an incredibly uncomfortable chair. You look around and notice pamplets on every conceivable topic in pristine glass stands around the room. You were about to stand up to look at some of them closer, but the sound of the door opening behind you made you stay in your seat.");

    }
}
