package ru.roman;

import java.util.ArrayList;
import java.util.List;

public enum States {
    None("",List.of(Cities.None)),
    NCR("//*[@id=\"react-select-3-option-0\"]",List.of(Cities.Dehli,Cities.Gurgaon,Cities.Noida)),
    UTTARPRADESH("//*[@id=\"react-select-3-option-1\"]",List.of(Cities.Lucknow,Cities.Merrut,Cities.Agra)),
    HARYANA("//*[@id=\"react-select-3-option-2\"]",new ArrayList<>()),
    RAJASTHAN("//*[@id=\"react-select-3-option-3\"]",new ArrayList<>());


    String selector;
    List<Cities> cities = new ArrayList<>();
    States(String selector,  List<Cities> cities ){
        this.cities = cities;
        this.selector = selector;
    }

    public List<Cities> getCities() {
        return cities;
    }

    public Cities isCityInState(Cities city){
        if(cities.contains(city)) return city;
        else return Cities.None;
    }


    public String getSelector() {
        return selector;
    }
}
