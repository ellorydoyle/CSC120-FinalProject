

import java.util.ArrayList;
import java.util.Random;
public class GleeClub {
	
	///go into club
	///random generate someone to interact with (go to class of person's clique)
	

	////**working with cheerios rn**

	public GleeClub(ArrayList<Object> randomGleeKidGenerator){
		///
	}

	public static ArrayList<Jock> compileGleeJocks(){
		ArrayList<Jock> gleeJocks = Jock.pullGleeJocks();
		return gleeJocks;
	}

	public static ArrayList<Cheerio> compileGleeCheerios(){
		ArrayList<Cheerio> gleeCheerios = Cheerio.pullGleeCheerios();
		return gleeCheerios;
	}

	public static ArrayList<Normie> compileGleeNormies(){
		ArrayList<Normie> gleeNormies = Normie.pullGleeNormies();
		return gleeNormies;
	}

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
