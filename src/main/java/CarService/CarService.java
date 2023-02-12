package CarService;

import CarServiceImplementation.CarServiceImpl;
import Deposit.Deposit;
import Model.Car;

import java.util.List;
import java.util.Scanner;

public class CarService implements CarServiceImpl {
    private List<Car> cars;
    private List<Car> rentedCars;

    public CarService() {
        super();
        this.cars = Deposit.getCars();
        this.rentedCars = Deposit.rentedCars();
    }

    @Override
    public void getCars() {
        System.out.println(this.cars);

    }

    @Override
    public void getRentedCars() {
        System.out.println(this.rentedCars);
    }

    @Override
    public List<Car> addCarToDeposit() {
        System.out.println("Add a car into deposit.");
        Car car = new Car();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the id: ");
        car.setId(sc.nextInt());

        System.out.println("Enter the producer: ");
        car.setProducer(sc.next());

        System.out.println("Enter the model: ");
        car.setModel(sc.next());

        System.out.println("Enter the price: ");
        car.setPrice(sc.nextDouble());

        System.out.println("Addition Successfully !");


        this.cars.add(car);
        return this.cars;
    }


    @Override
    public void rentCar(int id) {
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days you want to rent the car?");
        System.out.println("========================================");
        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();
        if (days <= 0) {
            System.out.println("The minimum number of days is 1, Try again!");
        } else {
            Car priceCalculator = findCarById(id);
            price = priceCalculator.getPrice() * days;
            System.out.println("The price for " + days + " days is: $" + price);

            System.out.println("=========================================");
            System.out.println("You are sure you want this car?");
            System.out.println("1.Yes " + "\n" + "2.No ");
            int choice = sc.nextInt();
            if (choice == 1) {
                Car carToRent = findCarById(id);
                this.cars.remove(carToRent);
                this.rentedCars.add(carToRent);
                System.out.println("Your rented a car ");
            } else if (choice == 2) {
                System.out.println("You refused the rental.");
            } else {
                System.out.println("Not a valid option.");
            }
        }
    }

    @Override
    public void returnRentedCar(int id) {
        Car carToReturn = findCarToReturnById(id);
        this.rentedCars.remove(carToReturn);
        this.cars.add(carToReturn);
    }

    private Car findCarById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return new Car();
    }

    private Car findCarToReturnById(int id) {
        for (Car car : rentedCars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return new Car();
    }


    public void depositMenu() {
        System.out.println("1.Show available cars.");
        System.out.println("2.Show rented cars.");
        System.out.println("3.Add a car to deposit.");
        System.out.println("4.Rent a car.");
        System.out.println("5.Return a car.");
        System.out.println("6.Exit");

    }
}
