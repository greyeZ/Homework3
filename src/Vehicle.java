public abstract class Vehicle {
  Engine engine;
  Manufacture manufacture;
  String model;
  double price;
  int yearOfManufacture;

  Vehicle(Engine engine, Manufacture manufacture, String model, double price, int yearOfManufacture) {
    this.engine = engine;
    this.manufacture = manufacture;
    this.model = model;
    this.price = price;
    this.yearOfManufacture = yearOfManufacture;
  }

  public abstract String showCharactaristics();
}
