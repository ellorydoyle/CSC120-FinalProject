import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Groups.Cheerio;
import Groups.Jock;
import Groups.Normie;
import Groups.Adult;

public class Week1 {

    
    static String finishedReading;
    static Scanner keyboard;
    public static final String blue = "\u001B[34m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public Week1(Scanner keyboard){
        keyboard = new Scanner(System.in);
    }

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
        System.out.println("You walk into the hallway, the scent of high school sadness filling your nostrils. You're excited for your first week at McKinley, and your first week working with the Glee Club, but you don't know where to start.\n");
        System.out.print("a. Talk with Rachel\nb. Sing a song\nc. Go to your clique");
    }
        
}
