import java.util.Scanner;

public class ShermanIntro {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    FirstChoiceInstructions();
}

/*    Prints a bunch of lines to the user, orienting them and letting them know where they
      are and asking what they want to do. Either 1, go to c store, 2. upper usdan, 3.
      go back to dorm in north quad. Then an int integerResponse is initialized which takes
      in an input from the user with scanner. If the number chosen is 1, the program goes
      to the FirstAnswer1 method. If 2, to the FirstAnswer2 method, and 3, to the FirstAnswer3
      method. Then there is an else that is meant to catch invalid inputs, and restarts the method
      from the top.
**/
  public static void FirstChoiceInstructions() {
    System.out.println("You're in Sherman dining hall, eating and doing some work on your laptop.");
    System.out.println("You finish your food.");
    System.out.println("What do you want to do?:");
    System.out.println("1. Go to the C store to get some snacks.");
    System.out.println("2. Go to upper usdan");
    System.out.println("3. Go back to your dorm in North Quad.");
    int integerResponse = scanner.nextInt();
    if (integerResponse==1) {
        FirstAnswer1();
    }
    else if (integerResponse==2) {
        FirstAnswer2();
      }
    else if (integerResponse==3) {
        FirstAnswer3();
      } else {
        System.out.println("Invalid input, try again\n");
        FirstChoiceInstructions();
      }
  }

/*    This is where the program goes if the user chooses to go to the C store for some snacks.
      There is not much to this other than narrative so it is basically just a bunch of
      stuff printed to the user. Then at the end it goes to SamBranch.goGosman() which plops
      the user into a new location (Gosman).
**/
    public static void FirstAnswer1() {
        System.out.println("You walk up the hilly campus towards the C store.");
        System.out.println("You get a C store mealswipe meal that comes with an orange ...");
        System.out.println("As you peel the orange you notice a piece of paper which somehow was inside of the skin, it reads:");
        System.out.println("You need to get to Gosman before it's too late!!!");
        System.out.println("You anxiously start making your way over to Gosman when you take a bit of the orange.");
        System.out.println("It was a magical orange and that one bite teleports you directly to Gosman!");
        SamBranch.goGosman();
      }

/*    This is for the second choice (if the user inputs 2) in the first set of choices. Then there is a double survivalRate
      which is a Math.random. Then if this random is >0.5 (50% chance) the squirrels end up killing you which means the
      program comes to a halt. Otherwise you escape, hurt but intact, and escape to Gosman with SamBranch.goGosman().
**/
    public static void FirstAnswer2() {
        System.out.println("You enter upper usdan and see an endless stream of evil looking squirrels who you choose to fight off.");
        double survivalrate = Math.random();
        if (survivalrate>0.5) {
          DieFightingSquirrels();
        } else {
          System.out.println("You have survived but are hurt. A friend told you that Gosman is safe. You run over to Gosman.\n");
          SamBranch.goGosman();
        }

      }

/*    For the third of three possible answers in the first choice. You run to North, then see squirrels which look scary.
      Then the user in prompted for another input which is another choice. 1. fight squirrels, 2. head over to Gosman.
      The user's input is once again stored in integerResponse. If you choose to fight, you go to DieFightingSquirrels
      method which just tells you that you have died fighting the squirrels. Otherwise you slam the door shut and go to
      Gosman once again.
**/
    public static void FirstAnswer3() {
        System.out.println("You run over to your dorm in North. As swipe in you see more squirrels. They seem to be omnipresent in campus buildings!");
        System.out.println("You receive a text message from a friend saying to come to Gosman because it is safe there.");
        System.out.println("What to do now?");
        System.out.println("1. Try to fight off the squirrels.");
        System.out.println("2. Head over to Gosman.");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1) {
          DieFightingSquirrels();
        }
        else if (integerResponse==2) {
          System.out.println("You slam the door shut on the squirrels and run as fast as you can to Gosman.\n");
          SamBranch.goGosman();
        } else {
          System.out.println("Invalid input, try again\n");
          FirstChoiceInstructions();
        }

      }

/*    Just a simple method meant to print whenever the squirrels defeat the user, and the user ends up
      dead. All it does is print.
**/
      public static void DieFightingSquirrels() {
        System.out.println("Your attempt at fighting the squirrels is unsuccessful. You died.");
      }


    }
