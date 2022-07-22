import Account from './Account.js';
import Car from './Car/Car.js';


let car = new Car("OTP-123", new Account("Juan", "123.456.789-0"));
car.passagers = 4;
car.printDataCar();