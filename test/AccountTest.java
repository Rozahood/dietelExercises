import chapterThree.AccountClass;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountClass.Account account1 = new AccountClass.Account("Royal Albert", 23.964);
        AccountClass.Account account2 = new AccountClass.Account("Peculiar Ovi", -67.764);

        System.out.printf("%s balance: $ %n",
        account1.getName());
        System.out.printf("%s balance: $ %n%n",
        account2.getName());

        System.out.println("Enter deposit amount for account1:");
        double depositAmount = input.nextDouble();
        System.out.printf("%adding to account1 balance%n%n", depositAmount);

        account1.deposit(depositAmount);

        System.out.printf("%s balance: $ %n",
        account1.getName());
        System.out.printf("%s balance: $ %n%n",
        account2.getName());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%adding to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        System.out.printf("%s balance: $ %n",account1.getName());

        System.out.printf("%s balance: $ %n%n", account2.getName());
    }
}
