import java.util.Scanner;
import java.util.Random;

public class RefactorMailroomToGosman{
  private static Random random;


  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    random = new Random();

    ChoiceOneDescription();
    int integerResponse = scanner.nextInt();
    ChoiceOne(integerResponse);
  }

  public static void ChoiceOneDescription(){
    System.out.println("Welcome to the mailroom. You have already been waiting in line for hours. You’re starting to feel fatigue in your legs, your blood sugar is dropping, you feel your knees giving out.");
    System.out.println("Do you: ");
    System.out.println("1. Keep waiting, your package should be ready any minute");
    System.out.println("2. Get out of there, something is not right.");
  }


  public static void ChoiceOne(int integerResponse){
       Scanner scanner = new Scanner(System.in);
       if(integerResponse==1){
         ChoiceTwoDescription();
         integerResponse = scanner.nextInt();
         ChoiceTwo(integerResponse);

      }if(integerResponse == 2){
          PasswordFirstRun();
          integerResponse = scanner.nextInt();
          GracePassword(integerResponse);
          }
        }


  public static void ChoiceTwoDescription(){
      System.out.println("As you're waiting, mail begins to pick up from the shelves, start spinning around, and FORMS A MONSTER CAPABLE OF BREATHING, TALKING, STEALING YOUR FINAL PROJECT, AND KILLING YOU. do you: ");
      System.out.println("There is an 90% chance you are being over confident, and you die, and a 10% chance you really have what it takes. ");
      System.out.println("1. Fight");
      System.out.println("2. Flee");
      }


  public static void ChoiceTwo(int integerResponse){
      if(integerResponse==1){
        double survivalrate = Math.random();
        if(survivalrate>0.1){
          System.out.println("You've died. Guess you didn't have what it takes");
        }if(survivalrate<0.1){
          System.out.println("Oh my god, you've narrowly survived!! You jump over the counter, get your final project, kick down the door, and save your friend Yael in the process. Get out of there and head to Gosman!");
          SamBranch.goGosman();
        }
      }
    }

  public static void PasswordFirstRun(){
      System.out.println("The door is LOCKED with a number password. You have to guess it. ");
      System.out.println("Ok... let's try to ride this good luck streak...let's just throw in an educated guess.");
      System.out.println("Enter number password: ");
        }


  public static void GracePassword(int integerResponse){
    Scanner scanner = new Scanner(System.in);

    while(integerResponse!=718135){
      LookLeftOrRight();
      integerResponse = scanner.nextInt();
    if(integerResponse == 718135){
      break;
    }
      }System.out.println("Oh my god! You've guessed it! Get out of here!!!! head to Gosman!!! A thought crosses your mind - who else was there? I think Yael...where did she go??");
      SamBranch.goGosman();
    }


  public static void LookLeftOrRight(){
    Scanner scanner = new Scanner(System.in);
    LeftRightInstructions();
    int newIntegerResponse = scanner.nextInt();
    while(newIntegerResponse ==2){
      System.out.println("Ok... there's a note here...it says...password is first name of computer science pioneer ... amazing woman... use numbers that correspond to alphabet's order. (no spaces)");
      break;
    }while(newIntegerResponse == 1){
      System.out.println("No...nothing here...  Going to have to guess again.");
      break;
    }
    System.out.println("Enter number password: ");
  }


  public static void LeftRightInstructions(){
    System.out.println("That's wrong. ");
    System.out.println("Ok...look around...there must be a hint somewhere");
    System.out.println("1. Look left");
    System.out.println("2. Look right");
  }
  }
