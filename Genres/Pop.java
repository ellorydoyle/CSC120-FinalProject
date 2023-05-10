package Genres;

import java.util.Random;

public enum Pop {
    TIK_TOK, LOCKED_OUT_OF_HEAVEN, BECAUSE_OF_YOU, COMPLICATED;

	public static String finalName;

    public static String randomPop()  {
		Random rand = new Random();
		Pop randomPopSongName = Pop.values()[(int)(rand.nextInt(Pop.values().length))];
		if (randomPopSongName.equals(Pop.TIK_TOK)){
			finalName = "Tik Tok";
		}
		if (randomPopSongName.equals(Pop.LOCKED_OUT_OF_HEAVEN)){
			finalName = "Locked Out of Heaven";
		}
		if (randomPopSongName.equals(Pop.BECAUSE_OF_YOU)){
			finalName = "Because of You";
		}
		if (randomPopSongName.equals(Pop.COMPLICATED)){
			finalName = "Complicated";
		}
		return finalName;
	}
}
