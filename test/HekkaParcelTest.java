import chapterFour.HekkaParcel;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class HekkaParcelTest {
    @Test
    public void HekkaParcelCanBeCreatedTest(){
        HekkaParcel rider = new HekkaParcel();
        assertNotNull(rider);
    }
    @Test
    public void lessThanFiftyParcelsDeliveredTest(){
        HekkaParcel rider = new HekkaParcel();
        rider.setDailyBonus(    49, 100);
        assertEquals(0, rider.getDailyBonus());
    }
    @Test
    public void fiftyParcelsDeliveredTest(){
        HekkaParcel rider = new HekkaParcel();
        rider.setDailyBonus(    50, 100);
        assertEquals(10000, rider.getDailyBonus());
        assertEquals(70000, rider.getWeeklyBonus());
    }
    @Test
    public void sixtyParcelDeliveredTest(){
        HekkaParcel rider = new HekkaParcel();
        rider.setDailyBonus(60,100);
        assertEquals(15000,rider.getDailyBonus());
        assertEquals(105000, rider.getWeeklyBonus());
    }
     @Test
    public void seventyParcelDeliveredTest(){
        HekkaParcel rider = new HekkaParcel();
        rider.setDailyBonus(94,100);
        assertEquals(47000,rider.getDailyBonus());
     }
}
