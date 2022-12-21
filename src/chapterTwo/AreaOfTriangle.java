package chapterTwo;

import java.util.Scanner;
 public class AreaOfTriangle{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
  
        double base;
        double height;

        System.out.println("Enter base of triangle: ");
         base = input.nextDouble();
         System.out.println("Enter height of triangle: ");
         height = input.nextDouble();


       System.out.println(" Area of triangle: " + base * height / 2);
       }

}