import java.util.Scanner;

import Groups.Cheerio;
import Groups.Jock;
import Groups.Normie;
import Groups.Adult;

public class Main {

    String firstName;
    String lastName;
    String fullName;
    String group;
    int wantToWin;
    String playedBefore;
    String sueAnswer;

    public Main(String firstName, String lastName, String fullName, String group, int wantToWin, String playedBefore){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.group = group;
        this.wantToWin = wantToWin;
        this.playedBefore = playedBefore;
    }

    public void main(){
        System.out.println("Welcome to GLEE: The Road to Sectionals!\nWhat is your first name?");
        Scanner introUserInput = new Scanner(System.in);
        firstName = introUserInput.nextLine().toLowerCase();
        System.out.println("What is your last name?");
        lastName = introUserInput.nextLine().toLowerCase();
        System.out.println("Amazing! Now what group in McKinley High would you be a part of? There are:\na. Cheerios\nb. Jocks\nc. Normies");
        group = introUserInput.nextLine().toLowerCase();
        McKinleyHigh.main();
        if (group == "a"){
            System.out.println("Welcome to McKinley High! Your name is " + fullName + "and you decided to join the Cheerios. This means that in a count from 1 to 10, your current desire for the Glee Club to survive is at a 2.");
            wantToWin = 2;
            System.out.println("You will be able to check your stats whevever you are told to make a choice, and it will not affect character interactions. Just type the letter before the option that says Check Stats.");
        }
        if (group == "b"){
            System.out.println("Welcome to McKinley High! Your name is " + fullName + "and you decided to join the Jocks. This means that in a count from 1 to 10, your current desire for the Glee Club to survive is at a 4.");
            wantToWin = 4;
            System.out.println("You will be able to check your stats whevever you are told to make a choice, and it will not affect character interactions. Just type the letter before the option that says Check Stats.");
        }
        if (group == "c"){
            System.out.println("Welcome to McKinley High! Your name is " + fullName + "and you decided to just be a normie. This means that in a count from 1 to 10, your current desire for the Glee Club to survive is at a 5.");
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
        System.out.println("You find yourself sitting in an incredibly uncomfortable chair in front of a large wooden desk. You look around and notice pamplets on every conceivable topic in pristine glass stands around the room. You were about to stand up to look at some of them closer, but the sound of the door opening behind you made you stay in your seat.\n");
        System.out.println("WOMAN: How are you feeling today, " + firstName + "? I heard you had a bit of a rough transistion, moving to Ohio. If there's anything I can do to help make things easier for you, just let me know.\n");
        System.out.println("As the ginger woman walks to her chair on the other side of the desk, she plucks a pamphlet from one of the many along the wall and examines it, finding it suitable to finally slide to you.\n");
        System.out.println("\"SO YOUR PARENTS LOST THEIR JOBS AND YOU HAD TO MOVE TO OHIO\"\nThe pamphlet's bold title kind of threw you off guard. Your parents actually got promotions, but you didn't think it mattered so much that you needed to correct her.\n");
        System.out.println("MS. PILLSBURY: You can read through that during passing period, we have about thirty minutes in between each class but it shouldn't take you that long. I'm Ms. Pillsbury, the guidance counselor, and I'll check in with you every so often to see how you adjust to your new school! I'll walk you to your first class now, but I want you to give some serious thought to joining a club, too! It's a great way to make friends.\n");
        if (group == "a"){
            System.out.println("As Ms. Pillsbury walks you out of the office, you see a tall, blonde woman in a bright red tracksuit, with a haircut that only Hillary Clinton could love storming her way down the hallway.\n");
            System.out.println("ANGRY WOMAN: UNBELIEVABLE! Butt Chin is ruining this school and every single one of you pimple-faced kleptomaniacs are complicit in his absolute reign of idiocy!");
            System.out.println("MS. PILLSBURY: Be careful, you don't want to get caught in the same hallway as Sue once she launches into a tirade. She sprayed an entire fire extinguisher on a kid in a wheelchair one time and a little bit got on my blouse. I had to leave work early that day.\n");
            System.out.println("As you watch Sue begin to pass by, you notice that her eyes lock onto yours. She pauses, just a foot behind you.\n");
            System.out.println("SUE: Eleanor, is that my new Cheerio you're giving a pathetic excuse for a tour to?");
            System.out.println("MS. PILLSBURY: My name is Emma, and I wasn't aware that " + firstName + " had already talked to you about joining the cheer squad.");
            System.out.println("SUE: Well, Ellen, I would kindly suggest you get your beady little eyes back to editing your stupid pamphlets and let me take over from here.");
            System.out.println("Sue grabs your arm and drags you off to her office. You were confused, you hadn't even heard of the Cheerios before.\n");
            System.out.println("SUE: Excuse me for pulling you away like that, but you're probably better off not being guided around by a naked mole rat with matchsticks for hair anyway. I just saw a glimmer in your eye that let me know you would be the perfect peon, and I'm never wrong about these things.\n");
            System.out.println("\"Peon?\" you think. What does she want you for?\n");
            System.out.println("SUE: You see, the Glee Club at this school has been ruining things for the better part of a month, and I need to get someone on the inside to help break the spirit of that club down to dust. The Cheerios I already sent in got all sappy and soft, so I need fresh blood. I'll let you wear the Cheerios uniform if you promise to make them lose at Sectionals, Figgins already said they would have to shut down if they can't come in first.\n");
            System.out.println("You take a moment to think.");
            System.out.println("a. Yeah, I'll help\nb. No, I don't really want to help.");
            Scanner firstTimeUserInput = new Scanner(System.in);
            sueAnswer = firstTimeUserInput.nextLine().toLowerCase();
            if (sueAnswer == "a"){
                System.out.println(firstName.toUpperCase() + ": Sure, what do I have to lose?");
                System.out.println("SUE: Amazing to hear. I already took your measurements while you were thinking, and I custom ordered your uniform using the miniature computer under my desk. The first Glee Club practice is in twenty minutes. Show up and break it up.\n");
                wantToWin = wantToWin + 1;
                System.out.println("Want To Win: +1 (New Score: " + wantToWin + ")");
            }
            if (sueAnswer == "b"){
                System.out.println(firstName.toUpperCase() + ": I'm not sure I want to be a part of this.");
                System.out.println("SUE: Tough nuts, sweetheart. You're already in whether you like it or not. I took your measurements while you were thinking, and I've already custom ordered your uniform using the miniature computer under my desk. The first Glee Club practice is in twenty minutes. Show up and break it up.]n");
            }
        }
    }
}
