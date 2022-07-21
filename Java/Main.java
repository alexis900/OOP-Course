package Java;
import Java.Car.*;

class Main {
    public static void main(String[] args){
        System.out.println("Hola mundo");
        Car car = new Car();
        car.license = "ABC1234";
        car.driver = "Andrés Herrera";
        car.passagers = 4;

        car.printDataCar();

        Car car2 = new Car();
        car2.license = "ACV1245";
        car2.driver = "Andrea Herrera";
        car2.passagers = 3;

        car2.printDataCar();
    } 
}