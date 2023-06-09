package sa.edu.kau.fcit.cpit252.weather;

import sa.edu.kau.fcit.cpit252.geoLocation.GeoLocationService;
import sa.edu.kau.fcit.cpit252.geoLocation.Location;


/* This is the adapter class, WeatherAdapter, which takes a geographic coordinates of a city and returns the daily weather forecasts.
 * The adapter is a class used as an intermediary between the client and the adaptee.
 *
 */
public class WeatherAdapter implements WeatherCity{
 private WeatherGeo WeatherGeo;
 private GeoLocationService GeoLocationService;
 
 public WeatherAdapter(WeatherGeo WeatherGeo){
     this.WeatherGeo=WeatherGeo;
     GeoLocationService=new GeoLocationService();
 }

    @Override
    public WeatherInfo getWeatherInfo(String CityName) {
      Location geoLocation=this.GeoLocationService.search(CityName);
      WeatherInfo weatherInfo=this.WeatherGeo.getWeatherInfo(geoLocation.getLatitude(), geoLocation.getLongitude());
      weatherInfo.setCity(CityName);
      return weatherInfo;
    }
 
 
 
}
