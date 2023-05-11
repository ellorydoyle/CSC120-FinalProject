package Genres;

import java.util.Random;

/** 
 *  Enum representing a collection of Rock songs
 */
public enum Rock {
	/**  Rock songs? */
    BORN_TO_RUN, BOHEMIAN_RHAPSODY, SMELLS_LIKE_TEEN_SPIRIT, GIMME_SHELTER;

	/**  What is the song that is picked? */
	public static String finalName;

	 /** 
  	 *  Randomly pick a Rock song
 	 *  @return random Rock song
 	 */
    public static String randomRock()  {
		Random rand = new Random();
		Rock randomRockSongName = Rock.values()[(int)(rand.nextInt(Rock.values().length))];
		if (randomRockSongName.equals(Rock.BORN_TO_RUN)){
			finalName = "Born to Run";
		}
		if (randomRockSongName.equals(Rock.BOHEMIAN_RHAPSODY)){
			finalName = "Bohemian Rhapsody";
		}
		if (randomRockSongName.equals(Rock.SMELLS_LIKE_TEEN_SPIRIT)){
			finalName = "Smells Like Teen Spirit";
		}
		if (randomRockSongName.equals(Rock.GIMME_SHELTER)){
			finalName = "Gimme Shelter";
		}
		return finalName;
	}
}
