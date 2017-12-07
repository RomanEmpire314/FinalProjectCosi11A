import java.util.Scanner;

public class RomanBoss {
  public static Scanner rbScanner = new Scanner (System.in);
  
  /**
  main method to run the program
  */
  public static void main (String [] args) {
    firstFight();
  }

  /**
  this method is a number guessing game that let you guess for 6 times. You move to the second game once the number is guessed
  @param none
  @return void
  */
  public static void firstFight() {
    int guess;
    int answer;
    int count = 0;

    System.out.println("You walked into SCC. Apparently MSRY are behind the squirrel infestation\nRoman stands forward: \"Guys, I got this\".\n Facing Roman, you know defeating him will be the only way to get out of this hell and save Brandeis");
    System.out.println("Roman:\"I am the master of guessing. I'm thinking of an interger from 0 to 100. You have 6 guesses to get the right number. Each guess, I will tell you whether your number is too high or too low. Good luck\n");
    answer = (int) Math.floor(Math.random() * 101);

    System.out.println("Roman has thought of a number, what's your guess: ");
    
    do {
      guess = rbScanner.nextInt();
      count++;
      if (guess > answer) {
        System.out.println("Your guess is too high");
      } else if (guess < answer) {
        System.out.println("Your guess is too low");
      } else {
        System.out.println("Nice job with the guessing. I have yet one more challege for you, hahaha!");
        break;
      }
    } while (count < 6);

    System.out.println("Out of loop");
    if (guess == answer) {
      secondFight();
    }
    else {
      System.out.println("\nYou lost the game");
    }

  }

  /**
  secondFight() is the second game where it ask you the basic of biology and user has to enter a a string. The game is won if the answer is correct
  */

  public static void secondFight () {
    Scanner scanner = new Scanner (System.in);

    System.out.println("What is the power house of the cell?");
    String userInput;
    userInput = scanner.nextLine();
    userInput = userInput.toLowerCase();
    if ( userInput.equals("mitochondria") || userInput.equals("mitochondrion") ) {
      System.out.println("\nYou have defeated me. We give in, you won!\nYou've beat the game :>");
    } else {
      System.out.println("\nYou lost");
    }
  }

}