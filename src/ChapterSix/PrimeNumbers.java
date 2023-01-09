package ChapterSix;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Enter a number prime: ");
        int num = input.nextInt();

        if (prime(number))
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is a prime number");  }

    private static boolean prime(int number) {
        if (number <= 1)
                return false;
        int i= 2;
        while(i <= number/2){
            if((number % i) == 0)
                return false;
            i ++;
        }
        return true;
    }
}
