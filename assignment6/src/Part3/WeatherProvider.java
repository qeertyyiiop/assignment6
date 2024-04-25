package Part3;

import java.util.Map;

public interface WeatherProvider {
    public Map<String, Object> getWeatherData(String city);
}
