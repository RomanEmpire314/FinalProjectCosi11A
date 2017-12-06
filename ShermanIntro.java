import java.util.Scanner;

public class ShermanIntro {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello, you've entered the MSRY simulator! You will be faced with many life or death decisions");
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.println("You're in Sherman dining hall, eating and doing some work on your laptop.");
    System.out.println("You finish your food.");
    System.out.println("What do you want to do?:");
    System.out.println("1. Go to the C store to get some snacks.");
    System.out.println("2. Go to upper usdan");
    System.out.println("3. Go back to your dorm in North Quad.");
    int integerResponse = scanner.nextInt();
    if (integerResponse==1) {
      System.out.println("You walk up the hilly campus towards the C store.");
      System.out.println("You get a C store mealswipe meal that comes with an orange ...");
      System.out.println("As you peel the orange you notice a piece of paper which somehow was inside of the skin, it reads:");
      System.out.println("You need to get to Gosman before it's too late!!!");
      System.out.println("You anxiously start making your way over to Gosman when you take a bit of the orange.");
      System.out.println("It was a magical orange and that one bite teleports you directly to Gosman!");
    }
    else if (integerResponse==2) {
        System.out.println("You enter upper usdan and see an endless stream of evil looking squirrels.");
        System.out.println("Fight or run?");
        //we need a fight method here as well
        //if fight we could have them die, or have a high risk of dying. and then otherwise have them run to Gosman
        double survivalrate = Math.random();
        if (survivalrate>0.5) {
          System.out.println("You have died. The squirrels have won the day.");
        } else {
          System.out.println("You have survived but are hurt. A friend told you that Gosman is safe. You run over to Gosman.");
        }

      }
      else {
        System.out.println("You run over to your dorm in North. As swipe in you see more squirrels. They're omnipresent in campus buildings!");
        System.out.println("You receive a text message from a friend saying to come to Gosman because it is safe there.");
        System.out.println("What to do now?");
        System.out.println("1. Try to fight off more squirrels.");
        System.out.println("2. Head over to Gosman.");
        integerResponse = scanner.nextInt();
          if (integerResponse==1) {
            System.out.println("Your attempt at fighting the squirrels is unsuccessful this time. You died.");
          }
          else if (integerResponse==2) {
            System.out.println("You slam the door shut on the squirrels and run as fast as you can to Gosman.");
          }

      }
    }
  }
