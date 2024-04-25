package Part3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WeatherSource weatherSource1 = new WeatherSource1();
        WeatherProvider adapter = new WeatherAdapter(weatherSource1);
        Map<String, Object> data = adapter.getWeatherData("Moscow");
        System.out.println(data);
    }
}

