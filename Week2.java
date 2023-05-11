import java.util.Scanner;

public class Week2 {
    /**  When is the user finished reading */
    static String finishedReading;
    /**  User input */
    static Scanner keyboard;
    /** The first choice you make */
    static String week2Choice1;
    /** The second choice you make */
    static String week2Choice2;
    /** The third choice you make */
    static String week2Choice3;
    /**  Makes text appear blue */
    public static final String blue = "\u001B[34m";
    /**  Makes text appear red */
    public static final String red = "\u001B[31m";
    /**  Makes text appear green */
    public static final String green = "\u001B[32m";
    /**  Makes text reset to normal */
    public static final String reset = "\u001B[0m";

    /** 
 	 *  The first choice you make
	 * @throws InterruptedException
 	 */
    public static void choice1() throws InterruptedException{
        keyboard = new Scanner(System.in);
		System.out.println("\n[WEEK TWO]\n");
        Thread.sleep(2000);
        System.out.println("After leaving your fourth math class of the day, you realize you finally have some free time.");
        System.out.print("a. Talk with Glee Club\nb. Sing a song\n> ");
        boolean valid = false;
        while (valid == false){
            week2Choice1 = keyboard.nextLine().toLowerCase(); 
            if (week2Choice1.equals("a")){
                GleeClub.randomGleeClique();
                valid = true;
            }
            else if (week2Choice1.equals("b")){
                SingASong.pickAGenre();
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        choice2();
	}

    /** 
 	 *  The second choice you make
	 * @throws InterruptedException
 	 */
	public static void choice2() throws InterruptedException{
        System.out.println("This second week seems to be going quicker for you. Maybe you've begun to zone out.");
        System.out.print("a. Talk with Glee Club\nb. Sing a song\n> ");
        boolean valid = false;
        while (valid == false){
            week2Choice2 = keyboard.nextLine().toLowerCase(); 
            if (week2Choice2.equals("a")){
                GleeClub.randomGleeClique();
                valid = true;
            }
            else if (week2Choice2.equals("b")){
                SingASong.pickAGenre();
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        choice3();
	}

    /** 
 	 *  The third choice you make
	 * @throws InterruptedException
 	 */
	public static void choice3() throws InterruptedException{
        System.out.println("Stretching your legs, you prepare to wow some more people.");
        System.out.print("a. Talk with Glee Club\nb. Sing a song\n> ");
        boolean valid = false;
        while (valid == false){
            week2Choice3 = keyboard.nextLine().toLowerCase(); 
            if (week2Choice3.equals("a")){
                GleeClub.randomGleeClique();
                valid = true;
            }
            else if (week2Choice3.equals("b")){
                SingASong.pickAGenre();
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        Week3.choice1();
	}

}
