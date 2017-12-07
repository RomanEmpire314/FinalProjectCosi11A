import java.util.Scanner;
import java.util.Random;

public class SamBoss {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    samBossIntro();
  }
  /*
  Intro to the boss fight
  Also, initializes wincount and losecount which determine when the program ends
  */
  public static void samBossIntro(){
    System.out.println("\nAs you walk into the SCC you see Mehmet, Sam, Yael, and Roman standing on the balcony looking down at you");
    System.out.println("Sam says: I have been waiting for you");
    System.out.println("He leans over to his pals and says: I got this one guys");
    System.out.println("Sam jumps down from the balcony, landing right in front of you and shaking the whole building");
    System.out.println("I am Samuel the master of chance! Defeat me in a dice rolling competition and I will stop the terrorizing of Brandeis and give your project back");
    System.out.println("If you roll a 3 or above twice, you win. If You roll a 2 or less twice, I win.\n You may think the odds are in your favor, but remember I am the master of chance!\n");
    int wincount = 0;
    int losecount = 0;
    roll(wincount, losecount);
  }
  /*
  roll rolls the dice one time if the user says they want to
  If they do not, they take damage
  If they do, the roll is determined by pulling randomly from an array of numbers 1-6
  If the roll is above three, method rollGood adds 1 to the wincount
  If below three, rollBad adds 1 to losecount
  */
  public static void roll(int wincount, int losecount){
      System.out.println("Ready to roll the dice? write true or false\n");
      boolean ready = scanner.nextBoolean();
      if (ready==true){
        int[] diceRoll = {1,2,3,4,5,6};
        System.out.println("\nHere it goes");
        int rng = new Random().nextInt(diceRoll.length);
        rng = rng +1;
        if (rng>=3){
          rollGood(wincount, losecount, rng);
        } else {
          rollBad(wincount, losecount, rng);
        }
      } else {
        System.out.println("\nI do not have time for this! HAGHH!");
        System.out.println("Sam slaps you in the face");
        ProjectStart.health = Methods.healthChange(ProjectStart.health,-50);
        roll(wincount, losecount);
      }
    }
    /*
    */
  public static void rollGood(int wincount, int losecount, int rng){
    System.out.println("You rolled a "+rng+" darnit! That is one for you\n");
    wincount = wincount + 1;
    if (wincount==2){
      win();
    } else {
      roll(wincount, losecount);
    }
  }

  public static void rollBad(int wincount, int losecount, int rng){
    System.out.println("You rolled a "+rng+" Haha! that's one for me!\n");
    losecount = losecount + 1;
    if (losecount==2){
      lose();
    } else {
      roll(wincount, losecount);
    }
  }

  public static void win(){
    System.out.println("You beat me this time, here is your project back, I guess I will try to make my own last minute...");
    System.out.println("Sam hands you your laptop back");
    System.out.println("We had Mehmet steal this from you earlier...\n");
    System.out.println("Congratulations! You have defeated Sam and won the game!");
  }

  public static void lose(){
    System.out.println("Haha! you have lost my game and now your project is mine and Brandeis will be controlled by our squirrel army forever!");
    System.out.println("Sam pulls out your laptop");
    System.out.println("With this, we can get an A in Cosi11a, and you are no longer needed... at least the way you are now...\n");
    System.out.println("Sam looks to the sky an nods at the rest of the MSRY crew, then the entire place starts shaking and a bright flash consumes the room");
    System.out.println("You wipe your eyes and look down at yourself to find you have a tail, and fur all over your body... you are a squirrel.");
  }
}
