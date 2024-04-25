package Part3;

import java.util.Map;

public class WeatherAdapter implements WeatherProvider {
    private WeatherSource weatherSource;

    public WeatherAdapter(WeatherSource weatherSource) {
        this.weatherSource = weatherSource;
    }

    @Override
    public Map<String, Object> getWeatherData(String city) {
        Map<String, Object> rawWeatherData = weatherSource.getData(city);
        Map<String, Object> formattedWeatherData = formatData(rawWeatherData);
        return formattedWeatherData;
    }

    private Map<String, Object> formatData(Map<String, Object> rawData) {
        // Преобразование данных
        return rawData; // здесь просто возвращаем исходные данные, но обычно здесь будет код преобразования данных
    }
}
