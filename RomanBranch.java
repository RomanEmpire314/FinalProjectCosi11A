import java.util.Scanner;

public class RomanBranch {
  public static Scanner rScanner = new Scanner (System.in);


  public static void main (String [] args) {
    rStart();
  }


  /**
  This is the first choice for the user of the Massell Pond branch.
  if the user chooses 1 (wakl around the pond), it prompts rWalk1.
  if the user chooses 2, (push ben), rPush2 is prompted.
  if user chooses 3, (jump into the pond), rJump3 is prompted.
  if they enter anything anything, its an invalid imput, and the method re-starts.
  */  
  public static void rStart() {
    System.out.println("It's a nice chilly morning in Massell pond. The sun is shining and the wind is blowing. You're sitting on the bench at Massell pond, chilling with your friend Ben.\nBen: \"Let's get out of here\", do you:");
    System.out.println("1. Go walk around the Massell pond\n2. Push Ben off into the pond\n3. Jump down the pond yourself");
    int userResponse = rScanner.nextInt();
    if (userResponse == 1) {
      rWalk1();
    } else if (userResponse == 2) {
      rPush2();
    } else if (userResponse == 3) {
      rJump3();
    } else {
      System.out.println("Invalid input, try again:");
      rStart();
    }
  }


  /** 
  next choice prompted from the previous path, and that prompts the next one,
  rRememberClass3c2s.
  */
  public static void rWalk1() {
    System.out.println("The walk was nice, you both felt invigorated yet still bored");
    rRememberClass3c2s();
  }

  /** 
  this is the next choice prompted from the previous path, game ends.
  */
  public static void rPush2() {
    System.out.println("You tried to push your friend Ben into the pond as a \"great\" friend you are.\nLittle did you know Ben is much larger than you and you failed horribly to move him even an inch.\nYou broke Ben’s heart. He thought you were his buddy.");
    System.out.println("You lost");
  }


  /** 
  This method is prompted from the 3rd choice in the previous decision.
  You lose health, and the next choice is prompted.
  the responses to this choice prompt either rStay3c1 (choice 1)
  or  rOutPond3c2 (choice 2)
  */
  public static void rJump3() {
    System.out.println("Ben tried to stop you but he couldn’t. It’s 40 degree outside and you’re freezing");
    ProjectStart.health = Methods.healthChange(ProjectStart.health,-10);
    System.out.println("Something funny touched your leg down in the pond, do you: ");
    System.out.println("1: Stay in the pond\n2: Get out of the pond");
    int userResponse = rScanner.nextInt();
    if (userResponse == 1) {
      rStay3c1();
    } else if (userResponse == 2) {
      rOutPond3c2();
    }
 }

 
 /** 
 losing health from ice cold pond jump (previous choice),
 a new decision is prompted and based on this decision, the user either stays
 in the pond (and method repeats)
 or they leave the pond and move onto the rOutPond3c2 method.
 */
  public static void rStay3c1() {
    System.out.println("It's super cold as you stayed in the water, you still can't find anything funny");
    ProjectStart.health = Methods.healthChange(ProjectStart.health,-10);
    System.out.println("Do you:\n1: Stay in the pond\n2: Get out of the pond");
    int userResponse = rScanner.nextInt();
    if (userResponse == 1) {
      rStay3c1();
    } else if (userResponse == 2) {
      rOutPond3c2();
    }
  }


  /**
  prompts the next method in the story, rRememberClass3c2s.
  */
  public static void rOutPond3c2() {
    System.out.println("You finally got out of the pond, change to some dry clothes\nYou wonder why you jumped into the pond in the first place");
    rRememberClass3c2s();
  }


/**
this is the next decision for the user to make.
the user can either walk to class with an empty stomach (prompts rClass3c2c1)
or they can walk to the scc for the next line in the story (rSCC3c2c2).
if they enter an invalid input, the method repeats.
*/
public static void rRememberClass3c2s () {
    System.out.println("It’s 9:55 in the morning and COSI 11a starts in 5 minutes. You are starving as you haven’t got anything for breakfast, do you?");
    System.out.println("1. Walk to class with an empty stomach\n2. Walk to SCC to get some bagels");
    int userResponse = rScanner.nextInt();
    if (userResponse == 1) {
      rClass3c2c1();
    } else if (userResponse == 2) {
      rSCC3c2c2();
    } else {
      System.out.println("Invalid input. Try again!");
      rRememberClass3c2s();
    }
  }


  /** 
  Previous choice prompts this method, which causes you to lose health
  for choosing to go to class while starving !!!!
  prompts the seeMSRY method.
  */
  public static void rClass3c2c1 () {
    System.out.println("You literally are starving!!!\nYour body is digesting itself for energy!");
    ProjectStart.health = Methods.healthChange(ProjectStart.health,-10);
    seeMSRY();
  }


