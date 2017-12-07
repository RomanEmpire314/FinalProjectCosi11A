
import java.util.Scanner;


public class OlinSangIntro {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    FirstChoice();
  }

  /** These are the directions for user's first decision of the branch.
  They are prompted from the FirstChoice method below.
  */

  public static void FirstChoiceDirections(){
    System.out.println("You're in CS11a and the fire alarm goes off");
    System.out.println("What do you want to do?:");
    System.out.println("1. Go outside with the rest of the class");
    System.out.println("2. Stay Put");
    System.out.println("3. Panic!");

  }


/**This is the branch's first decision for the user.
if they choose the first option, it prompts the second choice
if they choose the second option, they die!!!!
if they choose the third option, they panic (panic method is queued)
and then the user would have to choose another choice after panicking.
*/
  public static void FirstChoice(){
    FirstChoiceDirections();
    int integerResponse = scanner.nextInt();
    if (integerResponse==1) {
      SecondChoice();
    }else if (integerResponse==2){
          System.out.println("After everyone has left, a shadowy figure sneaks up on you and knocks you unconscious with a swift blow to the back of your head");
          System.out.println("You burn to death in the fire");
      } else if (integerResponse==3){
        Methods.panic();
        FirstChoice();
      }
    }




/** These are the directions for the second choice of the game.
*/

    public static void SecondChoiceDirections(){
      System.out.println("Your friend Rachel calls over to you and asks if you want to just leave to the library?");
      System.out.println("You realize that you left your laptop in the classroom, and you had your only copy of your final project saved on it.");
      System.out.println("What would you like to do?");
      System.out.println("1. Go with her");
      System.out.println("2. Run back inside and try to grab the laptop");
      System.out.println("3. Panic!");
      }

/** This is the second decision the user has to make.
if they choose number one, (go with her), they move on to the third decision.
if they choose number two, (run back), they skip the third decision and move to the fourth.
if they choose number three, (panic), the panic method is called, and it goes back to the first decision.
*/

    public static void SecondChoice(){
      SecondChoiceDirections();
      int integerResponse = scanner.nextInt();
      if (integerResponse==1){
        ThirdChoice();


      } else if(integerResponse==2){
        FourthChoice();

      } else if (integerResponse==3){
        Methods.panic();
        FirstChoice();

      }
    }


/** These are the directions for the third decision the user has to make
*/


public static void ThirdChoiceDirections(){
  System.out.println("You go with Rachel to the library to see it over run with dangerous looking squirrels!");
  System.out.println("You hear people yelling to run to Gosman, with huge crowds of people fleeing past you");
  System.out.println("Choose your path:");
  System.out.println("1. Go to Gosman with the crowd");
  System.out.println("2. Attempt to fight the horde of squirrels");
  System.out.println("3. Assimilate");
}


/** This is the third decision the user may have to make. (skipped or not according to second decision)
if the user chooses 1, (go to gosman), it links to Sam's branch from Gomsan to the SCC.
if they choose 2, (attempt to fight), there is a random chance you die via the squirrels
if you don't die, you enter Yael's boss fight via the method.
if you choose 3, (assimilate), you do just that and  become the leader of the Free Squirrel Army (FSA).

*/
    public static void ThirdChoice(){
      ThirdChoiceDirections();
      int integerResponse = scanner.nextInt();
      if (integerResponse==1){
        System.out.println("You arrive at Gosman and you see your peers kickin' it.");
        SamBranch.goGosman();

      } else if (integerResponse==2) {
        System.out.println("You enter the library and start being overrun by the squirrels nipping at you from every angle.");
        double survivalRate = Math.random();
        if (survivalRate>0.55){
          System.out.println("The squirrels drown you in your own blood");
        } else{
          System.out.println("You manage to take out the squirrels in the library by yourself, Brandeis commerates you as a war hero, and a statue is erected to remember your great deed.");
          System.out.println("You hear there are more in the SCC from other students, so you head over to finish what you started.");
          YaelBossFight.chooseFirstLook();
        }

      } else {
        System.out.println("You attempt to assimilate with the squirrels, you become their leader, and live out the rest of your going from conquest to conquest as the leader of the free squirrell army (FSA).");
      }
    }


/**This is the fourth segment. There is a random 50% chance that the user dies.
If they do not, it prompts the next decision for the user.
*/

    public static void FourthChoice(){
      System.out.println("there is a 50% chance you live, 50% chance you die by these flames");
      double survivalrate = Math.random();
      if(survivalrate > 0.5){
        System.out.println("You have died. The flames have overtaken you. Start over?");
        }else{
          FifthChoice();

      }
    }

    /** These are the directions for the fifth decision.
    */
        public static void FifthChoiceDirections(){
          System.out.println("You have survived! And you see Mehmet running off with your laptop!");
          System.out.println("Do you want to:");
          System.out.println("1. Chase him");
          System.out.println("2. Go back outside to meet up with the class");
        }

/**This is the fifth set of choices the user has to make.
if the user chooses to chase Mehmet,
there is a 2% chance that they catch him, and then they win!!!
but the other 98% of the time, Mehmet is too fast, and then it connects
to the Gosman branch.
if the user chooses to go back outside, they just skip right to the
Gosman branch. 
*/

    public static void FifthChoice(){
      double survivalrate = Math.random();
      FifthChoiceDirections();
      int integerResponse = scanner.nextInt();
      if(integerResponse == 1){
        if(survivalrate < .02){
          System.out.println("You've caught him and saved your project! you won!");

        }else if(Math.random() > .02){
          System.out.println("He's too fast and you've tripped!! but now you've got a text saying to go to Gosman");
          SamBranch.goGosman();
        }
    }if(integerResponse == 2){
      System.out.println("everyone is going to Gosman and you should follow them!");
      SamBranch.goGosman();
      }
    }


    }
