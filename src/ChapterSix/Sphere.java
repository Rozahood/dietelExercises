package ChapterSix;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius from user and volume of sphere?: ");
        double radius = input.nextDouble();

        System.out.printf("volume is %f%n", sphereVolume(radius));
    }

    public static double sphereVolume(double radius){
        double volume = (4.0 / 30) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}