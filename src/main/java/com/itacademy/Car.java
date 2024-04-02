package com.itacademy;

import com.itacademy.components.Battery;
import com.itacademy.components.Engine;
import com.itacademy.components.Radiator;

public class Car extends Transport {
    private Battery battery;
    private Engine engine;
    private Radiator radiator;

    public Car(Battery battery, Engine engine, Radiator radiator) {
        this.battery = battery;
        this.engine = engine;
        this.radiator = radiator;
    }

    public Car() {
    }

    public Car(String model, int height, int weight, int maxSpeed) {
        super(model, height, weight, maxSpeed);
    }

    public Car(String model) {
        super(model);
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Radiator getRadiator() {
        return radiator;
    }

    public void setRadiator(Radiator radiator) {
        this.radiator = radiator;
    }

    @Override
    public String getInformation() {
        return getModel() + " " + getMaxSpeed() + "km/h";
    }

    @Override
    public String getAvailableColors() {
        return "multicolor";
    }
}
