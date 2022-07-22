from datetime import date, datetime
from payment import payment

class card(payment):
    number  = int
    cvv     = int
    date    = str

    def __init__(self, id, number, cvv, date):
        super().__init__(id)
        self.number = number
        self.cvv    = cvv
        self.date   = date