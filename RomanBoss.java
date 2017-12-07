import java.util.Scanner;

public class RomanBoss {
  public static Scanner rbScanner = new Scanner (System.in);
  
  public static void main (String [] args) {

  }

  public static void firstFight() {
    int guess;
    int number;
    int 
    System.out.println("You walked into SCC. Apparently MSRY are behind the squirrel infestation\nRoman stands forward\"Guys, I got this\". Facing Roman, you know defeating him will be the only way to get out of this hell and save Brandeis");
    System.out.println("Roman:\"I am the master of guessing. I'm thinking of an interger from 0 to 100. You have 6 guesses to get the right number. Each guess, I will tell you whether your number is too high or too low. Good luck\n");
    number = (int) Math.floor(Math.random() * 101);

    System.out.println("Roman has thought of a number, what's your guess: ");
    guess = rbScanner.nextInt();

  }
}