
import java.util.Random;
import java.util.Scanner;

import Groups.Cheerio;
import Groups.Jock;
import Groups.Normie;
import Groups.Adult;

public class Main {

    static String firstName;
    static String lastName;
    static String fullName;
    static String group;
    static int wantToWin;
    static String playedBefore;
    static String sueAnswer;
    static Random random;
    static Scanner keyboard;
    public static final String blue = "\u001B[34m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";


    public Main(String firstName, String lastName, String fullName, String group, int wantToWin, String playedBefore, Scanner keyboard){
        keyboard = new Scanner(System.in);
        Main.firstName = firstName;
        Main.lastName = lastName;
        Main.fullName = firstName + " " + lastName;
        Main.group = group;
        Main.wantToWin = wantToWin;
        Main.playedBefore = playedBefore;
    }

    public static void main(String[] args){
        System.out.println(reset);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Main.introduction();
    }

    public static void introduction (){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Welcome to GLEE: The Road to Sectionals!\n\nWhat is your first name?\n> ");
        keyboard = new Scanner(System.in);
        firstName = keyboard.nextLine();
        System.out.print("\nWhat is your last name?\n> ");
        lastName = keyboard.nextLine();
        System.out.print("\nAmazing! Now what group in McKinley High would you be a part of? There are:\na. Cheerios\nb. Jocks\nc. Normies\n> ");
        fullName = firstName + " " + lastName;
        group = keyboard.nextLine().toLowerCase();
        McKinleyHigh.main();
        if (group.equals("a")){
            System.out.println("\nWelcome to McKinley High! Your name is " + fullName + " and you decided to join the Cheerios. This means that in a count from 1 to 10, your current desire for the Glee Club to survive is at a 2.");
            wantToWin = 2;
            System.out.println("Your stats will update in real time based on your interactions, so watch out for how your choices affect the game!");
        }
        else if (group.equals("b")){
            System.out.println("\nWelcome to McKinley High! Your name is " + fullName + " and you decided to join the Jocks. This means that in a count from 1 to 10, your current desire for the Glee Club to survive is at a 4.");
            wantToWin = 4;
            System.out.println("Your stats will update in real time based on your interactions, so watch out for how your choices affect the game!");
        }
        else if (group.equals("c")){
            System.out.println("\nWelcome to McKinley High! Your name is " + fullName + " and you decided to just be a normie. This means that in a count from 1 to 10, your current desire for the Glee Club to survive is at a 5.");
            wantToWin = 5;
            System.out.println("Your stats will update in real time based on your interactions, so watch out for how your choices affect the game!");
        }
        else{
            keyboard.close();
            throw new RuntimeException("Something went wrong");
        }
        System.out.print("Have you played this game before? Please pick one of the following:\na. Yes\nb. No\n> ");
        playedBefore = keyboard.nextLine().toLowerCase();
        System.out.println("Thank you for your patience. Now on to the game!");
        if (playedBefore.equals("a")){
            Main.notFirstTime();
        }
        if (playedBefore.equals("b")){
            Main.firstTime();
        }
    }

