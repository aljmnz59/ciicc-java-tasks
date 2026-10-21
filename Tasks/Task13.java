public class Task13 {
    static void main(String[] args) {
        Car car1 = new Car("Toyata", "Camry", 2022, 4);
        car1.displayDetails();
    }
}

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int numberOfDoors = 0;
    public Car(String make, String model, int year, int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails(){
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}