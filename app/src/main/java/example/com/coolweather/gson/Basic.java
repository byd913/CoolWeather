package example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by didi on 2017/4/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
