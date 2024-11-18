import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;


public class OpenWeatherService implements WeatherService {
    private static final String API_KEY = "ded1cb72556aa5f48fae0796135ff11c";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    @Override
    public WeatherData getWeatherByIP(String ip) throws IOException {
        
        return null;
    }

     
}

