package chapterThree.Clock;

public class ClockClass {
    private int hour; int minute; int second;

    public ClockClass(int hour, int minute, int second) {   // This constructor exists only to give our objects default values.
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int displayHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static void main(String[] args) {
        ClockClass blueClock = new ClockClass(5,20, 4);
        System.out.println("The hour here is " + blueClock.displayHour() + ":" + blueClock.getMinute() + ":" + blueClock.getSecond());

        ClockClass greenClock = new ClockClass(3,41, 7);
        System.out.print("The hour here is " + greenClock.displayHour() + ":" + greenClock.getMinute() + ":" + greenClock.getSecond());

        greenClock.setHour(27);  greenClock.setMinute(89);   greenClock.setSecond(72);

        System.out.println("\n The hour here is " + greenClock.displayHour() + ":" + greenClock.getMinute() + ":" + greenClock.getSecond());
    }
}