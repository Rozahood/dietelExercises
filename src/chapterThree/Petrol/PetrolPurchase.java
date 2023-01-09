package chapterThree.Petrol;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int quantityOfPurchaseInLiters;
    private double pricePerLiter;
    private double percentageDiscount;


    public  PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityOfPurchaseInLiters, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantityOfPurchaseInLiters = quantityOfPurchaseInLiters;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }
    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public int getQuantityOfPurchaseInLiters() {
        return quantityOfPurchaseInLiters;
    }
    public void setQuantityOfPurchaseInLiters(int quantityOfPurchaseInLiters) {
        this.quantityOfPurchaseInLiters = quantityOfPurchaseInLiters;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }
    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }
    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount(){
        return (quantityOfPurchaseInLiters * pricePerLiter - (100/percentageDiscount));
    }

}