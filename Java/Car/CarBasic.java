package Java.Car;
import Java.AccountType.Driver;

public class CarBasic extends Car {
    String brand;
    String model;

    public CarBasic(String license, Driver driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}
