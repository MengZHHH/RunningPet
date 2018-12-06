package com.votors.runningx.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/10/13.
 */

public class WholeWeather {
    public weather weather;
    public main main;
    public com.votors.runningx.gson.wind wind;
    public clouds clouds;
    @SerializedName("name")
    public String name;

    public weather getWeather(){
        return weather;
    }
    public String getName(){
        return name;
    }
    public main getMain(){
        return main;
    }

    public clouds getClouds(){
        return clouds;
    }

    public com.votors.runningx.gson.wind getWind(){
        return wind;
    }


}
