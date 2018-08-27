package com.coolweather.android.gson;

/**
 * Created by andy on 2018/8/24.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
