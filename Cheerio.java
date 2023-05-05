

import java.util.ArrayList;


public class Cheerio {
      
    public String firstName;
    public String lastName;
    public String fullName;
    int wantToWin;
    public boolean gleeClub;
    static ArrayList<Cheerio> nonGleeCheerios;
    static ArrayList<Cheerio> gleeCheerios;

    public Cheerio (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
        nonGleeCheerios = new ArrayList<Cheerio>();
        gleeCheerios = new ArrayList<Cheerio>();
    }

    public static ArrayList<Cheerio> pullnonGleeCheerios(){
        for (int i = 0; i < McKinleyHigh.cheerios.size(); i++){
            Cheerio person = McKinleyHigh.cheerios.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == false){
                nonGleeCheerios.add(person);
            }
        }
        return nonGleeCheerios;
    }

    public static ArrayList<Cheerio> pullGleeCheerios(){
        for (int i = 0; i < McKinleyHigh.cheerios.size(); i++){
            
            Cheerio person = McKinleyHigh.cheerios.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == true){
                gleeCheerios.add(person);
            }
        }
        return gleeCheerios;
    }
}
