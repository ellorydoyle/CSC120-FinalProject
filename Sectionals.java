import java.util.Scanner;

/** 
 *  Class representing Sectionals
 */
public class Sectionals {
	/**  When is the user finished reading */
	static String finishedReading;
	/**  User input */
	static Scanner keyboard;
	/**  Makes text appear blue */
    public static final String blue = "\u001B[34m";
    /**  Makes text appear red */
    public static final String red = "\u001B[31m";
    /**  Makes text appear green */
    public static final String green = "\u001B[32m";
    /**  Makes text reset to normal */
    public static final String reset = "\u001B[0m";

	/** 
 	 *  The intro to sectionals
	 * @throws InterruptedException
 	 */
	public static void sectionalsIntro() throws InterruptedException{
		keyboard = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
		System.out.println("Later that evening, you go to sleep, anxious but excited. You know that when you wake up, you'll finally reach the promised land:\n\n");
		Thread.sleep(2000);
		System.out.println("""
			▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄ ▄▄▄▄▄▄▄ ▄▄    ▄ ▄▄▄▄▄▄ ▄▄▄     ▄▄▄▄▄▄▄ 
			█       █       █       █       █   █       █  █  █ █      █   █   █       █
			█  ▄▄▄▄▄█    ▄▄▄█       █▄     ▄█   █   ▄   █   █▄█ █  ▄   █   █   █  ▄▄▄▄▄█
			█ █▄▄▄▄▄█   █▄▄▄█     ▄▄█ █   █ █   █  █ █  █       █ █▄█  █   █   █ █▄▄▄▄▄ 
			█▄▄▄▄▄  █    ▄▄▄█    █    █   █ █   █  █▄█  █  ▄    █      █   █▄▄▄█▄▄▄▄▄  █
			 ▄▄▄▄▄█ █   █▄▄▄█    █▄▄  █   █ █   █       █ █ █   █  ▄   █       █▄▄▄▄▄█ █
			█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█ █▄▄▄█ █▄▄▄█▄▄▄▄▄▄▄█▄█  █▄▄█▄█ █▄▄█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█
			
						      [PRESS ENTER]                                                                      
			""");
			finishedReading = keyboard.nextLine();
			System.out.println("\nYou meet up in front of the auditorium at McKinley promptly at 8 AM, per Rachel's request. Luckily for the club, the New Directions have a home field advantage this year. Behind you, Mr. Schue claps his hand on your shoulder.\n");
			System.out.println(blue + "MR. SCHUE: Hey, thanks for being a real trooper, " + Main.firstName + ". I don't know how much you actually wanted to do this, but we appreciate all the help we got from you.\n" + reset);
			System.out.println("Taking a big deep breath, you and the other members of the New Directions push open the auditorium doors.\n");
			System.out.println("[ONCE DONE READING, PRESS ENTER]");
			finishedReading = keyboard.nextLine();
			if (Main.gleeOutcome >= 6){
				gleeClubWins();
			}
			if (Main.gleeOutcome < 6){
				gleeClubLoses();
			}
	}

	/** 
 	 *  The glee club wins sectionals
	 * @throws InterruptedException
 	 */
	public static void gleeClubWins() throws InterruptedException{
		System.out.println("♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("  ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("  ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		Thread.sleep(2000);
		System.out.println("\nOn the Sectionals stage, the New Directions sing their hearts out to Don't Stop Believin' -- the choreography hits just right, the energy is up, and everyone's vocals are on point. The judges seem to think so too.\n");
		System.out.println("[ONCE DONE READING, PRESS ENTER]");
		finishedReading = keyboard.nextLine();
		System.out.println("\nAs all the members of the New Directions shift impatiently up on stage with their heads down, the judges shuffle back to their seats. Impatient to announce the results, local fisherman and cat's rights activist Nolan Iceburg grabs the microphone.");
		System.out.println(blue + "NOLAN: The winner for this year's Midwest Show Choir Championship is.........." + reset);
		System.out.println("[PRESS ENTER]");
		finishedReading = keyboard.nextLine();
		System.out.println(blue + "\nTHE NEW DIRECTIONS!\n" + reset);
		System.out.println("Everyone around you sighs with relief, before immediately leaning into big bear hugs. You could feel someone's tears hit the top of your head, but you were so sandwiched in that you couldn't tell who they came from.");
		if (Main.wantToWin >= 6){
			System.out.println("\nYou've never felt a sensation this warm before, and you wonder if you'll always get to feel this way if you stay.");
			System.out.println("\nYou won, and you really hoped you would.");
			System.out.println("\nCongrats! **(Final Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
		}
		if (Main.wantToWin < 6){
			System.out.println("\nYou weren't sure if you really cared as much as everyone else, but it would be a good note on a resume.");
			System.out.println("\nYou might have won, but you won't remember this moment.");
			System.out.println("\nYou didn't really connect with the team enough to enjoy this. **(Final Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
		}
		endOfGame();
	}

	/** 
 	 *  The glee club loses sectionals
	 * @throws InterruptedException
 	 */
	public static void gleeClubLoses() throws InterruptedException{
		System.out.println("♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("  ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("  ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		Thread.sleep(2000);
		System.out.println("\nOn the Sectionals stage, the New Directions sing their hearts out to Bohemian Rhapsody -- but something seems a little off, the energy isn't where it should be, and everyone's vocals falter a bit. The judges seem to think so too.\n");
		System.out.println("[ONCE DONE READING, PRESS ENTER]");
		finishedReading = keyboard.nextLine();
		System.out.println("\nAs all the members of the New Directions shift impatiently up on stage with their heads down, the judges shuffle back to their seats. Impatient to announce the results, local fisherman and cat's rights activist Nolan Iceburg grabs the microphone.");
		System.out.println(blue + "NOLAN: The winner for this year's Midwest Show Choir Championship is.........." + reset);
		System.out.println("[PRESS ENTER]");
		finishedReading = keyboard.nextLine();
		System.out.println(blue + "\nVOCAL ADRENALINE!\n" + reset);
		System.out.println("Everyone around you stays silent, before some drop down to their knees. You could feel someone's tears hit the top of your head, but you were so sandwiched in that you couldn't tell who they came from.");
		if (Main.wantToWin >= 6){
			System.out.println("\nYou don't know what happened. You wanted this so bad, and you thought the team did, too.");
			System.out.println("\nYou've found a home in these people, but now you won't be able to have it anymore.");
			System.out.println("\nSo sorry, seems like you wanted it more than the team did! **(Final Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
		}
		if (Main.wantToWin < 6){
			System.out.println("\nAs everyone around you started to cry, you stayed still and emotionless.");
			System.out.println("\nYou didn't care enough to want them to win, and now they didn't.");
			System.out.println("\nWas this all because of you? You're happy you make such an impact. **(Final Scores: Desire for Glee Club to Win- " + Main.wantToWin + "; Club Unity- " + Main.gleeOutcome + ")**");
		}
		endOfGame();
	}

	/** 
 	 * The end of the game
	 * @throws InterruptedException
 	 */
	public static void endOfGame() throws InterruptedException{
		keyboard.close();
		Thread.sleep(3000);
		System.out.println("\n\n[END OF GAME]");
	}
}
