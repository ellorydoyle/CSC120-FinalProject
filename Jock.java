import java.util.ArrayList;
import java.util.Random;
///three options for each glee interaction per clique
	///desire to win goes up if you talk with a glee member in your clique
	///desire to win falls if you talk with a glee member not in your clique
	///club unity goes up if you talk nice with person
public class Jock {
      
    public String firstName;
    public String lastName;
    public String nickName;
    public String fullName;
    int wantToWin;
    public boolean gleeClub;
    static ArrayList<Jock> nonGleeJocks;
    static ArrayList<Jock> gleeJocks;

    public Jock (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeJocks = new ArrayList<Jock>();
        gleeJocks = new ArrayList<Jock>();
    }
    public Jock (String firstName, String lastName, String nickName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeJocks = new ArrayList<Jock>();
        gleeJocks = new ArrayList<Jock>();
    }

    public static ArrayList<Jock> pullNonGleeJocks(){
        for (int i = 0; i < McKinleyHigh.jocks.size(); i++){
            Jock person = McKinleyHigh.jocks.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == false){
                nonGleeJocks.add(person);
            }
        }
        return nonGleeJocks;
    }

    public static ArrayList<Jock> pullGleeJocks(){
        for (int i = 0; i < McKinleyHigh.jocks.size(); i++){
            
            Jock person = McKinleyHigh.jocks.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == true){
                gleeJocks.add(person);
            }
        }
        return gleeJocks;
    }

    public static void generateRandomInteraction(){
        ArrayList<Jock> gleeJocks = GleeClub.compileGleeJocks();
		Random rand1 = new Random();
		Jock randomJock = gleeJocks.get(rand1.nextInt(gleeJocks.size()));
		String jockName = randomJock.firstName;
        Random rand = new Random();
        int randomInteraction = rand.nextInt((3));
        if (randomInteraction == 0){
            interaction1(jockName);
        }
        if (randomInteraction == 1){
            interaction2(jockName);
        }
        if (randomInteraction == 2){
            interaction3(jockName);
        }
    }

    public static void interaction1(String jockName){
    }

    public static void interaction2(String jockName){
    }

    public static void interaction3(String jockName){
    }
    
}
