package com.jason.example.test_weather.Retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Rtrofit {
    private static Retrofit instance;

    public static Retrofit getInstance() {
        if (instance == null){
            instance = new Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/data/2.5/weather?q=seoul&appid=c222672c03b1611b6eb70c6cee7ee9ea")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return  instance;
    }
}
