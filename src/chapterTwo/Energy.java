package chapterTwo;

import java.util.Scanner;
 public class Energy{
   public static <energy> void main(String[] args){
     Scanner input = new Scanner(System.in);

        double Water;
        double InitialTemp;
        double FinalTemp;

           System.out.println("Enter the amount of water in kilogram: ");
              Water = input.nextDouble();

           System.out.println("Enter the initial temperature in celcius: ");
              InitialTemp = input.nextDouble();

           System.out.println("Enter the final temperature in celcius: ");
       FinalTemp = input.nextDouble();
              double Int = Water + (FinalTemp - InitialTemp * 4184);


              Int =  Water + (FinalTemp - InitialTemp * 4184);

             System.out.println("energy needed = " + FinalTemp + ("-") + "InitialTemp" );






       }

}