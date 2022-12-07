package chapterTwo;

import java.util.Scanner;
 public class
 Acceleration{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
  
        System.out.println("Enter initial velocity (V0): ");
          double V0 = input.nextDouble();
             System.out.println("Enter ending velocity (V1): ");
          double V1 = input.nextDouble();
             System.out.println("Enter time (t): ");
          double time = input.nextDouble();


       double acceleration = (V1 - V0) /time;
            System.out.println("average acceleraton: " + acceleration);
          double Vo = input.nextDouble();
             



       }

}