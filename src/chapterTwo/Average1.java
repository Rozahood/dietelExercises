package chapterTwo;

import java.util.Scanner;


public class Average1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Hello Billi! input first digit");
    int firstDigit = input.nextInt();
        System.out.println(" Hello Billi! input second digit");
    int secondDigit = input.nextInt();
        System.out.println(" Hello Billi! input third digit");
        int thirdDigit = input.nextInt();
     int average = (firstDigit + secondDigit + thirdDigit) / 3;

        System.out.println("Therefore, our average = " + average);

    }
}
