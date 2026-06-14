package ru.roman.selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.*;

public class Weather {

    @BeforeEach
    public void setup(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "920x920";
        Configuration.timeout = 5000;
    }

    @Test
    public void getWeather(){
        open("https://world-weather.ru/pogoda/russia/saint_petersburg/14days/#2026-06-07");



        for (int i = 7; i < 7 + 14 ; i++) {
            String date = String.format("2026-06-%02d", i);
            System.out.println(getDayAndNightDataByDate(date));
        }



    }


    ArrayList<String> getDayAndNightDataByDate(String date){
        String dayLocator = "//*[@id='" + date + "']/table/tbody";

        String nightTimeLocator = dayLocator + "/tr[1]";
        String dayTimeLocator = dayLocator + "/tr[2]";

        ArrayList<String> nightWeather = getData(nightTimeLocator);
        ArrayList<String> dayWeather = getData(dayTimeLocator);

        nightWeather.addAll(dayWeather);
        return nightWeather;
    }

    ArrayList<String> getData(String dayOrNightTimeData){
        String temp = $x(dayOrNightTimeData + "/td[2]/span").getText();
        String rain = $x(dayOrNightTimeData + " /td[2]/div").getAttribute("title");
        String tempFeeling = $x(dayOrNightTimeData + "/td[3]").getText();
        String probability = $x(dayOrNightTimeData + "/td[4]").getText();
        String pressure = $x(dayOrNightTimeData + "/td[5]").getText();
        String wind_direction = $x(dayOrNightTimeData + "/td[6]/span[1]").getAttribute("title");
        String wind_force = $x(dayOrNightTimeData + "/td[6]/span[2]").getAttribute("title");
        String humidity = $x(dayOrNightTimeData + "/td[7]").getText();
        ArrayList<String> data = new ArrayList<>();


        if(pressure.isEmpty()) pressure = "unknown";
        if(humidity.isEmpty()) humidity = "unknown";

        data.add(temp);
        data.add(rain);
        data.add(tempFeeling);
        data.add(probability);
        data.add(pressure);
        data.add(wind_force);
        data.add(wind_direction);
        data.add(humidity);
        //*[@id="2026-06-18"]/table/tbody/tr[1]/td[3]
        return data;
    }
}