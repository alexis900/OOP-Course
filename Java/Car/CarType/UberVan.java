package Java.Car.CarType;
import java.util.ArrayList;
import java.util.Map;
import Java.AccountType.Driver;
import Java.Car.CarAdvanced;

public class UberVan extends CarAdvanced{
    public UberVan(String license, Driver driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver, typeCarAccepted, seatsMaterial);
    }
}
