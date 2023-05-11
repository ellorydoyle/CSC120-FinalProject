import java.util.Scanner;

public class Week1 {
    /**  When is the user finished reading */
    static String finishedReading;
    /**  User input */
    static Scanner keyboard;
    /** The first choice you make */
    static String week1Choice1;
    /** The second choice you make */
    static String week1Choice2;
    /** The third choice you make */
    static String week1Choice3;
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
        System.out.println("""
            
                                 ██████╗ ██╗     ███████╗███████╗                                        
                                ██╔════╝ ██║     ██╔════╝██╔════╝██╗                                     
                                ██║  ███╗██║     █████╗  █████╗  ╚═╝                                     
                                ██║   ██║██║     ██╔══╝  ██╔══╝  ██╗                                     
                                ╚██████╔╝███████╗███████╗███████╗╚═╝                                     
                                 ╚═════╝ ╚══════╝╚══════╝╚══════╝                                        
                                                                                     
                  ████████╗██╗  ██╗███████╗    ██████╗  ██████╗  █████╗ ██████╗                        
                  ╚══██╔══╝██║  ██║██╔════╝    ██╔══██╗██╔═══██╗██╔══██╗██╔══██╗                       
                     ██║   ███████║█████╗      ██████╔╝██║   ██║███████║██║  ██║                       
                     ██║   ██╔══██║██╔══╝      ██╔══██╗██║   ██║██╔══██║██║  ██║                       
                     ██║   ██║  ██║███████╗    ██║  ██║╚██████╔╝██║  ██║██████╔╝                       
                     ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═════╝                        
                                                                                     
 ████████╗ ██████╗     ███████╗███████╗ ██████╗████████╗██╗ ██████╗ ███╗   ██╗ █████╗ ██╗     ███████╗
 ╚══██╔══╝██╔═══██╗    ██╔════╝██╔════╝██╔════╝╚══██╔══╝██║██╔═══██╗████╗  ██║██╔══██╗██║     ██╔════╝
    ██║   ██║   ██║    ███████╗█████╗  ██║        ██║   ██║██║   ██║██╔██╗ ██║███████║██║     ███████╗
    ██║   ██║   ██║    ╚════██║██╔══╝  ██║        ██║   ██║██║   ██║██║╚██╗██║██╔══██║██║     ╚════██║
    ██║   ╚██████╔╝    ███████║███████╗╚██████╗   ██║   ██║╚██████╔╝██║ ╚████║██║  ██║███████╗███████║
    ╚═╝    ╚═════╝     ╚══════╝╚══════╝ ╚═════╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝╚══════╝

                                            [PRESS ENTER]                                                                      
        """);
        finishedReading = keyboard.nextLine();
        System.out.println("\n[WEEK ONE]\n");
        Thread.sleep(2000);
        System.out.println("You walk into the hallway, the scent of high school sadness filling your nostrils. You're excited for your first week at McKinley, and your first week working with the Glee Club, but you don't know where to start.");
        System.out.print("a. Talk with Glee Club\nb. Sing a song\n> ");
        boolean valid = false;
        while (valid == false){
            week1Choice1 = keyboard.nextLine().toLowerCase(); 
            if (week1Choice1.equals("a")){
                GleeClub.randomGleeClique();
                valid = true;
            }
            else if (week1Choice1.equals("b")){
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
        System.out.println("\n\nYou walk back into the hallway, with a sense of dread that you need to make another choice.");
        System.out.print("a. Talk with Glee Club\nb. Sing a song\n> ");
        boolean valid = false;
        while (valid == false){
            week1Choice2 = keyboard.nextLine().toLowerCase(); 
            if (week1Choice2.equals("a")){
                GleeClub.randomGleeClique();
                valid = true;
            }
            else if (week1Choice2.equals("b")){
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
        System.out.println("\n\nYou have so much energy for some reason. Time to get stuff done!");
        System.out.print("a. Talk with Glee Club\nb. Sing a song\n> ");
        boolean valid = false;
        while (valid == false){
            week1Choice3 = keyboard.nextLine().toLowerCase(); 
            if (week1Choice3.equals("a")){
                GleeClub.randomGleeClique();
                valid = true;
            }
            else if (week1Choice3.equals("b")){
                SingASong.pickAGenre();
                valid = true;
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Talk with Glee Club\nb. Sing a song\n> ");
            }
        }
        System.out.println("\n\"Wow\" you think. The week is already over. You get excited for what might be next.");
        Thread.sleep(2000);
        Week2.choice1();
    }
        
}
