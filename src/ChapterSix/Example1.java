package ChapterSix;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Example1 {
    private static String number;

    public static void main(String[] args) {
        privateNumberAsInteger(5);
        privateNumberAsInteger(7.2);
        privateNumberAsInteger("50");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
    }

    public static void privateNumberAsInteger(int number) {
        System.out.println(number);
    }

    public static void privateNumberAsInteger(double number) {
         String[] s= String .valueOf(number).split("//.");
        System.out.println(Integer.parseInt(s[0]));
    }

    public static void privateNumberAsInteger(String number) {
        System.out.println(Integer.parseInt(number));
    }
}
