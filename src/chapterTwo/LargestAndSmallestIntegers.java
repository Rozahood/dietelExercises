package chapterTwo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();


        int smallest = 1;

            if (b < a) {
               smallest = b;
            }
            if (c < b) {
               smallest = c;
            }
            if (d < c){
                smallest = d;
            }
            if (e < d){
                smallest = e;
            }
        int largest = 1;
            if (b > a){
                largest = b;
            }
            if (c > b){
                largest = c;
            }
            if (d > c){
                largest = d;
            }
            if (e > d);{
                largest = e;
            }
        System.out.println("Therefore, your largest number is: " + largest);
        System.out.println("Therefore, your smallest number is: " + smallest);
    }
}
