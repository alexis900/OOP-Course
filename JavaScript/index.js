import Driver from './AccountType/Driver.js'
import UberX from './Car/CarType/uberX.js'

const driver = new Driver("Juan", "123.456.789-0", "driver1@uber.net", true)
const car = new UberX("OTP-123", driver, 'Opel', 'Corsa');

car.passagers = 4;
car.printDataCar();
driver.printDataAccount()