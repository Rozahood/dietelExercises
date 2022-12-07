package Private;

import java.util.Scanner;


public class Signs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println(" Hello User! input first digit");
    int firstDigit = input.nextInt();
        System.out.println(" Hello User! input second digit");
    int secondDigit = input.nextInt();

       int addition = (firstDigit + secondDigit);
      int substraction = (firstDigit - secondDigit);
     int division = (firstDigit / secondDigit);
    int mod = (firstDigit % secondDigit);

        System.out.printf("%d%n", addition);
         System.out.printf("%d%n", substraction);
          System.out.printf("%d%n", division);
           System.out.printf("%d%n", mod);
    

    }
}
