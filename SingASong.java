import java.util.Random;
import java.util.Scanner;

import Genres.Broadway;
import Genres.Pop;
import Genres.Rock;

/** 
 *  Class representing Singing a Song
 */
public class SingASong {
    /**  Random songChoice */
	public static String songChoice;
    /**  User input */
	static Scanner keyboard;
    /**  When is the user finished reading */
	public static String finishedReading;
    /**  Makes text appear blue */
    public static final String blue = "\u001B[34m";
    /**  Makes text appear red */
    public static final String red = "\u001B[31m";
    /**  Makes text appear green */
    public static final String green = "\u001B[32m";
    /**  Makes text reset to normal */
    public static final String reset = "\u001B[0m";

    /** 
 	 *  Picking a genre
	 * @throws InterruptedException
 	 */
	public static void pickAGenre() throws InterruptedException{
		keyboard = new Scanner(System.in);
		System.out.println("\nYou enter the choir room and snap towards the piano player. You telepathically tell him which song you want to sing. What genre is it?");
		System.out.print("a. Broadway\nb. Pop\nc. Rock\n> ");
        boolean valid = false;
        while (valid == false){
            songChoice = keyboard.nextLine().toLowerCase(); 
            if (songChoice.equals("a")){
                valid = true;
				randomBroadwaySong();
            }
            else if (songChoice.equals("b")){
                valid = true;
				randomPopSong();
            }
			else if (songChoice.equals("c")){
                valid = true;
				randomRockSong();
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Broadway\nb. Pop\nc. Rock\n> ");
            }
        }
	}
    /** 
 	 *  You sing a random Broadway song
	 * @throws InterruptedException
 	 */
	public static void randomBroadwaySong() throws InterruptedException{
		String broadwaySong = Broadway.randomBroadway();
		System.out.println("\nYou feel determined to blow everyone in the Glee Club's mind with a rendition of " + broadwaySong + " in the choir room. After gathering everyone, you begin to belt it out.\n");
		Thread.sleep(1000);
		System.out.println("♫   ♫   ♫");
		System.out.println("  ♫   ♫");
		Thread.sleep(1000);
		Random rand = new Random();
		int option = rand.nextInt((3));
		if (option == 0){
			System.out.println("\nOnce you finish, Puck stands up in the back of the classroom.\n");
			System.out.println(green + "PUCK: That was awful! I can't believe you think we can make it to sectionals with that crap." + reset);
			Main.wantToWin = Main.wantToWin - 1;
			Main.gleeOutcome = Main.gleeOutcome - 2;
			if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
			System.out.println("It seems not everyone likes Broadway. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
		}
		if (option == 1){
			System.out.println("\nOnce you finish, Kurt starts clapping incredibly loud.\n");
			System.out.println(green + "KURT: Oh, " + Main.firstName + "! That was incredible! Your falsetto is tremendous!" + reset);
			Main.wantToWin = Main.wantToWin + 1;
			Main.gleeOutcome = Main.gleeOutcome + 3;
			if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
			System.out.println("Your song fell on welcome ears. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
		}
		if (option == 2){
			System.out.println("\nOnce you finish, Rachel immediately begins talking.\n");
			System.out.println(green + "RACHEL: That was pretty good! of course, not as good as how I would do it, but I'm glad to see you're taking notes from the master." + reset);
			Main.gleeOutcome = Main.gleeOutcome + 1;
			if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
			System.out.println("She took that surprisingly well. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
		}
	}

    /** 
 	 *  You sing a random Pop song
	 * @throws InterruptedException
 	 */
	public static void randomPopSong() throws InterruptedException{
		String popSong = Pop.randomPop();
		System.out.println("\nYou feel determined to blow everyone in the Glee Club's mind with a rendition of " + popSong + " in the choir room. After gathering everyone, you begin to belt it out.\n");
		Thread.sleep(1000);
		System.out.println("♫   ♫   ♫");
		System.out.println("  ♫   ♫");
		Thread.sleep(1000);
		Random rand = new Random();
		int option = rand.nextInt((3));
		if (option == 0){
			System.out.println("\nOnce you finish, Santana pipes up from behind Finn.\n");
			System.out.println(green + "SANTANA: No one in this club is ever gonna be as good as me, but I guess that was kind of okay." + reset);
			Main.wantToWin = Main.wantToWin + 1;
			Main.gleeOutcome = Main.gleeOutcome + 1;
			if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
			System.out.println("Mediocre response, but not negative. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
		}
		if (option == 1){
			System.out.println("\nOnce you finish, you notice Artie visibly shaking his head.\n");
			System.out.println(green + "ARTIE: Nobody appreciates a good rap song, maybe you should have done one of those instead." + reset);
			Main.wantToWin = Main.wantToWin - 3;
			Main.gleeOutcome = Main.gleeOutcome - 1;
			if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
			System.out.println("That's not how you expected that to go. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
		}
		if (option == 2){
			System.out.println("\nOnce you finish, Mercedes seems obviously excited.\n");
			System.out.println(green + "MERCEDES: That was one of the best performances I've seen out of someone in this club! Really good job, " + Main.firstName + "." + reset);
			Main.wantToWin = Main.wantToWin + 2;
			Main.gleeOutcome = Main.gleeOutcome + 3;
			if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
			System.out.println("You've never felt so excited to sing before. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
		}
	}

    /** 
 	 *  You sing a random Rock song
	 * @throws InterruptedException
 	 */
	public static void randomRockSong() throws InterruptedException{
		String rockSong = Rock.randomRock();
		System.out.println("\nYou feel determined to blow everyone in the Glee Club's mind with a rendition of " + rockSong + " in the choir room. After gathering everyone, you begin to belt it out.\n");
		Thread.sleep(1000);
		System.out.println("♫   ♫   ♫");
		System.out.println("  ♫   ♫");
		Thread.sleep(1000);
		Random rand = new Random();
		int option = rand.nextInt((3));
		if (option == 0){
			System.out.println("\nOnce you finish, Rachel pipes up.\n");
			System.out.println(green + "RACHEL: That would have been fine if it were a different song, but maybe you just didn't think it through enough." + reset);
			Main.wantToWin = Main.wantToWin - 2;
			Main.gleeOutcome = Main.gleeOutcome - 2;
			if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
			System.out.println("Okay, so Rock isn't Rachel's favorite. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
		}
		if (option == 1){
			System.out.println("\nOnce you finish, Puck starts fistpumping from the middle of the crowd.\n");
			System.out.println(green + "PUCK: Hell yeah, " + Main.firstName + "! That makes me want to do more songs like that myself." + reset);
			Main.wantToWin = Main.wantToWin + 2;
			Main.gleeOutcome = Main.gleeOutcome + 3;
			if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
			System.out.println("It's nice to hear a compliment from Puck for a change. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
		}
		if (option == 2){
			System.out.println("\nOnce you finish, Finn whistles.\n");
			System.out.println(green + "FINN: I love that song, dude! I'm glad I finally got to hear someone sing it in the club." + reset);
			Main.wantToWin = Main.wantToWin + 1;
			Main.gleeOutcome = Main.gleeOutcome + 1;
			if (Main.wantToWin < 0){
                Main.wantToWin = 0;
            }
            else if (Main.wantToWin > 10){
                Main.wantToWin = 10;
            }
            if (Main.gleeOutcome < 0){
                Main.gleeOutcome = 0;
            }
            else if (Main.gleeOutcome > 10){
                Main.gleeOutcome = 10;
            }
			System.out.println("You grin a little wide at that. **(New Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
            System.out.println("[ONCE DONE READING, PRESS ENTER]");
            finishedReading = keyboard.nextLine();
		}
	}
}

