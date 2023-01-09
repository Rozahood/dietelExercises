package Private;

import java.security.SecureRandom;
import java.util.Scanner;

public class Billion_Coin {
    // Flip the coin
    //  Check if the coin result to head or tail.
    //  If its head display head, but if its tail, display tail.
    static int result;

   public static void flipTheCoin(){
       SecureRandom rand = new SecureRandom();
       result = rand.nextInt(2);    //  The result of flipping this coin is equal to a random number below 2.
   }
   public static String displayIfItsHeadOrTail(){
       if (result == 0){
           return "Head";
       }
       else
       return "Tail";
   }

   public static void continueOrNot(){
       System.out.print("Do you wish to continue?? \n" +
               "           Enter y     ->>  yes \n" +
               "           other keys  ->>  No \n" +
               "                      : ");

       Scanner input = new Scanner(System.in);
       String userInput = input.nextLine();

       if(userInput.equals("y")){
           flipTheCoin();
           System.out.println(displayIfItsHeadOrTail());
           continueOrNot();
       }
       else{
           System.out.println("ending the game...");
       }
   }
    public static void main(String[] args){
           flipTheCoin();
           System.out.println(displayIfItsHeadOrTail());
           continueOrNot();
    }
}