package chapterTwo;

import java.util.Scanner;
 public class
 Acceleration{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
  
        System.out.println("Enter initial velocity (V0): ");
          double initialVelocity = input.nextDouble();
          System.out.println("Enter ending velocity (V1): ");
          double endingVelocity = input.nextDouble();
          System.out.println("Enter time (t): ");
          double time = input.nextDouble();


       double acceleration = (endingVelocity - initialVelocity) /time;
       System.out.println("average acceleration: " + acceleration);

       }

}