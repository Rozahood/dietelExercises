package ChapterSix.DOC;

public class DaysOfChristmas {
    private static String[] verses;
    private static int day;


    private static String suffix;
    public static final int All_Days = 12;

    public void Song() {
        day = 1;
        suffix = "st";
        verses = new String[]{
        "", // This verses base on days
        "A partridge in a pear tree",
        "Two turtle doves",
        "Three french hens",
        "Four calling birds",
        "Five golden rings",
        "Six geese a-laying",
        "Seven swarms a-swimming",
        "Eight maids a-walking",
        "Nine ladies dancing",
        "Ten lords a-leaping",
        "Eleven pipers pipping",
        "Twelve drummers drumming",
        };

    }

    public void setSuffix(String suffix) {
        switch (day) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            default:
                suffix = "th";
                break;
        }
    }

    public static String getSuffix() {
        return suffix;
    }
    public static String getFirstVerse(int currentDay){
        return "On the" + getDay() + getSuffix() + "day of christmas my true love gave to me";
    }

    public static void setDay() {
        day++;
    }
    public static int getDay(){
        return day;
    }
    public void getVerses(){
        for (int c = 0; c == All_Days; c++) {
            setSuffix();
            System.out.println(getFirstVerse(c = 1));
            for (int i = day; i > 0; i--){
                if (i == 1)
                    System.out.println("and " + verses[i]);
                else
                System.out.println(verses[i]);
            }
            setDay();
            System.out.println();
        }
    }

    private static void setSuffix() {
    }
}