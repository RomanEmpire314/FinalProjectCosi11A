import java.util.Scanner;
import java.util.Random;

public class YaelBossFight{

  private static Random random;

public static void main(String[] args){

    chooseFirstLook();

      }

/** This is the user's first choice of the boss fight.
it prompts the instructions and context, assigns full health,
and sets up the choices (and the next method that each choice provokes)

*/
public static void chooseFirstLook(){

  System.out.println("You have reached what seems to be Yael's lair. There is mail everywhere and all her servants are squirrels. You need to find the control room to locate your final project");
  int health = 100;
  Scanner scanner = new Scanner(System.in);
  chooseFirstlookDirections();
  int integerResponse = scanner.nextInt();
  if(integerResponse==1){
    SnakesChoiceOne(health);
  }if(integerResponse==2){
    chooseSecond(health);
  }if(integerResponse==3){
    choiceThree();
  }
}
/** These are the directions that explain the first choice the user has to make
*/
public static void chooseFirstlookDirections(){
  System.out.println("Which corrider do we go down to get to the control room?");
  System.out.println("1. Left");
  System.out.println("2. Center");
  System.out.println("3. Right");
}

/** This method is prompted when the user selects the left corrider
in the first choice.
they fall into a pit of snakes and lose health via the changeHealth method
located in the methods file.
@param health of user to change
*/

public static void SnakesChoiceOne(int health){
  System.out.println("You have fallen into a pit of snakes!!!!! and lost health points! Not dead yet though! Get outta there!");
  ProjectStart.health = Methods.healthChange(ProjectStart.health,-50);
  System.out.printf("health = %d%n",health);
  chooseSecond(health);
}

/** This is the second chocie the user has to make.
the user has to enter jump to jump over some barrels,
and if they do not enter jump they lose health
via the changeHealth method located in the methods file.
if they enter jump, the third choice they have to make is prompted
via the choiceThree method down below.
@param health of user
*/
public static void chooseSecond(int health){
  Scanner scanner = new Scanner(System.in);

  System.out.println("Ok. So you're now running down a long corridor. You hear noises all over the place. You see Yael at the very end of the corridor. You have to catch her!");
  chooseSecondDirections();
  String stringResponse = scanner.nextLine();
while(!stringResponse.equals("jump")){
    System.out.println("You are bad at jumping barrels! -10 health!");
    ProjectStart.health = Methods.healthChange(ProjectStart.health,-10);
    System.out.printf("health = %d%n",health);
    chooseSecondDirections();
    stringResponse = scanner.nextLine();
    if(stringResponse.equals("jump")){
      break;
    }

  }choiceThree();

}
/** these are the instructions for the second choice (above)
*/
public static void chooseSecondDirections(){
  System.out.println("She's throwing barrels at you!!!!");
  System.out.println("Enter jump");

}
/** This is the user's third choice
they have to enter boost to catch up,
when they enter boost, the fourth choice is prompted
*/
public static void choiceThree(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Ok, good to know that you know how to think on your feet.");
  System.out.println("Enter boost to run faster and try to catch Yael");
  String stringResponse = scanner.nextLine();
while(!stringResponse.equals("boost")){
    System.out.println("You are running too slowly! She's getting away!");
    System.out.println("Enter boost to run faster and try to catch Yael");
    stringResponse = scanner.nextLine();
    if(stringResponse.equals("boost")){
      break;
    }

}choiceFour();
}
/** This is the user's fourth choice. They have to choose a door to go through
if they choose door 1 they die
if they choose door 2, it goes to the final challenge
if they choose door 3, it goes to the alterGravity challenge
*/

public static void choiceFour(){
  choiceFourDirections();
  Scanner scanner = new Scanner(System.in);
  int integerResponse = scanner.nextInt();
  if(integerResponse==1){
    System.out.println("Oh no oh no oh no oh no I THINK THIS IS A BLACK HOLE!!!!!");
    System.out.println("you've died. Definitely dead.");
  }else if(integerResponse==2){
    System.out.println("You've selected the right door!");
    System.out.println("There she is - and she has one final challenge for you");
    finalChallenge();

  }else if(integerResponse==3){
    System.out.println("You've selected what seems like the right door but I think the gravity is slightly off");
    System.out.println("You will need to press the ALTER GRAVITY button in order to proceed");
    alterGravity();

  }

}

/** This method is prompted by entering door three of the FourthChoice
They need to enter the stated String exactly.
when they do, the final challenge is prompted.
*/
public static void alterGravity(){

  Scanner scanner = new Scanner(System.in);
  System.out.println("You need to enter ALTER GRAVITY c1s111acs11csa11 with all the characters to get this button to work");
  String stringResponse = scanner.nextLine();
  while(!stringResponse.equals("ALTER GRAVITY c1s111acs11csa11")){
      System.out.println("I'm telling you, you need to enter ALTER GRAVITY c1s111acs11csa11");
      stringResponse = scanner.nextLine();
      if(stringResponse.equals("ALTER GRAVITY c1s111acs11csa11")){
        break;
      }


}finalChallenge();
}

/** These are the directions prompted for the user's FourthChoice
*/

public static void choiceFourDirections(){
  System.out.println("She's gone behind through a door but you didn't see which one!");
  System.out.println("Do you choose: ");
  System.out.println("1. Door One");
  System.out.println("2. Door Two");
  System.out.println("3. Door Three");
}

/** this is the user's final challenge of the boss fight.
the user has to enter the answer to a puzzle annogram (the answer is Grace Hopper)
when they do, they have won!
*/

public static void finalChallenge(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("THIS IS YOUR FINAL CHALLENGE");
  System.out.println("'Pacer Gopher' is an annogram for what CS-related person/thing/idea?");
  String stringResponse = scanner.nextLine();
  while(!stringResponse.equals("Grace Hopper")){
      System.out.println("'Pacer Gopher' is an annogram for what CS-related person/thing/idea?");
      stringResponse = scanner.nextLine();
      if(stringResponse.equals("Grace Hopper")){
        break;
      }

}System.out.println("***** !!!! YOU DID IT !!!! ****");
System.out.println("You have outwit, outplayed, outlasted Yael!");
}


}
