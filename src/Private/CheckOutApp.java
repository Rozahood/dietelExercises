package Private;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {
    private static final Scanner scanner = new Scanner(System.in);
        String customerName;
        String more;
        Double discount;
        String CashierName;

        ArrayList<String> iteratorBucket = new ArrayList<>(50);
        ArrayList<String> items = new ArrayList<>(50);
        ArrayList<Double> price = new ArrayList<>(50);
        ArrayList<Integer> quantity = new ArrayList<>(50);
        ArrayList<Double> total = new ArrayList<>(50);
            double subTotal = 0;
            int amountPaid;


        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        public void displayWelcomeNote() {
            System.out.print("""
            Semicolon
            E-commerce Stores
            """);
            System.out.print("""
            ***\n
            """);
            System.out.println();
        }

        public void displaceDetails() {
            System.out.println("What is Customers name?");
            customerName = scanner.next();

            System.out.println("What did the customer buy?");
            items.add(scanner.next());

            System.out.println("How many pieces?");
            quantity.add(scanner.nextInt());

            System.out.println("How much per unit?");
            price.add(scanner.nextDouble());

            System.out.println("Add more items? (Y/N)");
            more = scanner.next();

            while
            (more.equalsIgnoreCase("Y")) {
                secondDisplay();
                if
                (more.equalsIgnoreCase("N"))
                    informationFromCashier();
            }
        }

        public void secondDisplay() {
            System.out.println("What did the customer buy?");
            items.add(scanner.next());

            System.out.println("How many pieces?");
            quantity.add(scanner.nextInt());

            System.out.println("How much per unit?");
            price.add(scanner.nextDouble());

            System.out.println("Add more items? (Y/N)");
            more = scanner.next();
        }

        public void informationFromCashier() {
            System.out.println("What is cashiers first name?");
            customerName = scanner.next();

            System.out.println("How much discount will customer get?");
            discount = scanner.nextDouble();
        }

        public void displayInvoice() {
            System.out.println();
            System.out.println("Preparing invoice.......");
            System.out.println();
            System.out.println("SEMICOLON STORES");
            System.out.println("MAIN BRANCH");
            System.out.println("""
             LOCATION:
             321 HERBERT MACAURLAY WAY,
             SABO-YABA,
             LAGOS,
             NIGERIA.
            """);
            System.out.println("TEL: 08234598763");
            System.out.println("Date: " + date + "" + time);
            System.out.println("Cashier" + CashierName);
            System.out.println("Customer`s Name" + customerName);

            System.out.println("==============");
            System.out.printf("%20s%15s%15s%20s%n", "ITEMS", "QUANTITY", "PRICE", "TOTAL(NGN)");
            System.out.println("----------------");

            for (int element = 0; element < items.size(); element++) {
                total.add(quantity.get(element) * price.get(element));
                subTotal = total.get(element);
                System.out.printf("%20s%15s%15s%20s%n", items.get(element), quantity.get(element), price.get(element), total.get(element));
            }

            System.out.println();
            System.out.println("Sub Total: " + subTotal);
            System.out.println("Discount: " + discount);
            System.out.println("VAT@ 17.50%:" + getVat());

            System.out.println("------");
            System.out.println("Bill Total()");
            System.out.println("Amount Paid:" + amountPaid);
            String balance = null;
            System.out.println("Balance:" + null);

            System.out.println();
            System.out.println("THANK YOU FOR YOUR PATRONAGE!");
            System.out.println();
        }

        public double getDiscount() {
            return discount / 100 * subTotal;
        }

        private double getVat() {
            double vat = 17.50;
            return (vat / 100) * subTotal;
        }

        private double billTotal() {
            return subTotal + (getVat() - getDiscount());
        }

        private double balance() {
            return amountPaid - billTotal();
        }
}