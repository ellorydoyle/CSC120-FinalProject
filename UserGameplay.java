import java.util.Scanner;

import Groups.Cheerio;
import Groups.Jock;
import Groups.Normie;
import Groups.Adult;

public class UserGameplay {

    static String firstName;
    static String lastName;
    static String group;

    public main(){
        System.out.println("What is your first name?");
        Scanner userInput = new Scanner(System.in);
        firstName = userInput.nextLine();
        System.out.println("What is your last name?");
        lastName = userInput.nextLine();
        System.out.println("Amazing! Now what group in McKinley High would you be a part of? There are:\na. Cheerios\nb. Jocks\nc. Normies");
        group = userInput.nextLine();
        McKinleyHigh.main();
        if (group == "a"){
            McKinleyHigh.addCheerio(new Cheerio(firstName,lastName, 2, true));
        }
        System.out.println("""
                Welcome to McKinley High School! 
                """;)
    }
}
