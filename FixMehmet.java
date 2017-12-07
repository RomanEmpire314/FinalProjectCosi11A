import java.util.Scanner;

public class FixMehmet {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    mehmetBoss();
  }


/*  This method includes the introduction for the boss fight, and is meant to orient the user
    as to what's going on. Then it also asks the user for what they want to do for their first
    move. Then, based on what the user wants to do it takes them to either chargeMehmet, if
    they choose to charge at him, or startDefensive if they want to start defensive.
    It uses the integer response variable to hold the user's input and if it's 1 it goes to
    chargemehmet, if it's 2 then it startsdefensive. Also, if the user input is not valid
    (either 1 or 2) then it restarts tells the user as much, and restarts the method.
**/
  public static void mehmetBoss(){
    System.out.println("You have caught yourself up in a conflict with Mehmet!");
    System.out.println("Drop any weapons you might have. None are allowed in this battle!");
    System.out.println("What's your first move?");
    System.out.println("1) Charge at him and try to tackle him down to the ground!");
    System.out.println("2) Start on the defensive. Let him make the first move.");
    int integerResponse = scanner.nextInt();
    if (integerResponse==1) {
      chargeMehmetS();
    } else if (integerResponse==2){
      startDefensive();
    } else {
      System.out.println("Invalid input, try again");
      mehmetBoss();
    }
  }


/*  This is where the program goes if the user chooses to charge towards Mehmet in the boss fight.
    The user starts with 100 health, and there is a double survivalrate which is a Math.random b/t
    0 and 1. There is a 10% chance (survivalrate>0.9) that you get him down and win the fight right
    then and there. Otherwise (90% chance) that Mehmet reverses the move and you get hurt by this
    maneuver. Your lose 10% of your health (from 100 to 90) and then it asks your next move and takes
    you to chargeMehmet.

**/
  public static void chargeMehmetS(){
    int health = 100;
    double survivalrate = Math.random();
    if(survivalrate>0.9) {
      System.out.println("You got him down adeptly and apprehend him completely. Great job, you've defeated the boss Mehmet!");
    } else {
      System.out.println("Mehmet blocked your takedown attempt and reversed it on you. You got hurt by this maneuver.");
      health = Methods.healthChange(health,-10);
      System.out.println("What is your next move?");
      chargeMehmet();
    }
  }

/*   This is where the previous method takes you after you have lost 10 health and prompts you for your
     next move. It then asks the user if they want to either 1. attempt to wrestle out of the position where
     Mehmet is on top of you, or 2. Try to throw a punch at him. It holds the user's input with the integerResponse
     variable. Then if it's = to 1 it wrestles, if = 2, it punches. If you go with wrestle out, then the program
     goes to the wrestleMehmet method, or to the punchMehmet method. If the user doesn't enter either 1 or 2, it
     tells the user that the input is invalid and that they should try again. Then it restarts the method with
     chargeMehmet();
**/
  public static void chargeMehmet(){
    System.out.println("1) Attempt to wrestle out of the position where he's on top of you.");
    System.out.println("2) Try to throw a punch at him.");
    int integerResponse = scanner.nextInt();
    if (integerResponse==1){
      wrestleMehmet();
    } else if (integerResponse==2){
      punchMehmet();
    } else {
      System.out.println("Invalid input, try again");
      chargeMehmet();
    }
  }

/*   This is the method that runs if the user enters 1 when they are asked if they want
     to try and wrestle out of the position they find themselves in. Then, based on a
     number randomizer, it either has the user win, or lose, with a 60% chance they reverse
     the position and win; if(survivalrate>0.4). It tells the user that they won, or that
     they lost based on this randomizer. There is a 40% chance that Mehmet blocks them
     and he wins, which means the user loses.
**/
  public static void wrestleMehmet(){
    double survivalrate = Math.random(); //double that, in this case, we use for the chance that one of two things happen to the user (win, or die)
    if(survivalrate>0.4){
      System.out.println("You successfully jostle out of the bad position and reverse it back on him. You win!");
    }
    else{
      System.out.println("Mehmet totally blocks your attempt, despite your best efforts. You finally succumb to defeat.");
    }
  }

