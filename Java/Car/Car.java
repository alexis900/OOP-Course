package Java.Car;

import Java.AccountType.Driver;;

class Car {
    private Integer id;
    private String license;
    private Driver driver;
    private Integer passagers;

    public Car(String license, Driver driver) {
        this.license = license;
        this.driver = driver;
        
    }

    public void printDataCar(){
        if(passagers != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passagers: " + passagers);
        }
    }

    public Integer getPassager(){
        return passagers;
    }

    public void setPassager(Integer passager){
        if (passager == 4) {
            this.passagers = passager;
        } else {
            System.out.println("Número de pasageros insuficientes. El número mínimo es de 4.");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    

}
