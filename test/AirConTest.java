import chapterTwo.AirCon;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class  AirConTest{

    @Test
   void acCanBeCreatedTest(){
        AirCon airCon = new AirCon();
        assertNotNull(airCon);
    }
    @Test
    void acIsTurnedOffByDefaultTest(){
        AirCon airCon = new AirCon();
        assertTrue(airCon.isOff());
    }
    @Test
    void acCanBeTurnedOn(){
        AirCon airCon = new AirCon();
        airCon.isOff();
        airCon.isOff();
        assertEquals(true, airCon.isOff());
    }
    @Test
    void acCanIncreaseTemperature() {
        AirCon airCon = new AirCon();
        airCon.isOff();
        airCon.isOff();

        int increase = airCon.increaseTemperature();
        assertEquals(17, increase);
    }
    @Test
    void acCanDecreaseTemperature(){
        AirCon airCon = new AirCon();
        airCon.isOff();
        airCon.isOff();

        airCon.increaseTemperature();
        int result = airCon.decreaseTemperature();
        assertEquals(16, result);
    }
    @Test
    void acTemperatureIs30(){
        AirCon airCon = new AirCon();
        airCon.isOff();
        airCon.isOff();

        airCon.increaseTemperature();
        int result = airCon.increaseTemperature();
        assertEquals(30,);
    }
    @Test
    void acTemperatureIs16(){
        AirCon airCon = new AirCon();
        airCon.isOff();
        airCon.isOff();

        airCon.decreaseTemperature();
        int result = airCon.decreaseTemperature();
        assertEquals(16, );
    }
}
