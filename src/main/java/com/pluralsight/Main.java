package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Moped
        Moped slowRide = new Moped("Red", 1, 0, 5);
        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Moped passengers: " + slowRide.getNumberOfPassangers());
        System.out.println("Moped cargo capacity: " + slowRide.getCargoCapacity());
        System.out.println("Moped Fuel capacity: " + slowRide.getFuelCapacity());

        //Car
        Car fastRide = new Car("Gray", 1, 2, 10);
        System.out.println("Car color: " + fastRide.getColor());
        System.out.println("Car passengers: " + fastRide.getNumberOfPassangers());
        System.out.println("Car cargo capacity: " + fastRide.getCargoCapacity());
        System.out.println("Car Fuel capacity: " + fastRide.getFuelCapacity());

        //Hovercraft
        Hovercraft flyingRide = new Hovercraft("Black", 2, 5, 15);
        System.out.println("Hovercraft color: " + flyingRide.getColor());
        System.out.println("Hovercraft passengers: " + flyingRide.getNumberOfPassangers());
        System.out.println("Hovercraft cargo capacity: " + flyingRide.getCargoCapacity());
        System.out.println("Hovercraft Fuel capacity: " + flyingRide.getFuelCapacity());

        //SemiTruck
        SemiTruck longRide = new SemiTruck("White", 1, 20, 20);
        System.out.println("Semi Truck color: " + longRide.getColor());
        System.out.println("Semi Truck passengers: " + longRide.getNumberOfPassangers());
        System.out.println("Semi Truck cargo capacity: " + longRide.getCargoCapacity());
        System.out.println("Semi Truck fuel capacity: " + longRide.getFuelCapacity());
    }
}
