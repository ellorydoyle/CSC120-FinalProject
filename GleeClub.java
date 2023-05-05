

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.sun.tools.javac.Main;
public class GleeClub {

	static ArrayList<Object> randomJockInfo;
	static ArrayList<Object> randomCheerioInfo;
	static ArrayList<Object> randomNormieInfo;
	static ArrayList<ArrayList<Object>> randomGleeKidGenerator;
	static ArrayList<String> gleeKidInfo;
	
	///go into club
	///random generate someone to interact with (go to class of person's clique)
	///three options for each glee interaction per clique
	///desire to win goes up if you talk with a glee member in your clique
	///desire to win falls if you talk with a glee member not in your clique
	///club unity goes up if you talk nice with person

	////**working with cheerios rn**

	///random generate a number, that number decides clique, then random inside the clique

	public GleeClub(ArrayList<Object> randomGleeKidGenerator){
		GleeClub.randomJockInfo = new ArrayList<Object>();
		GleeClub.randomCheerioInfo = new ArrayList<Object>();
		GleeClub.randomNormieInfo = new ArrayList<Object>();
		GleeClub.randomGleeKidGenerator = new ArrayList<ArrayList<Object>>();
		GleeClub.gleeKidInfo = new ArrayList<String>();
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

	public static Object randomGleeMember(){
		ArrayList<Jock> gleeJocks = compileGleeJocks();
		ArrayList<Cheerio> gleeCheerios = compileGleeCheerios();
		ArrayList<Normie> gleeNormies = compileGleeNormies();
		Random rand = new Random();
		Jock randomJock = gleeJocks.get(rand.nextInt(gleeJocks.size()));
        String randomJockName = randomJock.fullName;
		Random rand1 = new Random();
		Cheerio randomCheerio = gleeCheerios.get(rand1.nextInt(gleeCheerios.size()));
        String randomCheerioName = randomCheerio.fullName;
		Random rand2 = new Random();
		Normie randomNormie = gleeNormies.get(rand2.nextInt(gleeNormies.size()));
        String randomNormieName = randomNormie.fullName;
		ArrayList<Object> randomJockInfo = new ArrayList<Object>();
		ArrayList<Object> randomCheerioInfo = new ArrayList<Object>();
		ArrayList<Object> randomNormieInfo = new ArrayList<Object>();
		randomJockInfo.add(randomJock);
		randomJockInfo.add(randomJockName);
		randomCheerioInfo.add(randomCheerio);
		randomCheerioInfo.add(randomCheerioName);
		randomNormieInfo.add(randomNormie);
		randomNormieInfo.add(randomNormieName);
		ArrayList<ArrayList<Object>> randomGleeKidGenerator = new ArrayList<ArrayList<Object>>();
		randomGleeKidGenerator.add(randomJockInfo);
		randomGleeKidGenerator.add(randomCheerioInfo);
		randomGleeKidGenerator.add(randomNormieInfo);
		Random rand3 = new Random();
		ArrayList<Object> randomGleeKid = randomGleeKidGenerator.get(rand3.nextInt(randomGleeKidGenerator.size()));
		return randomGleeKid;
	}



	public static void interactingWithMembers(Object randomGleeKid){
		System.out.println("\nYou walk down the hallway towards the Glee Club and run into no other than " + randomGleeKid + "" );
	}

	public static void main(String[] args){
        McKinleyHigh.main();
		Object randomGleeKid = randomGleeMember();
		ArrayList<Jock> gleeJocks = compileGleeJocks();
		ArrayList<Cheerio> gleeCheerios = compileGleeCheerios();
		ArrayList<Normie> gleeNormies = compileGleeNormies();
		System.out.println(randomGleeKid);
		if (gleeJocks.contains(randomGleeKid)){
			System.out.println("This is a jock.");
		}
		if (gleeCheerios.contains(randomGleeKid)){
			System.out.println("This is a cheerio.");
		}
		if (gleeNormies.contains(randomGleeKid)){
			System.out.println("This is a normie.");
		}
		interactingWithMembers(randomGleeKid);
    }
}
