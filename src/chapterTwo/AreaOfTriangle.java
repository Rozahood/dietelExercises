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


       double Area1 = base * height;

       double Area = Area1 / 2;
             System.out.println(" Area of triangle: " + Area ); 
             



       }

}