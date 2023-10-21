
import java.util.Random;
import java.util.Scanner;

public class numberguessinggame
 {
    
     public static void main(String[] args) {
           Random a=new Random();
           Scanner scan=new Scanner(System.in);
           int randomnumber=a.nextInt(101);
           
           int maxattempt=5;
           System.out.println("welcome to the game...");
           System.out.println("you have to select the number between 0 to 100. And you have"
           +maxattempt+"attempts to guess it");
           int attempts=0;
           boolean guess=false;
           while(attempts<maxattempt)
           {
            System.out.println("enter the number");
            int userguess=scan.nextInt();
            if(userguess==randomnumber)
            {
                 guess=true;
                 break;
            }
            else if(userguess<randomnumber)
            {
                System.out.println("too low ...try again");
            }
            else
            {
                System.out.println("too high..try again");
            }
            attempts++;
           }
           if(guess)
           {
            System.out.println("Congrats..You selected the correct number");
           }
           else
           {
            System.out.println("sorry ..you lost the game...the number is "+randomnumber);
           }
           

     }
}
 