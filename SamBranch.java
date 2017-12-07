import java.util.Scanner;


public class SamBranch {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    goGosman();
  }

      public static void goGosman(){
        System.out.println("You've arrived at Gosman!");
        System.out.println("Worrying sounds of people crying surround you as you enter Gosman.");
        System.out.println("The dean Jamele Adams pulls you aside and says: <You guys have to be the one to stop this! You have to believe in yourself!");
        System.out.println("More importantly, I know a way you can save us. I know an administrative secret. Specifically, an administrative secret tunnel, called the Louis way that conencts through Gosman.");
        System.out.println("But, I do not know where exactly the entrance is. I've heard rumors that it is either in the weight room or the squash courts.>");
        System.out.println("Where will you go?:");
        System.out.println("1. Weight room");
        System.out.println("2. Squash courts");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1){
          weightRoom();
        } else if (integerResponse==2){
          squash();
        }
      }

      public static void squash(){
        System.out.println("When you arrive to the courts you see them full of athletic, muscular squirrels and they squash the ball so hard it bounces off the wall and hits you in the face... ");
        System.out.println("You die...");
      }

      public static void squirrelKingIntro(){
        System.out.println("Open the door leads to a statue of a squirrel wearing a crown and holding a sesame bagel with jalapeno salsa schmear.");
        System.out.println("The statue is engraved: Our time of reckoning will come when one can give their life for glory");
        System.out.println("JJ says he has seen this before, you ask JJ what he is talking about and then he says it can only stop the way it started");
        System.out.println("Instantly, the air around you starts to vibrate and a flash of light consumes the room. Screams shake the room, … then he is transported into the statue of the squirrel king, bringing it to life");
      }

      public static void squirrelKingChoice(){
        System.out.println("1. Say: JJ?");
        System.out.println("2. Say what is happening");
        System.out.println("3. Panic");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1){
          squirrelKing1();
      } else if (integerResponse==2){
          squirrelKing2();
      } else if (integerResponse==3){
          Methods.panic();
          squirrelKingChoice();
      }
    }

      public static void squirrelKing1(){
        System.out.println("JJ, I do not know of this JJ, but since I have been awoken I can only assume he is my soul boy. I am sorry for his loss, but he chose this path at a very young age.");
        System.out.println("I will replace him as your battle companion for the time being");
        squirrelKingChoice();
      }

      public static void squirrelKing2(){
        System.out.println("My time has come again, someone has been abusing the power of my army, impersonating me and committing treason. It can be the only reason that I have been awoken");
        System.out.println("1. Say: How do we stop this?");
        System.out.println("2. Say: I do not trust you filthy squirrel! Die!");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1){
          System.out.println("There is no time, the MSRY crew is in the SCC, and they must be stopped! I will bring you there.");
          System.out.println("You and your friends are teleported to the SCC.");
        } else if (integerResponse==2){
          double survivalRate = Math.random();
          if (survivalRate>0.9){
            System.out.println("You barely defeat the squirrel king in battle, but Rachel seems pissed, JJ is probably not coming back, and you do not know what to do next.");
            System.out.println("Let's just say you won the game by beating him. Congratulations!");
          } else {
            System.out.println("The squirrel king defeats you with ease, and crushes your skull with his scepter.");
          }
        }
      }

      public static void lookMirror(){
        System.out.println("A celestial being pulls you and your friends through the mirror.");
        System.out.println("Inside the tunnel are two doors");
        System.out.println("1. Go through the left door");
        System.out.println("2. Go through the right door");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1){
          System.out.println("Opening the door creates a burst of light, and you, Rachel, and JJ find yourselves on the sidewalk next to Gosman");
          choosePathStreet();
        } else if (integerResponse==2){
          squirrelKingIntro();
          squirrelKingChoice();
        }
      }

      public static void weightRoom(){
        System.out.println("You, Rachel, and JJ go to the weight room and start looking around for a secret entrance");
        System.out.println("What do you do next?");
        System.out.println("1. Stack as many 45lbs plates as you can carry and drop them on the ground, to try and break through to the path");
        System.out.println("2. Look into the mirror and say: \"Louis Brandeis\" three times");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1){
          dropWeights();
        } else if (integerResponse==2){
          lookMirror();
        } else {
          System.out.println("Invalid Input, try again.");
          weightRoom();
        }
      }

      public static void dropWeights(){
        System.out.println("Nothing happens...");
        System.out.println("Now you hear screams, people running, and the sound of an overwhelming horde of squirrels approaching.");
        System.out.println("You prepare to fight, and manage to grab a dumbell as a troop of four elite 3 foot tall squirrels draw their weapons and run into the weight room.");
        double survivalRate = Math.random();
        if (survivalRate>0.3) {
          weightRoomFightWin();
        } else {
          System.out.println("The squirrel elites sever your head from your body.");
        }
      }

      public static void weightRoomFightWin(){
        System.out.println("You three manage to fight them off and they run away for backup.");
        System.out.println("The Dean comes running down and says: \"There is no more time to look for the entrance. We have to fight our way to the SCC! That's where they are all coming from\"");
        System.out.println("You run with the dean back up to the main entrance to see students removing some of the barricades on the doors.");
        System.out.println("Your friend Andrew Yan (the man) comes up to you and says: \"You are leaving for the squirrel thing already? Screw that just come ball with me\"");
        System.out.println("1. Go ball with Andrew");
        System.out.println("2. Go with the students attacking the SCC");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1){
          AndrewYanTheMan();
        } else if (integerResponse==2){
            goOutside();
          }
      }

      public static void AndrewYanTheMan(){
        System.out.println("You say goodbye to Rachel, JJ, and all the other students and say there is something more important to be handled.");
        System.out.println("You and Andrew grab a ball and begin a heated 1v1 match.");
        System.out.println("Andrew hits two easy three pointers and then on his third possession crosses you up so bad your ankles literally break.");
        System.out.println("You fall over and crack your skull on the ground, dying on impact");
      }

      public static void choosePathStreet(){
        System.out.println("1. Go all the way around towards the admissions building");
        System.out.println("2. Go up those stairs right past the little information shack in the entrance loop");
        System.out.println("3. Go up the hill on the right side of the information shack");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1) {
          goAdmissions();
        } else if (integerResponse==2) {
          goStairs();
        } else if (integerResponse==3) {
          goHill();
        } else {
          System.out.println("Invalid input, try again.");
          choosePathStreet();
        }
      }

      public static void goStreet(){
        double survivalRate = Math.random();
        if (survivalRate>0.8){
          System.out.println("You try and cross the street but a car covered in angry squirrels comes flying down South street and runs you over.");
        } else {
          System.out.println("Choose your path to the SCC");
          choosePathStreet();
        }
      }

      public static void goOutside(){
        System.out.println("The dean and you lead the students out of Gosman, ready for battle, but find nothing right outside the doors.");
        System.out.println("Everyone looks to you for the next move");
        System.out.println("1. Lead them across the bridge");
        System.out.println("2. Lead them across the street");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1) {
          goBridge();
        } else if (integerResponse==2) {
          goStreet();
        } else {
          System.out.println("Invalid input, try again.");
          goOutside();
        }
      }

      public static void goBridge(){
        goBridgeIntro();
        goBridgeChoice();
      }

      public static void goBridgeChoice(){
        System.out.println("1. Attack the squirrel wizard");
        System.out.println("2. Attempt to run away");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1) {
          attackWizard();
        } else if (integerResponse==2) {
          runAway();
        } else {
          System.out.println("Invalid input, try again.");
          goBridgeChoice();
        }
      }

      public static void goBridgeIntro(){
        System.out.println("You walk up the steps to the bridge and a fireball flies past your head.");
        System.out.println("A squirrel wizard on the other end of the bridge snickers, and yells to you:");
        System.out.println("\"You aren't getting past these fireballs\" Then, he sends another one at you and you just barely move out of the way.");
        System.out.println("What do you want to do?");
      }

      public static void runAway(){
        System.out.println("A fiery wall shoots up and blocks your path");
        goBridgeChoice();
      }

      public static void attackWizard(){
        System.out.println("You, the dean, Rachel and JJ run to attack the wizard but he throws a fireball straight at you.");
        System.out.println("JJ heroically jumps in front of you and takes the hit for you, and you continue to kick the man-sized squirrel wizard to the ground, and he teleports away before you can finish him off.");
        System.out.println("Before his body disintigrates, you hear JJ softly say \"JJ will always be in your heart\"");
        System.out.println("You are not sure why he was talking in the third person, but you have to continue leading the group");
        System.out.println("1. Go all the way around towards the admissions building");
        System.out.println("2. Go up those stairs right past the little information shack in the entrance loop");
        System.out.println("3. Go up the hill on the right side of the information shack");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1) {
          goAdmissions();
        } else if (integerResponse==2) {
          goStairs();
        } else if (integerResponse==3) {
          goHill();
        } else {
          System.out.println("Invalid input, try again.");
          attackWizard();
        }
      }

      public static void goAdmissions(){
        System.out.println("You hear disgruntled students, confused why you chose the longest way to the SCC, but they follow you anyways");
        System.out.println("You see a small group of squirrel scouts in the distance");
        System.out.println("1. Attack");
        System.out.println("2. Turn back");
        int integerResponse = scanner.nextInt();
        if (integerResponse==1){
          goAdmissions1();
        } else if (integerResponse==2){
          goAdmissions2();
        } else {
          System.out.println("Invalid input, try again.");
          goAdmissions();
        }
      }

      public static void goAdmissions1(){
        System.out.println("You run up to the squirrel scouts and get involved in a wallop");
        double survivalRate = Math.random();
        if (survivalRate>0.8){
          System.out.println("The squirrel scouts spear you like a kebab and use your body as a weapon to kill the rest of your friends.");
        } else {
          System.out.println("You and your friends defeat the pack of squirrels, steal their spears, and head to the SCC");
          double chooseBoss = Math.random();
          if (chooseBoss>0.2){
            YaelBossFight.chooseFirstLook();
          } else {
            FixMehmet.mehmetBoss();
          }
        }
      }

      public static void goAdmissions2(){
        System.out.println("Turning around, you trip on your shoelaces");
        double survivalRate = Math.random();
        if (survivalRate>0.8){
          System.out.println("You crack your neck on the pavement and die");
        } else {
          System.out.println("You regain yor balance and head back to the information shack.");
        }
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
          goStairs();
        } else {
          goStairs();
        }
      }

      public static void goStairs1(){
        System.out.println("The two guards spot your group running at them and they pull out their laser rifles and obliterate everyone");
      }

      public static void goStairs2(){
        System.out.println("As your tears roll down your cheek, JJ's soul springs through your chest, he gives a sly smile to you, he transforms into a banana, and flings himeself past the guards");
        System.out.println("The guards get distracted by the banana and run over to the courtyard, so you and the rest of the students quickly sneak into the SCC");
        double chooseBoss = Math.random();
        if (chooseBoss>0.2){
          YaelBossFight.chooseFirstLook();
        } else {
          FixMehmet.mehmetBoss();
        }
      }

      public static void goHill(){
        System.out.println("a boulder comes rolling down the hill");
        double survivalRate = Math.random();
        if (survivalRate>0.9){
          System.out.println("You dodge the boulder! Nice! Now you run into the SCC");
          double chooseBoss = Math.random();
          if (chooseBoss>0.2){
            YaelBossFight.chooseFirstLook();
          } else {
            FixMehmet.mehmetBoss();
          }
        } else {
          System.out.println("The boulder crushes you before you can get out of the way");
        }
      }
    }
