import java.util.Scanner;

public class FinalProject {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello, you've entered the MSRY simulator! You will be faced with many life or death decisions");
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.println("You're in CS11a and the fire alarm goes off");
    System.out.println("What do you want to do?:");
    System.out.println("1. Go outside with the rest of the class");
    System.out.println("2. Stay Put");
    System.out.println("3. Panic!");
    int integerResponse = scanner.nextInt();
    if (integerResponse==1) {
      System.out.println("Your friend Rachel calls over to you and asks if you want to just leave to the library?");
      System.out.println("You realize that you left your laptop in the classroom, and you had your only copy of your final project saved on it.");
      System.out.println("What would you like to do?");
      System.out.println("1. Go with her");
      System.out.println("2. Run back inside and try to grab the laptop");
      System.out.println("3. Panic!");
      integerResponse = scanner.nextInt();
      if (integerResponse==1){
          System.out.println("You go with Rachel to the library to see it over run with dangerous looking squirrels!");
          System.out.println("You hear people yelling to run to Gosman, with huge crowds of people fleeing past you");
          System.out.println("Choose your path:");
          System.out.println("1. Go to Gosman with the crowd");
          System.out.println("2. Attempt to fight the horde of squirrels");
          System.out.println("3. Assimilate");
          integerResponse = scanner.nextInt();
          if (integerResponse==1){
            System.out.println("You arrive at Gosman and you see your peers kickin' it.");

          } else if (integerResponse==2) {
          System.out.println("You enter the library and start being overrun by the squirrels nipping at you from every angle.");
          System.out.println("Fight or Flee?");
          // we need to add a fighting method for this.
          } else {
            System.out.println("You attempt to assimilate with the squirrels, you become their leader, and live out the rest of your going from conquest to conquest as the leader of the free squirrell army (FSA).");
          }

      } else if(integerResponse==2){
          System.out.println("there is a 50% chance you live, 50% chance you die by these flames");
          double survivalRate = Math.random();
          if(survivalRate > 0.5){
            System.out.println("You have died. The flames have overtaken you. Start over?");
            }else{
              System.out.println("You have survived! And you see Mehmet running off with your laptop!");
              System.out.println("Do you want to (1) chase him or (2) go back outside to meet up with the class");
              integerResponse = scanner.nextInt();
              if(integerResponse == 1){
                if(survivalRate < .02){
                  System.out.println("You've caught him and saved your project! you won!");
                }else if(Math.random() > .02){
                  System.out.println("He's too fast and you've tripped!! but now you've got a text saying to go to Gosman");
                }
            }if(integerResponse == 2){
              System.out.println("everyone is going to Gosman and you follow them!");
            }
          }
      } else if (integerResponse==3){
        //panic
        //hello
        //github
        //LMAO
      }
    } else if (integerResponse==2){
        System.out.println("After everyone has left, a shadowy figure sneaks up on you and knocks you unconscious with a swift blow to the back of your head");
        System.out.println("You burn to death in the fire");
    } else if (integerResponse==3){
      //panic
    }
  }
}
