package Java.Car;

import Java.AccountType.Driver;;

public class Car {
    Integer id;
    public String license;
    public Driver driver;
    public Integer passagers;

    public Car(String license, Driver driver) {
        this.license = license;
        this.driver = driver;
    }

    public void printDataCar(){
        System.out.println("License: " + license + " Name Driver: " + driver.name);
    }

}
