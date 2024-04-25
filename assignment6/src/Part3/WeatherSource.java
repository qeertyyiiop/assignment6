package Part3;

import java.util.Map;

public interface WeatherSource {
    public Map<String, Object> getData(String city);
}

