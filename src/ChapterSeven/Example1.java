package ChapterSeven;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many scores you one add");
        int numbersOfScores = scanner.nextInt();
        int[] scores = new int[numbersOfScores];
        int sum =0;

        for (int index = 0; index < numbersOfScores; index++){
            System.out.println("Enter score" + (index+1));
            scores[index] = scanner.nextInt();
        }

        for (int index =0; index < scores.length; index++){
            sum += scores[index];
        }

        System.out.println("sum of scores is " + sum);
    }
}
