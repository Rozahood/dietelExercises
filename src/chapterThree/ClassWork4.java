package chapterThree;

import java.util.Scanner;


public class ClassWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println(" Hello User! input a number");
    int number = input.nextInt();
	

        if (number % 2 == 0) {
             System.out.printf("%d is an even number", number)  ;

}    else {System.out.printf("%d is an odd number.", number);
    }


   }
}