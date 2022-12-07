package chapterTwo;

public class AirCon {
    boolean button = false;
    int temperature;

    public AirCon(){
        temperature = 16;
    }

    public boolean isOff() {
        if(button){
            button = false;
        }
        button = true;
        return button;
    }

    public int increaseTemperature() {
        temperature = temperature + 1;
        return temperature;
    }

    public int decreaseTemperature() {
        temperature = temperature - 1;
        return temperature;
    }
    public int TemperaTureIs30(){
        temperature = temperature;
        return temperature;
    }
    public int TemperatureIs16(){
        temperature = temperature;
        return temperature;
    }
}
