import java.util.Scanner;


public class ProjectStart {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    IntroductionAndName();
    String name = scanner.nextLine();
    System.out.println("Where would you like to start?");
    System.out.println("1. Olin-Sang");
    System.out.println("2. Sherman");
    System.out.println("3. Massell");
    System.out.println("4. The Mailroom");
    int integerResponse = scanner.nextInt();
    if (integerResponse==1){
      OlinSangIntro.FirstChoice();
    } else if (integerResponse==2){
      //Sherman
    } else if (integerResponse==3){
      RomanBranch.rStart();
    } else if (integerResponse==4){
      RefactorMailroomToGosman.ChoiceOneDescription();
      integerResponse = scanner.nextInt();
      RefactorMailroomToGosman.ChoiceOne(integerResponse);
    }
  }

  public static void IntroductionAndName(){
    System.out.println("Hello, you've entered the MSRY simulator! You will be faced with many life or death decisions");
    System.out.println("What is your name?");
  }
}
