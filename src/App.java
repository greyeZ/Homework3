import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.lang3.ArrayUtils;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle[] bev_cars = { new BEV(new ElectricEngine(), new Manufacture("Audi"), "A3", 21000, 2013),
                new BEV(new ElectricEngine(), new Manufacture("BMW"), "X7", 40000, 2015),
                new BEV(new ElectricEngine(), new Manufacture("Volkswagen"), "Polo", 27000, 2012) };
        Vehicle[] hybrid_cars = { new HybridV(new HybridEngine(), new Manufacture("BMW"), "M4", 60000, 2018),
                new HybridV(new HybridEngine(), new Manufacture("Audi"), "RS7", 80000, 2013),
                new HybridV(new HybridEngine(), new Manufacture("Seat"), "Ibiza", 18000, 2009) };
        Vehicle[] icev_cars = { new ICEV(new CombustionEngine(), new Manufacture("Volkswagen"), "Golf", 30000, 2015),
                new ICEV(new CombustionEngine(), new Manufacture("BMW"), "M4", 35000, 2014),
                new ICEV(new CombustionEngine(), new Manufacture("Volvo"), "80", 27000, 2013) };

        Vehicle[] cars = ArrayUtils.addAll(ArrayUtils.addAll(bev_cars, hybrid_cars), icev_cars);

        writeFileGivenBrand("Volkswagen", cars);
        writeFileGivenModel("M4", 3, cars);
        writeFileGivenPrice(20000, 2013, cars);

    }

    static void writeFileGivenBrand(String brand, Vehicle[] cars) {
        String temp = "";
        for (int i = 0; i < cars.length; i += 1) {
            if (cars[i].manufacture.get_name() == brand) {
                temp += cars[i].showCharactaristics() + "\n";
            }
        }
        writeToFile("Brand", temp);
    }

    static void writeFileGivenModel(String model, int yearsInUse, Vehicle[] cars) {
        String temp = "";
        for (int i = 0; i < cars.length; i += 1) {
            if (cars[i].model == model && cars[i].yearOfManufacture + yearsInUse < 2023) {
                temp += cars[i].showCharactaristics() + "\n";
            }
        }
        writeToFile("Model_YearsInUse", temp);
    }

    static void writeFileGivenPrice(double price, int yearOfManufacture, Vehicle[] cars) {
        String temp = "";
        for (int i = 0; i < cars.length; i += 1) {
            if (cars[i].price > price && cars[i].yearOfManufacture == yearOfManufacture) {
                temp += cars[i].showCharactaristics() + "\n";
            }
        }
        writeToFile("Price_YearOfManufacture", temp);
    }

    static void writeToFile(String fileName, String text) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
