package Plant;

import Attributes.Breathe;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Plant implements Breathe {



    // if it's night plants uses oxygen otherwise they use carbon dioxide
    @Override
    public void breathe() {
        int time = Integer.parseInt(DateTimeFormatter.ofPattern("HH").format(LocalTime.now()));
        if(time > 20 || time < 6) {
            createCarbonDioxide();
        }else{
            createOxygen();
        }
    }

    public void createOxygen() {
        System.out.println("Now consuming Carbon Dioxide and creating Oxygen");
    }

    public void createCarbonDioxide() {
        System.out.println("Now consuming Oxygen and creating Carbon Dioxide");
    }

}
