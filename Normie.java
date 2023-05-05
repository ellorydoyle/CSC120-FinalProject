import java.util.ArrayList;

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

    public static ArrayList<Normie> pullnonGleeNormies(){
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
}
