package Java;
import java.util.ArrayList;
import java.util.Map;

import Java.Car.CarAdvanced;

public class UberBlack extends CarAdvanced{
    public UberBlack(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver, typeCarAccepted, seatsMaterial);
    }
}
