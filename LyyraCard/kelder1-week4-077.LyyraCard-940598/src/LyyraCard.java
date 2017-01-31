public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        this.balance += balanceAtStart;
    }
    public String toString() {
        return "The card has " + this.balance + " euros";
        
    }
    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.50;
            
        }
        toString();
    
}
    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance -= 4.00;
            
        }
        toString();
    }
    
    public void loadMoney(double amount) {
        if (amount > 0) {
        this.balance += amount;
        }
        if (this.balance > 150) {
            this.balance = 150;
            
        }
    }
    
    
    
}