package chapterFive;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int i = 1;
    do {
        System.out.println("Enter a number between 1 and 10");
        i = scanner.nextInt();
    } while(i <=1 || i >10);

        System.out.println(i + " is between the range");
}
}
