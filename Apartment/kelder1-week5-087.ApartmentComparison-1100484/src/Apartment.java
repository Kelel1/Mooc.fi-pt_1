
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;            
        }
    public int priceDifference(Apartment otherApartment) {
        int price = (this.squareMeters*this.pricePerSquareMeter) -(otherApartment.squareMeters*otherApartment.pricePerSquareMeter);
        if (price > 0) {
            return price;
        } else {
            return price*-1;
        }
        
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int value1 = this.squareMeters*this.pricePerSquareMeter;
        int value2 = otherApartment.squareMeters*otherApartment.pricePerSquareMeter;
        if (value1 > value2) {
            return true;            
        } else {
            return false;
        }
               
        
    }
    
}
