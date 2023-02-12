package Main;

import CarService.CarService;

import java.util.Scanner;

public class App {

    public static CarService carService = new CarService();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean inLoops = true;
        System.out.println("WELCOME TO DEPOSIT");


        while (inLoops) {
            System.out.println("=================");
            carService.depositMenu();
            System.out.println("=================");
            System.out.println("Chose an option.");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    carService.getCars();
                    break;
                case 2:
                    carService.getRentedCars();
                    break;
                case 3:
                    carService.addCarToDeposit();
                    break;
                case 4:
                    System.out.println("==================================");
                    carService.getCars();
                    System.out.println("===================================");
                    System.out.println("Enter the car id you want to rent: ");
                    int id = sc.nextInt();
                    carService.rentCar(id);
                    break;
                case 5:
                    System.out.println("====================================");
                    carService.getRentedCars();
                    System.out.println("=====================================");
                    System.out.println("Enter the id of car you want to return: ");
                    id = sc.nextInt();
                    carService.returnRentedCar(id);
                    break;
                case 6:
                    inLoops = false;
                    break;
                default:
                    System.out.println("Not a valid choice !");

            }

        }


    }
}
