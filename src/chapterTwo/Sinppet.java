package chapterTwo;

import java.util.Scanner;
//let the user input a number
//let that number equals p
//let p execute the function in the question
public class Sinppet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a number: ");
        int p = input.nextInt();
        if (p == 5){
            System.out.printf("%d%n", p + 2 * 4);
            System.out.printf("%d", p * 2 + 4);
        }
        else{
            System.out.println("try more dear!");
        }

    }
}
