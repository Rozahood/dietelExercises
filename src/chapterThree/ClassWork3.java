package chapterThree;

import java.util.Scanner;


public class ClassWork3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println(" Hello User! input three number");
    int number = input.nextInt();
	int firstNumber = number/ 100 % 10;
	int secondNumber = number/ 10 % 10;
        int thirdNumber = number / 1 % 10;

         if (firstNumber == thirdNumber) {
             System.out.println("This is a palindrum");

}    else {System.out.println("Sory! this isn´t a palindrum.");
    }


   }
}