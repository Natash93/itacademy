package com.itacademy;

public abstract class Transport {
    private String model;
    private int height;
    private int weight;
    private int maxSpeed;

    public Transport() {
    }
    
    public Transport(String model, int height, int weight, int maxSpeed) {
        this.model = model;
        this.height = height;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public Transport(String model) {
        this.model = model;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract String getInformation();

    public String getAvailableColors() {
        return  "any";
    }
}

