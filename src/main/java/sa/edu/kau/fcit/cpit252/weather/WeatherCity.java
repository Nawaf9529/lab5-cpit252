package sa.edu.kau.fcit.cpit252.weather;


public interface WeatherCity {
    // Get weather data by the city name.
    public WeatherInfo getWeatherInfo(String CityName);
}
