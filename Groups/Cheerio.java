package Groups;

public class Cheerio {
      
    public String firstName;
    public String lastName;
    public String fullName;
    int wantToWin;
    public boolean gleeClub;

    public Cheerio (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = 2;
        this.gleeClub = false;
    }
}
