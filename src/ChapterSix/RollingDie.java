package ChapterSix;

import java.security.SecureRandom;

public class RollingDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        //Note that in a die, we have 6 faces
        //This is the count of each role from one to six
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;
        //Tally count for 600 roles
        for (int counter = 1; counter <= 600; counter++) ;
        int face = 1 + randomNumbers.nextInt(6); // number from 1 to 6

        // use face value 1-6 to determine which counter to increment
        switch (face) {
            case 1:
                ++frequency1; // increment the 1s counter
                break;
            case 2:
                ++frequency2; // increment the 2s counter
                break;
            case 3:
                ++frequency3; // increment the 3s counter
                break;
            case 4:
                ++frequency4; // increment the 4s counter
                break;
            case 5:
                ++frequency5; // increment the 5s counter
                break;
            case 6:
                ++frequency6; // increment the 6s counter
                break;
        }
    }

 System.out.println("Face\tFrequency"); // output headers
 System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);
}
}
