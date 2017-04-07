package example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by didi on 2017/4/6.
 */

public class AQI {

    @SerializedName("city")
    public AQICity city;

    public class AQICity {
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
