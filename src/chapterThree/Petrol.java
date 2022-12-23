package chapterThree;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Yaba", "Kerosene",
        10,10, 10);

        System.out.println("Welcome to " + petrolPurchase.getStationLocation());
        System.out.println("You demanded " + petrolPurchase.getTypeOfPetrol());
        System.out.println("The quantity purchased is " + petrolPurchase.getQuantityOfPurchaseInLiters());
        System.out.println("Each liter cost " + petrolPurchase.getPricePerLiter());
        System.out.println("We give you discount of " + petrolPurchase.getPercentageDiscount());


        System.out.println("Our purchase Amount is " + petrolPurchase.getPurchaseAmount());


    }
}
