from tokenize import String
from payment import payment

class paypal(payment):
    email = str

    def __init__(self, id, email):
        super().__init__(id)
        self.email = email