  /**
  This method prompts the user with the next decision,
  which involves bagel choices who's outcomes are determined
  by a switch. the bagel choice is printed and increases the user's health.
  then the seeMSRY method is prompted.
  */
  public static void rSCC3c2c2 () {
    Scanner bagelInput = new Scanner (System.in);
    String bagelChoice = "";
    String smearsChoice = "";

    System.out.println("You're in good old Shapiro Student Center, facing Einstein Bros Bagels.\nWhat bagel would you like?");
    System.out.println("1. Everything\n2. Honey whole wheat\n3. Sesame seed\n4. Asiago\n5. Chocolate chip\n6. Protein roll");
    int userInput = bagelInput.nextInt();
    switch (userInput) {
      case 1:
        bagelChoice = "Everything";
        break;
      case 2:
        bagelChoice = "Honey whole wheat";
        break;
      case 3:
        bagelChoice = "Seasame seed";
        break;
      case 4:
        bagelChoice = "Asiago";
        break;
      case 5:
        bagelChoice = "Chocolate chip";
        break;
      case 6:
        bagelChoice = "Protein roll";
        break;
      default:
        System.out.println("Invalid input. Try again!");
        rSCC3c2c2();
    }

    System.out.println("What smears would you like?");
    System.out.println("1. Plain\n2. Onion and chives\n3. Smoked salmon\n4. Strawberry\n5. Blueberry");
    userInput = bagelInput.nextInt();

    switch (userInput) {
      case 1:
        smearsChoice = "Plain";
        break;
      case 2:
        smearsChoice = "Onion and chives";
        break;
      case 3:
        smearsChoice = "Smoked salmon";
        break;
      case 4:
        smearsChoice = "Strawberry";
        break;
      case 5:
        smearsChoice = "Blueberry";
        break;
      default:
        System.out.println("Invalid input. Try again!");
        rSCC3c2c2();
    }

      System.out.println("You really enjoyed your" + bagelChoice + "bagel with " + smearsChoice + " smears!");
      ProjectStart.health = Methods.healthChange(ProjectStart.health,10);
      seeMSRY();
  }



  /**
  This method prompts the user with a new set of choices after seeing the MSRY mystery.
  if they choose to keep walking (1), the rSquirrle3c2c2c2s method is prompted.
  if they choose to call (2), the
  */
  public static void seeMSRY () {
    System.out.println("On your way to class, you see MSRY walking, in front of you,\n look like they are up to no good. Do you");
    System.out.println("1. Keep walking\n2. Call them \"Hey MSRY, what's up?\"\n3. Panic");

    int userInput = rScanner.nextInt();
    if (userInput == 1) {
      System.out.println("You kept walking without calling out to the MSRY");
      rSquirrle3c2c2c2s();
    } else if (userInput == 2) {
      System.out.println("You called them.\nOne of the 4 turned around as they heard their names\nFor some reasons, they decided to walk faster, ignoring your call\nYou think to yourself\"Huh? That's strange, MSRY are usually nice people?\"");
      OlinSangIntro.ThirdChoiceDirections();
    } else if (userInput == 3) {
      Methods.panic();
      seeMSRY();
    } else {
      System.out.println("Invalid input. Try again!");
      seeMSRY();
    }
  }


  /** 
  This method prompts the user with another decision.
  if the user enters 1 (give brandeis ID), rGive3c2c2c2c1 is prompted.
  if the user enters 2 (walk away), rNotGive3c2c2c2c2 is prompted.
  if the user enters anything else, the method reboots for the user to enter something new.
  */
  public static void rSquirrle3c2c2c2s() {
    System.out.println("You kept walking towards the library.\nSuddenly, a considerably sizeable squirrel showed up right in front of you \"I need to see your ID before letting you pass\nWhile you still wrap your head around a talking squirrel, do you:");
    System.out.println("1. Give it your Brandeis ID\n2. Don’t give your ID and walk away: \"Screw that\n");

    int userInput = rScanner.nextInt();
    if (userInput == 1) {
      rGive3c2c2c2c1();
    } else if (userInput == 2) {
      rNotGive3c2c2c2c2();
    } else {
      System.out.println("Invalid input. Try again!");
      rSquirrle3c2c2c2s();
    }

  }

  /** 
    the user dies and the user can either play again or not! if they play again, it reboots!
  */
  public static void rGive3c2c2c2c1() {
    String userInput;
    System.out.println("The squirrel took your ID, examined it meticulously and then talk to its tiny little walkie talkie in the evilest high-pitched voice.\n \nIt’s them\n- it says. 10 seconds later, a large muscular squirrel shows up and beat you to death");
    System.out.println("The squirrel was too much to handle, you dead!!!");

    System.out.println("Do you want to play again? (y/n)");
    userInput = rScanner.nextLine();
    if (userInput.equals("y")) {
      ProjectStart.start();
    } else {
      System.out.println("Game over! Goodbye");
    }
  }

  /**
  All decisions point to the Gosman branch!!!!
  */
  public static void rNotGive3c2c2c2c2() {
    System.out.println("You ran into a group of Brandeis students, who are making their ways to Gosman: ");
    System.out.println("1. \"Hell yeah, let's go to Gosman, woooo\"\n2. \"What the hell is going on?\"\n3. Panic");

    int userInput = rScanner.nextInt();
    if (userInput == 1) {
      System.out.println("People appreaciate your enthusiasm while its helpfulness is limited");
    } else if (userInput == 2) {
      System.out.println("\"Squirrels\" - said them");
    } else if (userInput == 3) {
      System.out.println("Do you think panicking would really help in this situation?");
    }
    SamBranch.goGosman();
  }


}