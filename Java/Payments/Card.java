package Java.Payments;

import java.util.Date;
import Java.Payment;

public class Card extends Payment {
    
    Integer number;
    Integer cvv;
    Date date;

    public Card(Integer id, Integer number, Integer cvv, Date date){
        super(id);
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}
