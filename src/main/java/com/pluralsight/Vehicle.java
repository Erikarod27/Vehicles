package com.pluralsight;

public class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity){
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassengers = numberOfPassangers;
    }
    public int getNumberOfPassangers() {
        return numberOfPassengers;
    }
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public int getFuelCapacity() {
        return fuelCapacity;
    }
}
