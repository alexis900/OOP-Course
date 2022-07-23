package Java.Car.CarType;
//import java.util.ArrayList;
//import java.util.Map;
import Java.AccountType.Driver;
import Java.Car.CarAdvanced;

public class UberVan extends CarAdvanced{
    private Integer passager;
    public UberVan(String license, Driver driver
    //, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial
    ){
        super(license, driver
        //,typeCarAccepted, seatsMaterial
        );
    }

    @Override
    public void setPassager(Integer passager){
        if (passager == 6) {
            this.passager = passager;
        } else {
            System.out.println("Número de pasageros insuficientes. El número mínimo es de 6.");
        }
    }
}
