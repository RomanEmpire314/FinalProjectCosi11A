import java.util.Scanner;

public class FixMehmet {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    mehmetBoss();

    /*
    System.out.println("You have caught yourself up in a conflict with Mehmet!");
    System.out.println("Drop any weapons you might have. None are allowed in this battle!");
    System.out.println("What's your first move?");
    System.out.println("1) Charge at him and try to tackle him down to the ground!");
    System.out.println("2) Start on the defensive. Let him make the first move.");
    double survivalrate = Math.random();
    Scanner scanner = new Scanner(System.in);
    int integerResponse = scanner.nextInt();
    if (integerResponse==1) {
      survivalrate = Math.random();
      if(survivalrate>0.9) {
        System.out.println("You got him down adeptly and apprehend him completely. Great job, you've defeated the boss Mehmet!");
      } else {
        System.out.println("Mehmet blocked your takedown attempt and reversed it on you. You got hurt by this maneuver.");

        System.out.println("Mehmet blocked your takedown attempt and reversed it on you. You got hurt by this maneuver.");
        //use losehealth here, make the user lose 10 health points
        System.out.println("What is your next move?");
        System.out.println("1) Attempt to wrestle out of the position where he's on top of you.");
        System.out.println("2) Try to throw a punch at him.");
        integerResponse = scanner.nextInt();
          if(integerResponse==1){
            survivalrate = Math.random();
            if(survivalrate>0.4){
              System.out.println("You successfully jostle out of the bad position and reverse it back on him. You win!");
            }
            else{
              System.out.println("Mehmet totally blocks your attempt, despite your best efforts. You finally succumb to defeat.");
            }
          }
          else{
            survivalrate = Math.random();
            if(survivalrate>0.5) {
              System.out.println("The punch connects cleanly and knocks him out. Congrats, you've won!");
            } else{
              System.out.println("The punch misses and Mehmet gets into an even more dominating position. You give up because there is no hope now.");
            }
          }
      }
    }

    else{
      survivalrate = Math.random();
      if(survivalrate>0.6) {
        System.out.println("You were anticipating his takedown attempt and made him pay for it.");
        //make Mehmet lose some health points here (let's say, 10)
        System.out.println("What is your next move?");
        System.out.println("1) Attempt a submission to get him to tap out.");
        System.out.println("2) Stay on top of him and tell him he can give up now or endure more brutality.");
        integerResponse = scanner.nextInt();
        if(integerResponse==1) {
          System.out.println("You attempt a submission to get him to tap out.");
          survivalrate = Math.random();
          if(survivalrate>0.5) {
            System.out.println("You try an arm triangle and succeed. As Mehmet feels his arm contort in a painful manner, he taps out. Congrats, you win!");
          }
          else if(survivalrate<0.5) {
            System.out.println("You submission attempt fails. In attempting it, you expended too much energy.");
            System.out.println("As Mehmet looks to counter your attempt, he easily reverses the position. You are dead tired, and submit to his move.");
          }
        }
        else {
          survivalrate = Math.random();
          System.out.println("You stay on top. You tell him: 'It doesn't have to be like this. Just give up now or else' ");
          if(survivalrate>0.3) {
            System.out.println("Mehmet: 'No way. I will not let you defeat me' ");
            System.out.println("Alright, so be it. Just know that you chose this.");
            System.out.println("You use your currently dominant position unrelentingly to brutalize him. He seems to be knocked out and so you get up. Congrats, you won!");
          }
          else if(survivalrate<=0.3) {
            System.out.println("Mehmet: 'No way. I will not let you defeat me' ");
            System.out.println("Mehmet, with some extraordinary effort, flips the position completely, picks you up and throws you to the ground. You have lost ...");
          }
        }
      } else if (survivalrate>0.3) {
          System.out.println("You both get into a clinch with your arms interlocked and break after a few seconds of jostling for position. You break after a stalemate.");
      } else {
        System.out.println("You are able to get him down and hurt him with some body blows. He is hurt by them.");
        //deduct 20 health points from Mehmet

      }
    }*/

  }

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

  public static void wrestleMehmet(){
    double survivalrate = Math.random();
    if(survivalrate>0.4){
      System.out.println("You successfully jostle out of the bad position and reverse it back on him. You win!");
    }
    else{
      System.out.println("Mehmet totally blocks your attempt, despite your best efforts. You finally succumb to defeat.");
    }
  }

  public static void punchMehmet(){
    double survivalrate = Math.random();
    if(survivalrate>0.4){
      System.out.println("You successfully jostle out of the bad position and reverse it back on him. You win!");
    }
    else{
      System.out.println("Mehmet totally blocks your attempt, despite your best efforts. You finally succumb to defeat.");
    }
  }

  public static void endureBrutality(){
    double survivalrate = Math.random();
    System.out.println("You stay on top. You tell him: 'It doesn't have to be like this. Just give up now or else' ");
    if(survivalrate>0.3) {
      System.out.println("Mehmet: 'No way. I will not let you defeat me' ");
      System.out.println("Alright, so be it. Just know that you chose this.");
      System.out.println("You use your currently dominant position unrelentingly to brutalize him. He seems to be knocked out and so you get up. Congrats, you won!");
    }
    else if(survivalrate<=0.3) {
      System.out.println("Mehmet: 'No way. I will not let you defeat me' ");
      System.out.println("Mehmet, with some extraordinary effort, flips the position completely, picks you up and throws you to the ground. You have lost ...");
    }
  }

  public static void startDefensive(){
    System.out.println("You were anticipating his takedown attempt and made him pay for it.");
    //make Mehmet lose some health points here (let's say, 10)
    System.out.println("What is your next move?");
    System.out.println("1) Attempt a submission to get him to tap out.");
    System.out.println("2) Stay on top of him and tell him he can give up now or endure more brutality.");
    int integerResponse = scanner.nextInt();
    if (integerResponse==1){
      attemptSubmission();
    } else if (integerResponse==2){
      endureBrutality();
    } else {
      startDefensive();
    }
  }

  public static void attemptSubmission(){
    System.out.println("You attempt a submission to get him to tap out.");
    double survivalrate = Math.random();
    if(survivalrate>0.5) {
      System.out.println("You try an arm triangle and succeed. As Mehmet feels his arm contort in a painful manner, he taps out. Congrats, you win!");
    }
    else if(survivalrate<0.5) {
      System.out.println("You submission attempt fails. In attempting it, you expended too much energy.");
      System.out.println("As Mehmet looks to counter your attempt, he easily reverses the position. You are dead tired, and submit to his move.");
    }
  }

}
