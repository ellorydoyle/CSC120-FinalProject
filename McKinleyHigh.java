import java.util.ArrayList;

public class McKinleyHigh {

    static ArrayList<Cheerio> cheerios;
    static ArrayList<Jock> jocks;
    static ArrayList<Normie> normies;
    static ArrayList<Adult> adults;

    /* Default constructor, initializes empty ArrayLists */
    public McKinleyHigh() {
        cheerios = new ArrayList<Cheerio>();
        jocks = new ArrayList<Jock>();
        normies = new ArrayList<Normie>();
        adults = new ArrayList<Adult>();
    }

    /**
     * Adds a Cheerio to the school
     * @param b the Cheerio to add
     */
    public void addCheerio(Cheerio b){
        cheerios.add(b);
    }

    /**
     * Adds a Jock to the school
     * @param b the Jock to add
     */
    public void addJock(Jock b){
        jocks.add(b);
    }

    /**
     * Adds a Normie to the school
     * @param b the Normie to add
     */
    public void addNormie(Normie b){
        normies.add(b);
    }

    /**
     * Adds an Adult to the school
     * @param b the Adult to add
     */
    public void addAdult(Adult b){
        adults.add(b);
    }

    /**
     * Creates a school roster
     */
    public static void main(){
        McKinleyHigh roster = new McKinleyHigh();
        roster.addCheerio(new Cheerio("Santana", "Lopez", 6, true));
        roster.addJock(new Jock("Finn", "Hudson", 8, true));
        roster.addNormie(new Normie("Rachel", "Berry", 10, true));
        roster.addCheerio(new Cheerio("Quinn", "Fabray", 7, true));
        roster.addNormie(new Normie("Kurt", "Hummel", 9, true));
        roster.addNormie(new Normie("Artie", "Abrams", 7, true));
        roster.addNormie(new Normie("Mercedes", "Jones", 8, true));
        roster.addJock(new Jock("Noah", "Puckerman", "Puck", 6, true));
        roster.addNormie(new Normie("Tina", "Cohen-Chang", 8, true));
        roster.addCheerio(new Cheerio("Brittany", "Pierce", 7, true));
        roster.addNormie(new Normie("Blaine", "Anderson", 8, true));
        roster.addJock(new Jock("Mike", "Chang", 7, true));
        roster.addJock(new Jock("Sam", "Evans", 8, true));
        roster.addAdult(new Adult("Will", "Schuester", 10, true));
        roster.addAdult(new Adult("Sue", "Sylvester", 1, false));
        roster.addAdult(new Adult("Emma", "Pillsbury", 9, false));
        roster.addAdult(new Adult("Principal", "Figgins", 8, false));
        roster.addCheerio(new Cheerio("Becky", "Jackson", 3, false));
        roster.addCheerio(new Cheerio("Cheerio", "1", 2, false));
        roster.addCheerio(new Cheerio("Cheerio", "2", 2, false));
        roster.addCheerio(new Cheerio("Cheerio", "3", 2, false));
        roster.addCheerio(new Cheerio("Cheerio", "4", 2, false));
        roster.addCheerio(new Cheerio("Cheerio", "5", 2, false));
        roster.addJock(new Jock("Dave", "Karofsky", 4, false));
        roster.addJock(new Jock("Jock", "2", 4, false));
        roster.addJock(new Jock("Jock", "3", 4, false));
        roster.addJock(new Jock("Jock", "4", 4, false));
        roster.addJock(new Jock("Jock", "5", 4, false));
    }
}
