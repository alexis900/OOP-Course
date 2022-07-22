package Java;
import Java.Car.Car;
import Java.Car.*;
import Java.Car.CarType.UberPool;
import Java.Car.CarType.UberX;

class Main {
    public static void main(String[] args){
        Car car = new UberX("ABC1234", new Account("Andrés Herrera", "AND123"), "Opel", "Corsa");
        car.passagers = 4;

        car.printDataCar();

        Car car2 = new UberPool("ACV1245", new Account("Andrea Herrera", "AND134"), "Citröen", "C4");
        car2.passagers = 3;
        car2.printDataCar();
    } 
}