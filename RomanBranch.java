import java.util.Scanner;

public class RomanBranch {
  public static Scanner rScanner = new Scanner (System.in);
  
  public static void main (String [] args) {
    rStart();
  }

  public static void rStart() {
    System.out.println("It's a nice chilly morning in Massell pond. The sun is shining and the wind is blowing. You're sitting on the bench at Massell pond, chilling with your friend Ben.\nBen: \"Let’s get out of here\", do you:");
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

  public static void rWalk1() {
    System.out.println("The walk was nice, you both felt invigorated yet still bored");
    rRememberClass3c2s();
  }

  public static void rPush2() {
    System.out.println("You tried to push your friend Ben into the pond as a \"great\" friend you are.\nLittle did you know Ben is much larger than you and you failed horribly to move him even an inch.\nYou broke Ben’s heart. He thought you were his buddy.");
  }

  public static void rJump3() {
    System.out.println("Ben tried to stop you but he couldn’t. It’s 40 degree outside and you’re freezing");
    //lose health
    System.out.println("Something funny touched your leg down in the pond, do you: ");
    System.out.println("1: Stay in the pond\n2: Get out of the pond");
    int userResponse = rScanner.nextInt();
    if (userResponse == 1) {
      rStay3c1();
    } else if (userResponse == 2) {
      //get out of the pond
    }
 }

  public static void rStay3c1() {
    System.out.println("It's super cold as you stayed in the water, you still can't find anything funny");
    //lose health
    System.out.println("Do you:\n1: Stay in the pond\n2: Get out of the pond");
    int userResponse = rScanner.nextInt();
    if (userResponse == 1) {
      rStay3c1();
    } else if (userResponse == 2) {
      //get out of the pond
    }
  }

  public static void rOutPond3c2() {
    System.out.println("You finally got out of the pond, change to some dry clothes\nYou wonder why you jumped into the pond in the first place");
    //rememberClass
  }

  public static void rRememberClass3c2s () {
    System.out.println("It’s 9:55 in the morning and COSI 11a starts in 5 minutes. You are starving as you haven’t got anything for breakfast, do you?");
    System.out.println("1. Walk to class with an empty stomach\n2. Walk to SCC to get some bagels");
    int userResponse = rScanner.nextInt();
    if (userResponse == 1) {
      //rClass3c2c1
    } else if (userResponse == 2) {
      //rSCC3c2c2
    } else {
      System.out.println("Invalid input. Try again!");
      rRememberClass3c2s();
    }
  }

  public static void rClass3c2c1 () {
    System.out.println("You literally are starving!!!\nYour body is digesting itself for energy!");
    Methods.healthChange(ProjectStart.health,-10);
  }

  
}