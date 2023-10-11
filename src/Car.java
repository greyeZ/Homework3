/*This class is left from Homework 2 but not used anymore, could be deleted */

public class Car {
  int id;
  String make;
  String model;
  int yearOfManufacture;
  String color;
  double price;
  int registrationNumber;

  Car(int id, String make, String model, int yearOfManufacture, String color, double price, int registrationNumber) {
    this.id = id;
    this.make = make;
    this.model = model;
    this.yearOfManufacture = yearOfManufacture;
    this.color = color;
    this.price = price;
    this.registrationNumber = registrationNumber;
  }

  public void brum() {
    System.out.println("brum brum");
  }

  public String description() {
    return " Id: " + id + " make: " + make + " model: " + model + " Year of Manufacture: " + yearOfManufacture
        + " color: " + color + " price: " + price + " registration number: " + registrationNumber;
  }
}
