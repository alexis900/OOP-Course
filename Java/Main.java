package Java;
import Java.Car.*;

class Main {
    public static void main(String[] args){
        Car car = new Car("ABC1234", new Account("Andrés Herrera", "AND123"));
        car.passagers = 4;

        car.printDataCar();

        Car car2 = new Car("ACV1245", new Account("Andrea Herrera", "AND134"));
        car2.passagers = 3;
        car2.printDataCar();
    } 
}