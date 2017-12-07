import java.util.Scanner;


public class SamBoss {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    intro();

  }

  public static intro(){
    System.out.println("As you walk into the SCC you see Mehmet, Sam, Yael, and Roman standing on the balcony looking down at you");
    System.out.println("Sam says: I have been waiting for you");
    System.out.println("He leans over to his pals and says: I got this one guys");
    System.out.println("Sam jumps down from the balcony, landing right in front of you and shaking the whole building");
    System.out.println("I am Samuel the master of chance! Defeat me in a dice rolling competition and I will stop the terrorizing of Brandeis and give your project back");
    roll();
  }

  public static roll(){
    System.out.println("Ready to roll the dice?");
    boolean ready = scanner.nextLine();
    if (ready){
      System.out.println("Ready to roll the dice?");
    } else {
      System.out.println("I do not have time for this! HAGHH!");
      System.out.println("Sam slaps you in the face");
      ProjectStart.health = Methods.healthChange(ProjectStart.health,-50);
    }
  }
}
