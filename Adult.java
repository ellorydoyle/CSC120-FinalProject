
/** 
 *  Class representing an adult
 */
public class Adult {
    /**  What is the first name? */
    public String firstName;
    /**  What is the last name? */
    public String lastName;
    /**  What is the full name? */
    public String fullName;
    /**  How much does the adult want the gleeClub to win? */
    int wantToWin;
    /**  Is the adult affiliated with the gleeClub? */
    public boolean gleeClub;

    /** 
  	 *  Constructor for Adult
     *  @param firstName The first name of the adult
     *  @param lastName The last name of the adult
     *  @param wantToWin The desire of the adult for the glee club to win
     *  @param gleeClub If the adult is affiliated with the glee club
 	 */
    public Adult (String firstName, String lastName, int wantToWin, boolean gleeClub){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.wantToWin = wantToWin;
        this.gleeClub = gleeClub;
    }
}
