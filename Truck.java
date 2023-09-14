package ru.geekbrains.lesson3;

import java.awt.*;

public class Truck extends Car implements Refueling, Washing{
    public Truck(String make, String model, Color color) {
        super(make, model, color);
    }

    private Refueling refueling;
    private Washing washing;

    public void setWashingStation(Washing washingStation) {
        this.washing = washing;
    }
    /**
     * Помыть автомобиль
     */
    @Override
    public void wip(WashType washType) {
        if(washing != null){
            washing.wip(washType);
        }
    }
    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel(FuelType fuelType) {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }
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



}
