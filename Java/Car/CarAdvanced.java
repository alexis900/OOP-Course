package Java.Car;

import java.util.ArrayList;
import java.util.Map;

import Java.AccountType.Driver;

public class CarAdvanced extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public CarAdvanced(String license, Driver driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public CarAdvanced(String license, Driver driver) {
        super(license, driver);
    }

}
