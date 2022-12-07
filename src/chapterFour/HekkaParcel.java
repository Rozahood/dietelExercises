package chapterFour;

public class HekkaParcel {
    private int dailyBonus;
    private int weeklyBonus;

    public void setDailyBonus(int parcelsDelivered, int totalParcels) {
        int collectionRate = (parcelsDelivered * 100)/totalParcels;
        if(collectionRate<50){
            dailyBonus = 0;
        }else if (collectionRate < 60){
            dailyBonus = parcelsDelivered * 200;
        }else if(collectionRate <69){
            dailyBonus = parcelsDelivered * 250;
        }else if(collectionRate <= 100){
            dailyBonus = parcelsDelivered * 500;
        }else System.out.println("Out of range");
    }

    public int getDailyBonus() {
        return dailyBonus;
    }

    public int getWeeklyBonus() {
        return dailyBonus * 7;
    }
}
