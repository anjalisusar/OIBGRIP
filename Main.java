import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Random Random_number= new Random();
    int correct_guess=Random_number.nextInt(100);
    int turns=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );
    System.out.println("Best of luck!");
    
    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
      guess=sc.nextInt();
      turns++;
    
    if(guess==correct_guess) {
      win=true;
    }
    else if(i>8){
      System.out.println("You loose! the right answer was: "+correct_guess);
      return;
    }
    else if(guess<correct_guess){
      i++;
      System.out.println("Your Guess is lower than the right guess! Turns left: "+(10-i));
      
      
      
    }
    else if(guess>correct_guess) {
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: "+(10-i));
      
    }
    
    

  }
    System.out.println("You win!");
    System.out.println("Then number was "+correct_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    

}
}