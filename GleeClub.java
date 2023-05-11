

import java.util.ArrayList;
import java.util.Random;
public class GleeClub {

	/** 
  	 *  Create an ArrayList of all the Jocks that are in Glee
 	 *  @return the Glee Jocks
 	 */
	public static ArrayList<Jock> compileGleeJocks(){
		ArrayList<Jock> gleeJocks = Jock.pullGleeJocks();
		return gleeJocks;
	}

	/** 
  	 *  Create an ArrayList of all the Cheerios that are in Glee
 	 *  @return the Glee Cheerios
 	 */
	public static ArrayList<Cheerio> compileGleeCheerios(){
		ArrayList<Cheerio> gleeCheerios = Cheerio.pullGleeCheerios();
		return gleeCheerios;
	}

	/** 
  	 *  Create an ArrayList of all the Normies that are in Glee
 	 *  @return the Glee Normies
 	 */
	public static ArrayList<Normie> compileGleeNormies(){
		ArrayList<Normie> gleeNormies = Normie.pullGleeNormies();
		return gleeNormies;
	}

	/** 
  	 *  Pick a random clique to interact with
 	 */
	public static void randomGleeClique(){
		Random rand = new Random();
		int randomClique = rand.nextInt((3));
		if (randomClique == 0){
			Jock.generateRandomInteraction();
		}
		if (randomClique == 1){
			Cheerio.generateRandomInteraction();
		}
		if(randomClique == 2){
			Normie.generateRandomInteraction();
		}
	}
}
