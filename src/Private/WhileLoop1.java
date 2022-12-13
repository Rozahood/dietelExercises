package Private;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers between 1 and 10: ");
        int number = input.nextInt();

        while (number < 1 || number > 10){
            System.out.print( number + "? Level up man!");
            int num = input.nextInt();
        }

        System.out.println("You are on point! ");
    }
}
