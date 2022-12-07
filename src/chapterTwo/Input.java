package chapterTwo;

import java.util.Scanner;

public class Input{
    //declaring a method
   public static void main( String[] args){
       //import scanner
    Scanner input = new Scanner(System.in);
    //prompting user
       System.out.println("Enter first number");
       int x = input.nextInt();
       System.out.println("Enter second number");
       int y = input.nextInt();
       System.out.println("Enter third number");
       int z = input.nextInt();
       //assigning int x,y,z into result
      int result = x+y+z;
       System.out.printf("addition is %d%n", result);

       result = x*y*z;
       System.out.printf("product is %d%n", result);

       int average = (x+y+z) / 3;
       System.out.println("Therefore, our average = " + average);


   }
}