from account import Account
from car.car import Car
from payments.cash import cash
from payments.paypal import paypal

def run():
    car = Car('ABC123', Account('Andrés Herrera', '1234A'))
    print(vars(car))
    print(vars(car.driver))

    met = paypal(1, 'email@email.com')
    print(vars(met))

if __name__ == '__main__':
    run()