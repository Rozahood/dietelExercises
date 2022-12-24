package chapterThree.Car;

public class CarsApplication {

    public static void main(String[] args) {
        CarClass car1 = new CarClass("Land Rovers", "2022", 38.87);
        double discount1  = car1.getFinalPrice(5);
        System.out.println("You demanded " + car1.getModel());
        System.out.println("Your demanded was made " + car1.getYear());
        System.out.println("The purchased cost " + car1.getPrice());
        System.out.println(discount1);

        CarClass car2 = new CarClass("Golf", "2022", 60.76);
        double discount2 = car2.getFinalPrice(7);
        System.out.println("You demanded " + car2.getModel());
        System.out.println("Your demanded was made " + car2.getYear());
        System.out.println("The purchased cost " + car2.getPrice());
        System.out.println(discount2);



    }
}
