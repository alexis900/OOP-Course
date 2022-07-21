from car.car import Car

def run():
    car = Car()
    car.license = 'ABC123'
    car.driver = 'Andrés Herrera'
    print(vars(car))

    car2 = Car()
    car2.license = 'ANS1246'
    car2.driver = 'Andrea Herrera'
    print(vars(car2))

if __name__ == '__main__':
    run()