package Part3;

import java.util.HashMap;
import java.util.Map;

public class WeatherSource2 implements WeatherSource {
    @Override
    public Map<String, Object> getData(String city) {
        Map<String, Object> data = new HashMap<>();
        data.put("temp", 25);
        data.put("hum", 60);
        return data;
    }
}