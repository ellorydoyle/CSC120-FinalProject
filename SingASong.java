import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Genres.Broadway;
import Genres.Pop;
import Genres.Rock;

public class SingASong {
	
	//Go to club
	//pick a genre
	//random generate a member to react
	//desire goes up when singing
	//random choice determines club unity

	public static Jock person1;
	public static Cheerio person2;
	public static Normie person3;
	public static String randomName;
	public static String songChoice;
	static Scanner keyboard;

	public static String randomNameGenerator(){
		Random rand = new Random();
		int randomClique = rand.nextInt((3));
		if (randomClique == 0){
			ArrayList<Jock> jocks = Jock.pullGleeJocks();
			for (int i = 0; i < jocks.size(); i++){
                person1 = jocks.get(i);
            }
            randomName = person1.firstName;
		}
		if (randomClique == 1){
			ArrayList<Cheerio> cheerios = Cheerio.pullGleeCheerios();
			for (int i = 0; i < cheerios.size(); i++){
                person2 = cheerios.get(i);
            }
            randomName = person2.firstName;
		}
		if(randomClique == 2){
			ArrayList<Normie> normies = Normie.pullGleeNormies();
			for (int i = 0; i < normies.size(); i++){
                person3 = normies.get(i);
            }
            randomName = person3.firstName;
		}
		return randomName;
	}

	public static void pickAGenre(){
		System.out.println("\nYou enter the choir room and snap towards the piano player. You telepathically tell him which song you want to sing. What genre is it?");
		System.out.print("a. Broadway\nb. Pop\nc. Rock\n> ");
        boolean valid = false;
        while (valid == false){
            songChoice = keyboard.nextLine().toLowerCase(); 
            if (songChoice.equals("a")){
                valid = true;
				randomBroadwaySong();
            }
            else if (songChoice.equals("b")){
                valid = true;
				randomPopSong();
            }
			else if (songChoice.equals("c")){
                valid = true;
				randomRockSong();
            }
            else{
                System.out.print("\nPlease input a valid response.\na. Broadway\nb. Pop\nc. Rock\n> ");
            }
        }
	}

	public static void randomBroadwaySong(){
		String broadwaySong = Broadway.randomBroadway();
		System.out.println(broadwaySong);
	}

	public static void randomPopSong(){
		String popSong = Pop.randomPop();
	}

	public static void randomRockSong(){
		String rockSong = Rock.randomRock();
	}
	public static void main(String[] args) throws InterruptedException{
        randomBroadwaySong();
    }
}

