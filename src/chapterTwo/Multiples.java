package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int x = input.nextInt();
        System.out.println("Enter second number");
        int y = input.nextInt();

        int multiple3 = x * 3;
        int multiple2 = y * 2;

        int result = multiple3 + multiple2;


        if(multiple3 == multiple2 ) {
            System.out.println(result);
        }
        else{
        System.out.println("Try again");
    }
}
}
