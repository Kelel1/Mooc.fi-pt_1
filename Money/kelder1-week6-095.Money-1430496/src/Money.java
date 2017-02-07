
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    public Money plus(Money added) {
        Money x = new Money(euros, cents);        
        int total_c = x.cents + added.cents;
        int total_e = x.euros + added.euros;
        Money total = new Money(total_e,total_c);
        return total;
    }
    
    public boolean less(Money Compared) {
        Money y = new Money(euros, cents);
            if (y.euros < Compared.euros)  {
                return true;
    } else if((y.euros == Compared.euros) && (y.cents < Compared.cents)){
         return true;
    }            
        return false;   
    }
    
    public Money minus(Money decremented) {
        Money z = new Money(euros, cents);
        int total_c = z.cents - decremented.cents;
        int total_e = z.euros - decremented.euros;        
        if (total_e < 0){           
            Money total2 = new Money(total_e -= total_e, 0);             
            return total2;
           
        } else if (total_c < 0){
            total_c = -1*total_c;
            total_e -= 1;
            
            Money total1 = new Money(total_e , 100 - total_c);             
            return total1;
            
        }           
        
        Money total = new Money(total_e, total_c);
        return total;
        
        
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    

}
