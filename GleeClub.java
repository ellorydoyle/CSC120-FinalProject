

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.sun.tools.javac.Main;
public class GleeClub {

	static ArrayList<GleeClub> gleeMember;
	static ArrayList<String> randomGleeKidGenerator;
	
	///go into club
	///random generate someone to interact with (go to class of person's clique)
	///three options for each glee interaction per clique
	///desire to win goes up if you talk with a glee member in your clique
	///desire to win falls if you talk with a glee member not in your clique
	///club unity goes up if you talk nice with person

	////**working with cheerios rn**

	public GleeClub(){
		GleeClub.gleeMember = new ArrayList<GleeClub>();
		GleeClub.randomGleeKidGenerator = new ArrayList<String>();
	}

	public static String randomGleeMember(){
		ArrayList<Jock> gleeJocks = Jock.pullGleeJocks();
		ArrayList<Cheerio> gleeCheerios = Cheerio.pullGleeCheerios();
		ArrayList<Normie> gleeNormies = Normie.pullGleeNormies();
		Random rand = new Random();
		Jock randomJock = gleeJocks.get(rand.nextInt(gleeJocks.size()));
        String randomJockName = randomJock.fullName;
		Random rand1 = new Random();
		Cheerio randomCheerio = gleeCheerios.get(rand1.nextInt(gleeCheerios.size()));
        String randomCheerioName = randomCheerio.fullName;
		Random rand2 = new Random();
		Normie randomNormie = gleeNormies.get(rand2.nextInt(gleeNormies.size()));
        String randomNormieName = randomNormie.fullName;
		randomGleeKidGenerator.add(randomJockName);
		randomGleeKidGenerator.add(randomCheerioName);
		randomGleeKidGenerator.add(randomNormieName);
		Random rand3 = new Random();
		String randomGleeKid = randomGleeKidGenerator.get(rand3.nextInt(randomGleeKidGenerator.size()));
		GleeClub.randomGleeKidGenerator.clear();
		return randomGleeKid;
	}



	public static void interactingWithMembers(){
	}

	public static void main(String[] args){
        McKinleyHigh.main();
		String randomGleeKid = randomGleeMember();
		System.out.println(randomGleeKid);
    }
}
