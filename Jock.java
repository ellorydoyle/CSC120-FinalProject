import java.util.ArrayList;

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

    public static ArrayList<Jock> pullnonGleeJocks(){
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
}
