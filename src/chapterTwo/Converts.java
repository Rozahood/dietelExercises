package chapterTwo;

import java.util.Scanner;
 public class Converts{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
  
       
        double pounds;
        double kilograms;

           System.out.println("Enter a number in prompt: ");
         pounds = input.nextDouble();
        
     kilograms = pounds * 0.454;
             System.out.println(pounds + " is " + kilograms + "kilograms");

       }

}