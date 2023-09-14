package ru.geekbrains.lesson3;

import java.awt.*;

public class Harvester extends Car implements Refueling, Washing {


    private Refueling refueling;
    private Washing washing;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setWashingStation(Washing washingStation) {
        this.washing = washing;
    }
    /**
     * Помыть автомобиль
     */

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль
     */

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

    @Override
    public void wip(WashType washType) {
        if(washing != null){
            washing.wip(washType);
        }
    }

    @Override
    public void fuel(FuelType fuelType) {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }


//    @Override
//    public void wip(WashType washType) {
//
//    }
}
