public class HybridV extends Vehicle {

  HybridV(Engine engine, Manufacture manufacture, String model, double price, int yearOfManufacture) {
    super(engine, manufacture, model, price, yearOfManufacture);
  }

  @Override
  public String showCharactaristics() {
    return "Manufacture: " + manufacture.get_name() + " Model: " + model + " Engine: " + engine + " Price: " + price
        + " Year of Manufacture: " + yearOfManufacture;
  }

}
