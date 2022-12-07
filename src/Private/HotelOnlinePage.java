package Private;

import java.util.Scanner;

public class HotelOnlinePage {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Welcome to ExRoEm palace!");
        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        System.out.println("""
                How may we serve you?
                1.  Event Centres
                2.  Hotel
                3.  Restaurant
                4.  Studio
                5.  Fashion
                """);
        System.out.print("Reply: ");
        int userInput = input.nextInt();


        switch (userInput) {
            case 1 -> eventCenter();
            case 2 -> hotel();
            case 3 -> restaurant();
            case 4 -> studio();
            case 5 -> fashion();
        }
    }

    private static void eventCenter() {
        System.out.println("""
                a)  Daily events -> 50k
                b)  Camping events -> 100k 
                """);
        System.out.print("Reply: ");
        String eventType = input.next();
        switch (eventType) {
            case "a" -> System.out.println("""
                    Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
            case "b" -> System.out.println("""
                    Payment account details is below 
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
        }
    }

    private static void hotel() {
        System.out.println("""
                a)  1st class -> 200k
                b)  2nd class -> 100k
                c)  3rd class -> 50k
                """);
        System.out.println("Reply: ");
        String hotelType = input.next();
        switch (hotelType) {
            case "a" -> System.out.println("""
                     Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
            case "b" -> System.out.println("""
                     Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
            case "c" -> System.out.println("""
                       Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
        }
    }

    private static void restaurant() {
        System.out.println("""
                a)  children`s space -> 10k 
                b)    Adult space -> 50k
                """);
        System.out.println("Reply: ");
        String restaurant = input.next();
        switch (restaurant) {
            case "a" -> System.out.println("""
                     Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
            case "b" -> System.out.println("""
                     Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
        }
    }

    private static void studio() {
        System.out.println("""
                a)   Cabinet Entry -> <30k and >500
                b)   Cabinet Forward -> <50k and >30k
                """);
        System.out.println("Reply: ");
        String studio = input.next();
        switch (studio) {
            case "a" -> System.out.println("""
                     Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
            case "b" -> System.out.println("""
                     Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
        }
    }

    private static void fashion() {
        System.out.println("""
                a)  Flat 1 -> <50k and >100k 
                b)  Flat 2-> <500k and >200k
                  """);
        System.out.println("Reply: ");
        String fashion = input.next();
        switch (fashion) {
            case "a" -> System.out.println("""
                     Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);
            case "b" -> System.out.println("""
                     Payment account details is below
                    Account Name: Royal Account
                    Account number: 1234566
                    Bank Name: Oredegbe Microfinance Bank
                    """);

        }
    }

}