package chapterTwo;

import java.util.Scanner;

public class Assuming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input first number: ");
        int x = input.nextInt();

        System.out.println("input second number: ");
        int y = input.nextInt();

        System.out.printf("x = %d%n", x + 5);
        System.out.printf("Value of %d * %d is %d\n", x, y, (x * y) );
        System.out.printf("x is %d and y is %d", x, y);
        System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );
    }
    }

