package CarServiceImplementation;

import Model.Car;

import java.util.List;

public interface CarServiceImpl {

    void getCars();

    List<Car> addCarToDeposit();

    void rentCar(int id);

    void getRentedCars();

    void returnRentedCar(int id);
}
