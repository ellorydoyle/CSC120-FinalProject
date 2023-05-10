import java.util.Scanner;

public class Week3 {

    static String finishedReading;
    static Scanner keyboard;
    static String week3Choice1;
    static String week3Choice2;
    static String week3Choice3;
    public static final String blue = "\u001B[34m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public Week3(Scanner keyboard){
        keyboard = new Scanner(System.in);
    }

    public static void choice1() throws InterruptedException{
		System.out.println("\n[WEEK THREE]\n");
        Thread.sleep(2000);
        System.out.println("How many weeks before sectionals? You didn't know it was this long. Guess you should decide what to do.");
        System.out.print("a. Talk with Glee Club\nb. Sing a song\n> ");
        boolean valid = false;
        while (valid == false){
            week3Choice1 = keyboard.nextLine().toLowerCase(); 
            if (week3Choice1.equals("a")){
                GleeClub.randomGleeClique();
                valid = true;
            }
            else if (week3Choice1.equals("b")){
                SingASong.pickAGenre();
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        choice2();
	}

	public static void choice2() throws InterruptedException{
        System.out.println("You get a sense that things are almost over.");
        System.out.print("a. Talk with Glee Club\nb. Sing a song\n> ");
        boolean valid = false;
        while (valid == false){
            week3Choice2 = keyboard.nextLine().toLowerCase(); 
            if (week3Choice2.equals("a")){
                GleeClub.randomGleeClique();
                valid = true;
            }
            else if (week3Choice2.equals("b")){
                SingASong.pickAGenre();
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        choice3();
	}

	public static void choice3() throws InterruptedException{
        System.out.println("Make this one count.");
        System.out.print("a. Talk with Glee Club\nb. Sing a song\n> ");
        boolean valid = false;
        while (valid == false){
            week3Choice3 = keyboard.nextLine().toLowerCase(); 
            if (week3Choice3.equals("a")){
                GleeClub.randomGleeClique();
                valid = true;
            }
            else if (week3Choice3.equals("b")){
                SingASong.pickAGenre();
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        //Sectionals.
	}

}