    public static void notFirstTime(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void firstTime(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("You find yourself sitting in an incredibly uncomfortable chair in front of a large wooden desk. You look around and notice pamplets on every conceivable topic in pristine glass stands around the room. You were about to stand up to look at some of them closer, but the sound of the door opening behind you made you stay in your seat.\n");
        System.out.println(blue + "WOMAN: How are you feeling today, " + firstName + "? I heard you had a bit of a rough transistion, moving to Ohio. If there's anything I can do to help make things easier for you, just let me know.\n" + reset);
        System.out.println("As the ginger woman walks to her chair on the other side of the desk, she plucks a pamphlet from one of the many along the wall and examines it, finding it suitable to finally slide to you.\n");
        System.out.println("\"SO YOUR PARENTS LOST THEIR JOBS AND YOU HAD TO MOVE TO OHIO\"\nThe pamphlet's bold title kind of threw you off guard. Your parents actually got promotions, but you didn't think it mattered so much that you needed to correct her.\n");
        System.out.println(blue + "MS. PILLSBURY: You can read through that during passing period, we have about thirty minutes in between each class but it shouldn't take you that long. I'm Ms. Pillsbury, the guidance counselor, and I'll check in with you every so often to see how you adjust to your new school! I'll walk you to your first class now, but I want you to give some serious thought to joining a club, too! It's a great way to make friends.\n" + reset);
        if (group.equals("a")){
            System.out.println("As Ms. Pillsbury walks you out of the office, you see a tall, blonde woman in a bright red tracksuit, with a haircut that only Hillary Clinton could love storming her way down the hallway.\n");
            System.out.println(red + "ANGRY WOMAN: UNBELIEVABLE! Butt Chin is ruining this school and every single one of you pimple-faced kleptomaniacs are complicit in his absolute reign of idiocy!" + reset);
            System.out.println(blue + "MS. PILLSBURY: Be careful, you don't want to get caught in the same hallway as Sue once she launches into a tirade. She sprayed an entire fire extinguisher on a kid in a wheelchair one time and a little bit got on my blouse. I had to leave work early that day.\n" + reset);
            System.out.println("As you watch Sue begin to pass by, you notice that her eyes lock onto yours. She pauses, just a foot behind you.\n");
            System.out.println(red + "SUE: Eleanor, is that my new Cheerio you're giving a pathetic excuse for a tour to?" + reset);
            System.out.println(blue + "MS. PILLSBURY: My name is Emma, and I wasn't aware that " + firstName + " had already talked to you about joining the cheer squad." + reset);
            System.out.println(red + "SUE: Well, Ellen, I would kindly suggest you get your beady little eyes back to editing your stupid pamphlets and let me take over from here.\n" + reset);
            System.out.println("Sue grabs your arm and drags you off to her office. You were confused, you hadn't even heard of the Cheerios before.\n");
            System.out.println(red + "SUE: Excuse me for pulling you away like that, but you're probably better off not being guided around by a naked mole rat with matchsticks for hair anyway. I just saw a glimmer in your eye that let me know you would be the perfect peon, and I'm never wrong about these things.\n" + reset);
            System.out.println("\"Peon?\" you think. What does she want you for?\n");
            System.out.println(red + "SUE: You see, the Glee Club at this school has been ruining things for the better part of a month, and I need to get someone on the inside to help break the spirit of that club down to dust. The Cheerios I already sent in got all sappy and soft, so I need fresh blood. I'll let you wear the Cheerios uniform if you promise to make them lose at Sectionals, Figgins already said they would have to shut down if they can't come in first.\n" + reset);
            System.out.println("You take a moment to think.");
            System.out.print("a. Yeah, I'll help\nb. No, I don't really want to help.\n> ");
            sueAnswer = keyboard.nextLine().toLowerCase();
            if (sueAnswer.equals("a")){
                System.out.println("\n" + firstName.toUpperCase() + ": Sure, what do I have to lose?");
                System.out.println(red + "SUE: Amazing to hear. I already took your measurements while you were thinking, and I custom ordered your uniform using the miniature computer under my desk. The first Glee Club practice is in twenty minutes. Show up and break it up.\n" + reset);
                wantToWin = wantToWin - 1;
                System.out.println("Want To Win: -1 (New Score: " + wantToWin + ")");
                Main.gleeClubIntro();
            }
            else if (sueAnswer.equals("b")){
                System.out.println("\n" + firstName.toUpperCase() + ": I'm not sure I want to be a part of this.");
                System.out.println(red + "SUE: Tough nuts, sweetheart. You're already in whether you like it or not. I took your measurements while you were thinking, and I've already custom ordered your uniform using the miniature computer under my desk. The first Glee Club practice is in twenty minutes. Show up and break it up.\n" + reset);
                wantToWin = wantToWin + 1;
                System.out.println("Want To Win: +1 (New Score: " + wantToWin + ")");
                Main.gleeClubIntro();
            }
        }
        else if (group.equals("b")){
            System.out.println("As Ms. Pillsbury walks you out of the office, you feel a sudden mood shift. Your anxiety from earlier melts away when you see a sign-up sheet on the corkboard as you pass through the hallway.\n");
            System.out.println(firstName + ": The Glee Club?");
            System.out.println(blue + "MS. PILLSBURY: Oh! Do you think you would want to join? I told Will I'd bring him students that show interest!\n" + reset);
            System.out.println("You pause for a second, but nod affirmative. Behind you, the snickers of a gaggle of football players can be heard through the door to the locker room.\n");
            System.out.println(blue + "MS. PILLSBURY: Don't mind them, the football team can be full of real bullies, but you don't have to talk with them if you don't want to." + reset);
            System.out.println(firstName + ": No, it's all right! I actually was planning to try out for the football team too, so I might as well meet my prospective teammates.\n");
            System.out.println("You make a quick turn and wave back towards Ms. Pillsbury. She was nice, but you were ready to meet some actual people your age.\nUpon opening the door to the locker room, you are greeted by a wall of Jocks, staring at you with crossed arms.\n");
            Random rand = new Random();
            String randomName = McKinleyHigh.jocks.get(rand.nextInt(McKinleyHigh.jocks.size())).fullName;
            int randInt = 1;
            while (randInt == 1){
                if (randomName.equals("Noah Puckerman")){
                    randInt = 1;
                    randomName = McKinleyHigh.jocks.get(rand.nextInt(McKinleyHigh.jocks.size())).fullName;
                }
                else if (randomName.equals("Finn Hudson")){
                    randInt = 1;
                    randomName = McKinleyHigh.jocks.get(rand.nextInt(McKinleyHigh.jocks.size())).fullName;
                }
                else if (randomName.equals("Sam Evans")){
                    randInt = 1;
                    randomName = McKinleyHigh.jocks.get(rand.nextInt(McKinleyHigh.jocks.size())).fullName;
                }
                else if (randomName.equals(fullName)){
                    randInt = 1;
                    randomName = McKinleyHigh.jocks.get(rand.nextInt(McKinleyHigh.jocks.size())).fullName;
                }
                else{
                    randInt = 0;
                }
            }
            System.out.println(green + randomName + ": How do you expect us to be" + reset);
        }
    }

    public static void gleeClubIntro(){

    }

}
