from account import Account
from car.car import Car

def run():
    car = Car('ABC123', Account('Andrés Herrera', '1234A'))
    print(vars(car))
    print(vars(car.driver))

if __name__ == '__main__':
    run()