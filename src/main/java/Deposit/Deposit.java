package Deposit;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

public class Deposit {
    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Audi", "A4", 25));
        cars.add(new Car(2, "Bmw", "320i", 25));
        cars.add(new Car(3, "Mazda", "c3", 25));
        cars.add(new Car(4, "Audi", "A6", 30));
        cars.add(new Car(5, "Mercedes", "e220", 30));
        cars.add(new Car(6, "Volvo", "xc90", 60));
        cars.add(new Car(7, "Kia", "a20", 15));
        cars.add(new Car(8, "Renault", "Talisman", 40));

        return cars;
    }


    public static List<Car> rentedCars() {
        List<Car> rentedCars = new ArrayList<>();
        rentedCars.add(new Car(40, "Bmw", "520", 35));
        return rentedCars;
    }

}
