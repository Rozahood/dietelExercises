package chapterThree.Car;

public class CarClass {
    private  String model;
    private  String year;
    private  double price;


    public CarClass(String model, String year, double price) {
        this.model = model;
        this.year = year;
        if (price > 0){
        this.price = price;
        }
         }



    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getFinalPrice(double discount){
        return  price - (100/ discount );
    }
}
