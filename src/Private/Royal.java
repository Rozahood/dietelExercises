package Private;

import java.util.Scanner;

import static java.lang.Math.tan;

public class Royal {
    public static void main(String[] args) {
        Scanner royal = new Scanner(System.in);

        System.out.println("Hello Nuisance, input the length of sides : ");
        int lengthOfSides = royal.nextInt();
        double pie = 3.147;
        double area = (6 * lengthOfSides * lengthOfSides) / (4 * tan(pie / 6));

        System.out.println(area);
    }
}


