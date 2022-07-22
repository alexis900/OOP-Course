import Account from './Account.js';
import UberX from './uberX.js'


let car = new UberX("OTP-123", new Account("Juan", "123.456.789-0"), 'Opel', 'Corsa');
car.passagers = 4;
car.printDataCar();