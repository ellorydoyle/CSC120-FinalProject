package Groups;

import java.util.ArrayList;
import java.util.Random;

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

    public static String pullnonGleeCheerios(){
        Random rand = new Random();
        for (int i = 0; i < McKinleyHigh.cheerios.size(); i++){
            Cheerio person = McKinleyHigh.cheerios.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == false){
                nonGleeCheerios.add(person);
            }
        }
        Cheerio randomPerson = nonGleeCheerios.get(rand.nextInt(nonGleeCheerios.size()));
        String randomName = randomPerson.fullName;
        return randomName;
    }

    public static String pullGleeCheerios(){
        Random rand = new Random();
        for (int i = 0; i < McKinleyHigh.cheerios.size(); i++){
            Cheerio person = McKinleyHigh.cheerios.get(i);
            Boolean gleePerson = person.gleeClub;
            if (gleePerson == true){
                gleeCheerios.add(person);
            }
        }
        Cheerio randomPerson = gleeCheerios.get(rand.nextInt(gleeCheerios.size()));
        String randomName = randomPerson.fullName;
        return randomName;
    }
}
