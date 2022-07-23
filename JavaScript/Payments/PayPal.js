import Payment from '../Payment.js'

class PayPal extends Payment {
    constructor(id, email){
        super(id)
        this.email = email
    }
}

export default PayPal