package com.itacademy;

public class Bus extends Transport {
    private final String route;

    public Bus(String model, int height, int weight, int maxSpeed, String route) {
        super(model, height, weight, maxSpeed);

        this.route = route;
    }

    public Bus(String model) {
        super(model);

        this.route = "-";
    }

    @Override
    public String getInformation() {
        return "height = " + getHeight() + ", Route: " + route;
    }

    public final String getBusRoute() {
        return route;
    }
}
