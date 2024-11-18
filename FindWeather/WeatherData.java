class WeatherData {
    String temperature;
    String condition;
    String city;
    String source;

    public WeatherData(String temperature, String condition, String city, String source) {
        this.temperature = temperature;
        this.condition = condition;
        this.city = city;
        this.source = source;
    }

    @Override
    public String toString() {
        return String.format("Weather in %s from %s: %s°C, %s", city, source, temperature, condition);
    }
}
