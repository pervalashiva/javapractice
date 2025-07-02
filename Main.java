package utils;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();         // Create a car object
        myCar.color = "Red";           // Set its color
        myCar.speed = 100;             // Set its speed
        myCar.drive();                 // Use the drive() method

        Car yourCar = new Car();       // Create another car
        yourCar.color = "Blue";
        yourCar.speed = 120;
        yourCar.drive();               // Drive your car
    }
}
