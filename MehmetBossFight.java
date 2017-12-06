import java.util.Scanner;

public class MehmetBossFight {
  public static void main(String[] args){
    System.out.println("You have caught yourself up in a conflict with Mehmet!");
    System.out.println("What's your first move?");
    System.out.println("1) Charge at him and try to tackle him down to the ground!");
    System.out.println("2) Start on the defensive. Let him make the first move.");
    Scanner scanner = new Scanner(System.in);
    int integerResponse = scanner.nextLine();
    if (integerResponse==1) {
      double survivalrate = Math.random();
      if(survivalrate>0.9) {
        System.out.println("You got him down adeptly and apprehend him completely. Great job, you've defeated the boss Mehmet!");
      } else {
        System.out.println("Mehmet blocked your takedown attempt and reversed it on you. You got hurt by this maneuver.")
        
      }
    }



  }
}
