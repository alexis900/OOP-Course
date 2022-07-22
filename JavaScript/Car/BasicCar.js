import Car from './Car.js';

class BasicCar extends Car{
    constructor(license, driver, brand, model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}

export default BasicCar;