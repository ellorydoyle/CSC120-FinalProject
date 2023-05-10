package Genres;

public enum Broadway {
    ONE_DAY_MORE, DEFYING_GRAVITY, CABARET, MEMORY;

	public static String finalName;

    public static String randomBroadway()  {
		Broadway randomBroadwaySongName = Broadway.values()[(int)(Math.random())];
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
