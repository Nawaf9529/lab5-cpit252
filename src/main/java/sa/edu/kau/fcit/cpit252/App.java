package sa.edu.kau.fcit.cpit252;

import sa.edu.kau.fcit.cpit252.apis.OpenMeteoWeather;
import sa.edu.kau.fcit.cpit252.geoLocation.GeoLocationService;
import sa.edu.kau.fcit.cpit252.geoLocation.Location;
import sa.edu.kau.fcit.cpit252.weather.WeatherAdapter;
import sa.edu.kau.fcit.cpit252.weather.WeatherCity;
import sa.edu.kau.fcit.cpit252.weather.WeatherGeo;
import sa.edu.kau.fcit.cpit252.weather.WeatherInfo;

public class App {

    public static void main(String[] args) {
        // Get the weather for Jeddah (21.543333, 39.172778)
        WeatherGeo WeatherGeo = new OpenMeteoWeather();
        WeatherCity weatherCity = new WeatherAdapter(WeatherGeo);
        WeatherInfo weatherInfo = weatherCity.getWeatherInfo("Jeddah");
        System.out.println(weatherInfo);
        /* OpenMeteoWeather openMeteoWeather = new OpenMeteoWeather();
        GeoLocationService geoLocationService = new GeoLocationService();
        Location location = geoLocationService.search("Jeddah");
        WeatherInfo weatherInfo = openMeteoWeather.getWeatherInfo(location.getLatitude(),
                location.getLongitude());
        System.out.println(weatherInfo);
         */

    }
}
