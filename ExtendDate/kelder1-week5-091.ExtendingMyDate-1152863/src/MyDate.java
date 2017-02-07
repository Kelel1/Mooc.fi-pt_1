
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {  // advances the day by one
        if ((day == 30) &&(month==12)) {
            day = 1;
            month = 1;
            year++;
        } else if (day < 30) {
            this.day++;
        } else if(day == 30) {
            this.day = 0;
            this.day++;
            month++;
            
        }
    }
    
    public void advance(int numberOfDays) { // advances day by set number
        int j = numberOfDays;
        while (j > 0) {
            j--;
            advance();
            
        }           
        
    }
    
    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(day,month,year);
        if(day <= 30) {
            newMyDate.advance(days);
        }
        
        return newMyDate;
    }

}