import java.io.IOException;

public interface WeatherService {
    WeatherData getWeatherByIP(String ip) throws IOException;

    WeatherData getWeatherByCity(String city) throws IOException;
}
