import java.util.ArrayList;
///three options for each glee interaction per clique
	///desire to win goes up if you talk with a glee member in your clique
	///desire to win falls if you talk with a glee member not in your clique
	///club unity goes up if you talk nice with person
import java.util.Random;

public class Normie {
      
    public String firstName;
    public String lastName;
    public String fullName;
    int wantToWin;
    public boolean gleeClub;
    static ArrayList<Normie> nonGleeNormies;
    static ArrayList<Normie> gleeNormies;

    public Normie (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeNormies = new ArrayList<Normie>();
        gleeNormies = new ArrayList<Normie>();
    }

    public static ArrayList<Normie> pullNonGleeNormies(){
        for (int i = 0; i < McKinleyHigh.normies.size(); i++){
            Normie person = McKinleyHigh.normies.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == false){
                nonGleeNormies.add(person);
            }
        }
        return nonGleeNormies;
    }

    public static ArrayList<Normie> pullGleeNormies(){
        for (int i = 0; i < McKinleyHigh.normies.size(); i++){
            
            Normie person = McKinleyHigh.normies.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == true){
                gleeNormies.add(person);
            }
        }
        return gleeNormies;
    }

    public static void generateRandomInteraction(){
        ArrayList<Normie> gleeNormies = GleeClub.compileGleeNormies();
		Random rand3 = new Random();
		Normie randomNormie = gleeNormies.get(rand3.nextInt(gleeNormies.size()));
        String normieName = randomNormie.firstName;
        Random rand = new Random();
        int randomInteraction = rand.nextInt((3));
        if (randomInteraction == 0){
            interaction1(normieName);
        }
        if (randomInteraction == 1){
            interaction2(normieName);
        }
        if (randomInteraction == 2){
            interaction3(normieName);
        }
    }

    public static void interaction1(String normieName){
    }

    public static void interaction2(String normieName){
    }

    public static void interaction3(String normieName){
    }
    
}
