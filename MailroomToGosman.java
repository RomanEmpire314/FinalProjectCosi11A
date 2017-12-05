import java.util.Scanner;
import java.util.Random;

public class MailroomToGosman{

  private static Random random;

public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  random = new Random();
  int health = 100;



  System.out.println("Welcome to the mailroom. You have already been waiting in line for hours. You’re starting to feel fatigue in your legs, your blood sugar is dropping, you feel your knees giving out.");
  System.out.println("Do you: ");
  System.out.println("1. Keep Waiting, your package should be ready any minute");
  System.out.println("2. Get out of there, something is not right.");
  int integerResponse = scanner.nextInt();
  if(integerResponse==1){
    System.out.println("Mail begins to pick up from the shelves, start spinning around, and FORMS A MONSTER CAPABLE OF BREATHING, TALKING, STEALING YOUR FINAL PROJECT, AND KILLING YOU. do you: ");
    System.out.println("1. Fight");
    System.out.println("2. Flee");
    integerResponse = scanner.nextInt();
  
      System.out.println("There is an 80% chance you are being over confident, and you die, and a 20% chance you really have what it takes. ");
      double survivalrate = Math.random();
      if(survivalrate>0.2){
        System.out.println("You've died. Guess you didn't have what it takes");
        System.out.println("Play again?");
      }if(survivalrate<0.2){
        System.out.println("Oh my god, you've won!! You jump over the counter, get your final project, kick down the door, and save your friend Yael in the process. Get out of there and head to Gosman!");
      }
    }
  if(integerResponse == 2){
      System.out.println("The door is LOCKED with a word password. You have to guess it. ");
      System.out.println("Ok... let's try to ride this good luck streak...let's just throw in an educated guess.");
      System.out.println("Enter number password: ");
       integerResponse = scanner.nextInt();
      if(integerResponse == 718135){
        System.out.println("Oh my god! You've guessed it! Get out of here!!!! head to Gosman!!! A thought crosses your mind - who else was there? I think Yael...where did she go??");
      }while(integerResponse!= 718135){
        System.out.println("Ok...look around...there must be a hint somewhere");
        System.out.println("1. Look left");
        System.out.println("2. Look right");
        integerResponse = scanner.nextInt();
        if(integerResponse ==2){
          System.out.println("Ok... there's a paper here...it says...password is first name of computer science pioneer ... amazing woman... use numbers that correspond to alphabet");
        }
        if(integerResponse == 1){
          System.out.println("No...nothing here...I guess I'll look right");
        }System.out.println("Enter number password: ");
        integerResponse = scanner.nextInt();
        if(integerResponse == 718135){
          System.out.println("Oh my god! You've guessed it! Get out of here!!!! head to Gosman!!! A thought crosses your mind - who else was there? I think Yael...where did she go??");
        }

        }
      }