/*    This is the punch option that the user makes the choice for within the chargeMehmet method. If the user selects
      2, then it comes to this method. There is a 50% chance of this punch which the user chose to throw connecting with
      Mehmet, in which case it knocks him out and the user wins. Otherwise, the punch misses which allows Mehmet to get
      into an even more favorable position, which forces the user to give up and therefore lose.
**/
  public static void punchMehmet(){
    double survivalrate = Math.random();
    if(survivalrate>0.5){
      System.out.println("The punch connects cleanly and knocks him out. Congrats, you've won!");
    }
    else{
      System.out.println("The punch misses and Mehmet gets into an even more dominating position. You are forced to give up because there is no hope now.");
    }
  }

/*   This is the method that the program goes to if the user chooses to start on the defensive at the
     very first choice within the mehmetBoss() method, and then chooses the endure more brutality option
     within the startDefensive() method's choices. It uses math.random with the variable survivalrate to
     determind if the user wins or not. 70% chance they win by using their dominant position, and 30%
     chance that Mehmet miraculously flips the position and throws the user to the ground which ends with
     their defeat.
**/
  public static void endureBrutality(){
    double survivalrate = Math.random();
    System.out.println("You stay on top. You tell him: 'It doesn't have to be like this. Just give up now or else' ");
    if(survivalrate>0.3) {
      System.out.println("Mehmet: 'No way. I will not let you defeat me' ");
      System.out.println("Alright, so be it. Just know that you chose this.");
      System.out.println("You use your currently dominant position unrelentingly to brutalize him. He seems to be knocked out and so you get off of him. Congrats, you won!");
    }
    else if(survivalrate<=0.3) {
      System.out.println("Mehmet: 'No way. I will not let you defeat me' ");
      System.out.println("Mehmet, with some extraordinary effort, flips the position completely, picks you up and throws you to the ground. You have lost ...");
    }
  }

/*    This is the method that is actually the second of two choices in the very first choice menu. So in
      this method the user has chosen to start on the defensive. It has Mehmet attempt a takedown which is
      not successful because the user started on the defensive and was expecting the takedown attempt. Then it
      asks the user for their next move, which is either attempt a submission or stay on top and tell him that
      he can either give up or endure more brutality. Then it uses an int, integerResponse, which holds the user's
      input. If it's 1, it goes to the attemoSubmission method, if it's 2 it goes to the ensureBrutality method.
      Else it tells the user that their input is invalid and restarts the method.
**/
  public static void startDefensive(){
    System.out.println("You were anticipating his takedown attempt and made him pay for it. Instead, you take him down.");
    System.out.println("What is your next move?");
    System.out.println("1) Attempt a submission to get him to tap out.");
    System.out.println("2) Stay on top of him and tell him he can give up now or endure more brutality.");
    int integerResponse = scanner.nextInt();
    if (integerResponse==1){
      attemptSubmission();
    } else if (integerResponse==2){
      endureBrutality();
    } else {
      System.out.println("Invalid input, try again");
      startDefensive();
    }
  }

/*    This method starts only if the user chooses the first option in startDefensive.
      It holds all the possibilities from attempting to submit Mehmet. Either you win
      or you lose in all scenarios. The result is totally randomized, and is done by
      storing a Math.random() value in the variable which is a double survivalrate.
      If survival rate is greater than 0.5 (50% chance) then the user tries an arm
      triangle and wins, which the program informs the user about through text.
      If it is less than or equal to 0.5 then the submission attempt fails, and it
      means the user has expended too much energy. Therefore Mehmet easily counters
      this attempt as the user is tired to the point of exhaustion. Then Mehmet ends
      up victorious.
**/
  public static void attemptSubmission(){
    System.out.println("You attempt a submission to get him to tap out.");
    double survivalrate = Math.random();
    if(survivalrate>0.5) {
      System.out.println("You try an arm triangle and succeed. As Mehmet feels his arm contort in a painful manner, he taps out. Congrats, you win!");
    }
    else if(survivalrate<=0.5) {
      System.out.println("You submission attempt fails. In attempting it, you expended too much energy.");
      System.out.println("As Mehmet looks to counter your attempt, he easily reverses the position. You are dead tired, and submit to his move.");
    }
  }

}
