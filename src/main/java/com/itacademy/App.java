package com.itacademy;

import com.itacademy.components.Battery;
import com.itacademy.components.Engine;
import com.itacademy.components.Radiator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Car superCar = new Car("Nissan", 180, 2000, 180);
        Bus bus = new Bus("Ikarus", 300, 4500, 100, "#23");
        System.out.println(superCar.getInformation());
        System.out.println(bus.getInformation());

        System.out.println("Bus colors: " + bus.getAvailableColors());
        System.out.println("Car colors: " + superCar.getAvailableColors());

        Printer printer = new Printer();
        printer.printInfo();
        printer.printInfo("");
        printer.printInfo(-1);

        Engine engine = new Engine();
        Radiator radiator = new Radiator();
        Battery battery = new Battery();

        Car myCar = new Car (battery, engine, radiator);
        System.out.println(myCar);
    }
}
