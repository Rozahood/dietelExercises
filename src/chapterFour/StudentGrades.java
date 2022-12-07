package chapterFour;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        //importing Scanner
        Scanner StudentGrade = new Scanner(System.in);
        //initializing
        System.out.println("Welcome User!");
        int sum = 0;
        int counter = 1;
        int average = 0;
          for (counter = 1; counter <= 10; counter ++) {

            switch (counter) {
                case 1:
                System.out.println("Enter first grade: ");
                break;

                case 2:
                System.out.println("Enter second grade: ");
                break;

                case 3:
                System.out.println("Enter third grade: ");
                break;

                case 4:
                System.out.println("Enter fourth grade: ");
                break;

                case 5:
                System.out.println("Enter fifth grade: ");
                break;

                case 6:
                System.out.println("Enter sixth grade");
                break;

                case 7:
                System.out.println("Enter seventh grade: ");
                break;

                case 8:
                System.out.println("Enter eighth grade: ");
                break;

                case 9:
                System.out.println("Enter nineth grade: ");
                break;

                case 10:
                System.out.println("Enter tenth grade: ");
                break;

        //it should return the sum of

    }
     int grade = StudentGrade.nextInt();
            sum = grade + sum;
            average = sum / counter;
    }
        System.out.println("sum of grade is :" + sum);
        System.out.println("The total average score is : " + average);
}}
