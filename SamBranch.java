import java.util.Scanner;


public class SamBranch {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Worrying sounds of people crying surround you as you enter Gosman.");
    System.out.println("The dean Jamele Adams pulls you aside and says: <You guys have to be the one to stop this! You have to believe in yourself!");
    System.out.println("More importantly, I know a way you can save us. I know an administrative secret. Specifically, an administrative secret tunnel, called the Louis way that conencts through Gosman.");
    System.out.println("But, I do not know where exactly the entrance is. I've heard rumors that it is either in the weight room or the racquet ball courts.>");
    System.out.println("Where will you go?:");
    System.out.println("1. Weight room");
    System.out.println("2. Racquet ball courts");
    int integerResponse = scanner.nextInt();
    if (integerResponse==1){
        System.out.println("You, Rachel, and JJ go to the weight room and start looking around for a secret entrance");
        System.out.println("What do you do next?");
        System.out.println("1. Stack as many 45lbs plates as you can carry and drop them on the ground, to try and break through to the path");
        System.out.println("2. Look into the mirror and say: \"Louis Brandeis\" three times");
        integerResponse = scanner.nextInt();
        if (integerResponse==1){
            System.out.println("Nothing happens...");
            System.out.println("Now you hear screams, people running, and the sound of an overwhelming horde of squirrels approaching.");
            System.out.println("You prepare to fight, and manage to grab a dumbell as a troop of four elite 3 foot tall squirrels draw their weapons and run into the weight room.");
            double survivalRate = Math.random();
            if (survivalRate>0.3) {
              System.out.println("You three manage to fight them off and they run away for backup.");
              System.out.println("The Dean comes running down and says: \"There is no more time to look for the entrance. We have to fight our way to the SCC! That's where they are all coming from\"");
              System.out.println("You run with the dean back up to the main entrance to see students removing some of the barricades on the doors.");
              System.out.println("Your friend Andrew Yan (the man) comes up to you and says: \"You are leaving for the squirrel thing already? Screw that just come ball with me\"");
              System.out.println("1. Go ball with Andrew");
              System.out.println("2. Go with the students attacking the SCC");
              integerResponse = scanner.nextInt();
              if (integerResponse==1){
                System.out.println("You say goodbye to Rachel, JJ, and all the other students and say there is something more important to be handled.");
                System.out.println("You and Andrew grab a ball and begin a heated 1v1 match.");
                System.out.println("Andrew hits two easy three pointers and then on his third possession crosses you up so bad your ankles literally break.");
                System.out.println("You fall over and crack your skull on the ground, dying on impact");
              } else if (integerResponse==2){
                System.out.println("The dean and you lead the students out of Gosman, ready for battle, but find nothing right outside the doors.");
                System.out.println("Everyone looks to you for the next move");
                System.out.println("1. Lead them across the bridge");
                System.out.println("2. Lead them across the street");
                integerResponse = scanner.nextInt();
                if (integerResponse==1){
                  System.out.println("You walk up the steps to the brigde and a fireball flies past your head.");
                  System.out.println("A squirrel wizard on the other end of the bridge snickers, and yells to you:");
                  System.out.println("\"You aren't getting past these fireballs\" Then, he sends another one at you and you just barely move out of the way.");
                  System.out.println("What do you want to do?");
                  System.out.println("1. Attack the squirrel wizard");
                  System.out.println("2. Attempt to run away");
                  integerResponse = scanner.nextInt();
                  if (integerResponse==1){
                    System.out.println("You, the dean, Rachel and JJ run to attack the wizard but he throws a fireball straight at you.");
                    System.out.println("JJ heroically jumps in front of you and takes the hit for you, and you continue to kick the man-sized squirrel wizard to the ground, and he teleports away before you can finish him off.");
                    System.out.println("Before his body disintigrates, you hear JJ softly say \"JJ will always be in your heart\"");
                    System.out.println("You are not sure why he was talking in the third person, but you have to continue leading the group");
                    System.out.println("1. Go all the way around towards the admissions building");
                    System.out.println("2. Go up those stairs right past the little information shack in the entrance loop");
                    System.out.println("3. Go up the hill on the right side of the information shack");
                    integerResponse = scanner.nextInt();
                  }
                }
              }
            }
          }
        }
      }

      public static void goAdmissions(){
        System.out.println("You hear disgruntled students, confused why you chose the longest way to the SCC, but they follow you anyways");
        System.out.println("You see a small group of squirrel scouts in the distance");
        System.out.println("1. Attack");
        System.out.println("2. Turn back");
        int integerResponse = scanner.nextInt();
      }

      public static void goStairs(){
        System.out.println("You take the stairs up to the SCC and they were completely unguarded.");
        System.out.println("But, at the top of the hill you can see two giant squirrels guarding the doors to the SCC");
        System.out.println("1. Attack");
        System.out.println("2. Cry");
        System.out.println("3. Panic");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1){
          goStairs1();
        } else if (integerResponse==2){
          goStairs2();
        } else if (integerResponse==3){
          Methods.panic();
        }
      }

      public static void goStairs1(){
        System.out.println("The two guards spot your group running at them and they pull out their laser rifles and obliterate everyone");
      }

      public static void goStairs2(){
        System.out.println("As your tears roll down your cheek, JJ's soul springs through your chest, he gives a sly smile to you, he transforms into a banana, and flings himeself past the guards");
        System.out.println("The guards get distracted by the banana and run over to the courtyard, so you and the rest of the students quickly sneak into the SCC");
      }
    }
