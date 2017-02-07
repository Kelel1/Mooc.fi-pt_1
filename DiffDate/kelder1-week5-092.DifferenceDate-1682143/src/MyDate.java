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
    
    
    //######## code for difference in years used from outside source
    public int differenceInYears(MyDate compareDate) {
        
        int differenceInYears = 0;
        if (compareDate.earlier(this)) {
            differenceInYears = this.year - compareDate.year;
            if (compareDate.month > this.month) {
                differenceInYears--;
            }
            if (compareDate.month == this.month && compareDate.day > this.day) {
                differenceInYears--;
            }
            return differenceInYears;
        } else {
            differenceInYears = compareDate.year - this.year;
            if (compareDate.month < this.month) {
                differenceInYears--;
            }
            if (compareDate.month == this.month && compareDate.day < this.day) {
                differenceInYears--;
            }
            return differenceInYears;
        }

    }
}

