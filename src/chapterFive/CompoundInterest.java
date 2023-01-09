package chapterFive;

public class CompoundInterest {

    public static void main(String[] args) {
        double principal = 1000; // initial amount before interest
        double rate = 5; // interest rate
        double amount;

    for (int year = 1; year <= 10; ++year){

    }
    int year = 10;
        amount = principal * Math.pow(1 + rate, year);
        //Calculate amount on deposit for each ten years
        System.out.println(year + ""+ amount);
    }
}
