import java.util.Scanner;

public class Sectionals {

	static String finishedReading;
	static Scanner keyboard;
	public static final String blue = "\u001B[34m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

	public Sectionals(){
		keyboard = new Scanner(System.in);
	}
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

	public static void gleeClubWins() throws InterruptedException{
		System.out.println("♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("  ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("  ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		Thread.sleep(2000);
		System.out.println("\nOn the Sectionals stage, the New Directions sing their hearts out to Don't Stop Believin' -- the choreography hits just right, the energy is up, and everyone's vocals are on point. The judges seem to think so too.\n");

	}

	public static void gleeClubLoses() throws InterruptedException{
		System.out.println("♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("  ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		System.out.println("  ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫   ♫");
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws InterruptedException{
		sectionalsIntro();
	}
}
