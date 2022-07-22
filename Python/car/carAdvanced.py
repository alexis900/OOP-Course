from car import car

class carAdvanced(car):
    typeCarAccepted = []
    seatsMaterial   = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super.__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial
