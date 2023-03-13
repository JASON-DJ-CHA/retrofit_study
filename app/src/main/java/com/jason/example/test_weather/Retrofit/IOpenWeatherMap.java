package com.jason.example.test_weather.Retrofit;

import io.reactivex.Observable;

import com.jason.example.test_weather.Model.WeatherResult;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatlng(@Query("lat") String lat,
                                                 @Query("lng") String lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);
}
