package Groups;

public class Jock {
      
    public String firstName;
    public String lastName;
    public String nickName;
    public String fullName;
    int wantToWin;
    public boolean gleeClub;

    public Jock (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
    }
    public Jock (String firstName, String lastName, String nickName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
    }
}
