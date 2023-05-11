package Genres;

import java.util.Random;

/** 
 *  Enum representing a collection of Broadway songs
 */
public enum Broadway {
	/**  Broadway songs? */
    ONE_DAY_MORE, DEFYING_GRAVITY, CABARET, MEMORY;

	/**  What is the song that is picked? */
	public static String finalName;

	 /** 
  	 *  Randomly pick a Broadway song
 	 *  @return random Broadway song
 	 */
    public static String randomBroadway()  {
		Random rand = new Random();
		Broadway randomBroadwaySongName = Broadway.values()[(int)(rand.nextInt(Broadway.values().length))];
		if (randomBroadwaySongName.equals(Broadway.ONE_DAY_MORE)){
			finalName = "One Day More";
		}
		if (randomBroadwaySongName.equals(Broadway.DEFYING_GRAVITY)){
			finalName = "Defying Gravity";
		}
		if (randomBroadwaySongName.equals(Broadway.CABARET)){
			finalName = "Cabaret";
		}
		if (randomBroadwaySongName.equals(Broadway.MEMORY)){
			finalName = "Memory";
		}
		return finalName;
	}
}
