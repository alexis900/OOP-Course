from accountype.driver import Driver

class Car:
    id          = int
    license     = str
    driver      = Driver('', '', '')
    passagers   = int

    def __init__(self, license, driver):
        self.license   = license
        self.driver   = driver