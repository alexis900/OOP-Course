package Java;
import Java.AccountType.Driver;
import Java.Car.Car;
import Java.Car.CarType.UberX;

class Main {
    public static void main(String[] args){
        UberX car = new UberX("ABC1234", new Driver("Andrés Herrera", "AND123", "driver1@uber.net", "12345", true), "Opel", "Corsa");
        car.setPassager(4);
        car.printDataCar();

        UberX car = new UberX("ABC1234", new Driver("Andrés Herrera", "AND123", "driver1@uber.net", "12345", true), "Opel", "Corsa");
        car.setPassager(4);
        car.printDataCar();
    }
    
}