public class User {
    
    String name;
    String group;

    public User (String name, String group, int wantToWin){
        this.name = name;
        this.group = group;
        System.out.println("Welcome to William McKinley High! Here are your starting stats:");
        System.out.println("Name: " + this.name);
        System.out.println("Group: " + this.group);
        if (wantToWin < 5){
            System.out.println("Current Desire to win Sectionals: Low");
        }
        if (wantToWin == 5){
            System.out.println("Current Desire to win Sectionals: Undecided");
        }
        if (wantToWin > 5){
            System.out.println("Current Desire to win Sectionals: High");
        }
    }

    
}
