//change
public class Methods {

	public static Scanner mScanner(System.in);

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
	public static int healthChange(int health, int change) {
	if ((health + change) <= 0) {
		System.out.println("Your health is zero, it's just too much to handle. Remember to go to the library to deal with stress and low health. You dead!!");
		System.out.println("Do you want to play again? (y/n)");
		String userInput = mScanner.nextLine();
		if (userInput.equals("y")) {
			ProjectStart.start();
    } else {
      System.out.println("Game over! Goodbye");
		} else if (change >= 0) {
			System.out.println("You've gained " + change + " health.");
			return (health + change);
		} else if (change < 0) {
			System.out.println("You've lost " + change + " health.");
			return (health + change);
		}
		return (health + change);

 	}
}
