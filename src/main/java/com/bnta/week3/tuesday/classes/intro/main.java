package com.bnta.week3.tuesday.classes.intro;
import com.bnta.week3.tuesday.classes.intro.car.Car;
import com.bnta.week3.tuesday.classes.intro.car.CarDealership;
import com.bnta.week3.tuesday.classes.intro.car.EngineType;

/*  TASK
    1) Create a class to represent a car.
    The car should have properties representing the manufacturer, price, and engine type (eg. petrol, electric, etc).

    2) Write getters for each of these properties. Test them in Main

    3) Write setters for the properties. Test them in Main

    4) Modify the engine type property to use an EngineType enum.
    You'll need to modify the getter and setter to reflect the different data type.

    5) Create a class to represent a car dealership.
    It should have properties representing its name, the maximum number of cars it can have on display and all the cars currently in stock.
    Hint 1: We could create an individual property for each car we have in stock,
    but is there a data type we have already seen which would let us store all our cars together in the same variable?
    How can we figure out how big that data structure should be?
    Hint 2: A brand new dealership won't have any cars yet.
    Do we need to pass that information in the constructor when we create a dealership, or can we define our class in such a way that every new dealership starts with no cars?

    6) Write a method to count the number of cars in the dealership.
    It doesn't need to take any parameters and should return an int.
    Write another method to add a car to the dealership.
    The method should have a Car parameter and doesn't need to return anything.
    Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
    Hint: You will need some way of finding the first empty slot in the array to save the Car in.
    Maybe checking each slot in the array in turn would help?

    7) Write a method for the dealership called findCarByManufacturer which takes a String as a parameter and returns a Car object.
    The method should return the first Car the dealership has in stock with a manufacturer property matching the value passed to the method.
    Hint 1: Think carefully about how you will access the information you need from the Cars.
    Remember the methods you wrote in exercise 2...
    Hint 2: To test this in Main you will need to:
    - create some Car objects - add them to the Dealership - store the result of your findCarByManufacturer method to a variable - print the variable
*/

public class main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 5000, EngineType.PETROL);
        System.out.println(toyota);

        Car tesla = new Car("Tesla", 90000, EngineType.HYBRID);
        Car bmw = new Car("BMW", 40000, EngineType.DIESEL);
        Car mini = new Car("Mini Cooper", 2000, EngineType.PETROL);

        CarDealership carDealership = new CarDealership("Adib's Garage", 5);
        carDealership.addCar(toyota);
        carDealership.addCar(tesla);
        carDealership.addCar(bmw);
        carDealership.addCar(mini);

        int carCount = carDealership.countCars();
        System.out.println("The dealership has " + carCount + " cars");
    }
}