package Part3;
import java.util.HashMap;
import java.util.Map;

public class WeatherSource1 implements WeatherSource {
    @Override
    public Map<String, Object> getData(String city) {
        Map<String, Object> data = new HashMap<>();
        data.put("temperature", 25);
        data.put("humidity", 60);
        return data;
    }
}



