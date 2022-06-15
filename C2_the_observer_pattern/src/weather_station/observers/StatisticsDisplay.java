package weather_station.observers;

import weather_station.interfaces.DisplayElement;
import weather_station.interfaces.Observer;
import weather_station.subjects.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float avgTemperature;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (temp > maxTemperature) {
            this.maxTemperature = temp;
        }
        if (temp < minTemperature){
            this.minTemperature = temp;
        }
        avgTemperature = (minTemperature + maxTemperature) / 2f;
        display();
    }
}
