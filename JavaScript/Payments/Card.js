import Payment from '../Payment.js'

class Card extends Payment {
    constructor(id, number, cvv, date){
        super(id)
        this.number = number
        this.cvv = cvv
        this.date = date
    }
}

export default Card