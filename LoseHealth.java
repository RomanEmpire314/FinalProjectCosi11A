public class LoseHealth{


public static void main(String[] args){
   int health = 100;

   health = loseHealth(health);
   System.out.println(health);
   health = loseHealth(health);
   System.out.println(health);
 }

  public static int loseHealth(int health){
    health = health - 2;
    return health;
 }
}
