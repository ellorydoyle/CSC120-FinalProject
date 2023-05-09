import java.util.Scanner;

public class Week2 {
    
	static String finishedReading;
    static Scanner keyboard;
    static String week2Choice1;
    static String week2Choice2;
    static String week2Choice3;
    public static final String blue = "\u001B[34m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public Week2(Scanner keyboard){
        keyboard = new Scanner(System.in);
    }

    public static void choice1() throws InterruptedException{
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
                valid = true;
                System.out.println("\nYou are singing a song");
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        choice2();
	}

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
                valid = true;
                System.out.println("\nYou are singing a song");
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        choice3();
	}

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
                valid = true;
                System.out.println("\nYou are singing a song");
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        //Week3.choice1();
	}

}
