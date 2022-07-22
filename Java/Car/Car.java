package Java.Car;

import Java.Account;

public class Car {
    Integer id;
    public String license;
    public Account driver;
    public Integer passagers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public void printDataCar(){
        System.out.println("License: " + license + " Name Driver: " + driver.name);
    }

}
