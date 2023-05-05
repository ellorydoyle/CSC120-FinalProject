

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.sun.tools.javac.Main;
public class GleeClub {

	static ArrayList<GleeClub> gleeMember;
	static ArrayList<Jock> gleeJocks;
	static String gleeJockName;
	static ArrayList<Cheerio> gleeCheerios;
	static String gleeCheerioName;
	static ArrayList<Normie> gleeNormies;
	static String gleeNormieName;
	
	///go into club
	///random generate someone to interact with (go to class of person's clique)
	///three options for each glee interaction per clique
	///desire to win goes up if you talk with a glee member in your clique
	///desire to win falls if you talk with a glee member not in your clique
	///club unity goes up if you talk nice with person

	////**working with cheerios rn**

	public GleeClub(){
		gleeMember = new ArrayList<GleeClub>();
	}

	public static void randomGleeMember(){
		Jock.pullGleeJocks();
		Cheerio.pullGleeCheerios();
		Normie.pullGleeNormies();
		Random rand = new Random();
		Jock randomJock = gleeJocks.get(rand.nextInt(gleeJocks.size()));
        String randomJockName = randomJock.fullName;
		Random rand1 = new Random();
		Cheerio randomCheerio = gleeCheerios.get(rand1.nextInt(gleeCheerios.size()));
        String randomCheerioName = randomCheerio.fullName;
		Random rand2 = new Random();
		Normie randomNormie = gleeNormies.get(rand2.nextInt(gleeNormies.size()));
        String randomNormieName = randomNormie.fullName;
		Random rand3 = new Random();
		int randomNumber = rand.nextInt(3);
		if (randomNumber == 0){
			String randomGleeMember = randomJockName;
		}
		else if (randomNumber == 1){
			String randomGleeMember = randomCheerioName;
		}
		else if (randomNumber == 2){
			String randomGleeMember = randomNormieName;
		}
	}


	public static void interactingWithMembers(){
	}
}
