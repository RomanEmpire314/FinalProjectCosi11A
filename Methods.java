//change
public class Methods {

	public static void panic () {
		System.out.println("You PANICKED");
		System.out.println("Your heart is beating fast, your facial espression looked very concerned.\"AAAHHHHH\"- screamed you, startling the whole area around. Everyone around looked at you very confused and annoyed \"Calm down, would ya?\" ");
	}

	/**
	changeHealth change the health of the player to "change" value, jumps to death method when current health is 0 and less
	@param int health: current health of player
	@param int change: the change of health (could increase or decrease)
	@return player's health after change
	*/
	public static int changeHealth(int health, int change) {
		if ((health + change) <= 0) {
			//die
		} else if (change >= 0) {
			System.out.println("You've gained" + change + "health."); 
			return (health + change);
		} else if (change < 0) {
			System.out.println("You've lost" + change + "health.");
			return (health + change);
		} else {
			return (health + change);
		}

 	}
}