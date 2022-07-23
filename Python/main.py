from accountype.driver import Driver
from car.car import Car
from payments.paypal import paypal

def run():
    driver1 = Driver('Andrés Herrera', '1234A', 'driver1@uber.net', True)
    car = Car('ABC123', driver1)
    print(vars(car))
    print(vars(driver1))

    met = paypal(1, 'email@email.com')
    print(vars(met))

if __name__ == '__main__':
    run()