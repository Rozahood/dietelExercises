package ChapterSix;

public class RecursionSample {
    private static final int DEFAULT_VALUE =4 ;

    public static void main(String[] args) {
        printRightFacingRightAngledTriangle(5);

    }

    public static void printRightFacingRightAngledTriangle(int number) {
        if (number<1) return;;
        number = number-1;
        printRightFacingRightAngledTriangle(number);
        for(int index = 0; index < number; index ++){
            System.out.print("* ");
        }
        System.out.println();
    }


    public static void printLeftFacingRightAngledTriangle(int number) {
        int spacing = number;
        if(number<1){
            return;
        }
        printLeftFacingRightAngledTriangle(number);
        for (int index = number; index<DEFAULT_VALUE; index++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
