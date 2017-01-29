public class DecreasingCounter {
    private int value;
    private int Inval;// instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.Inval = valueAtStart; 
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        while (this.value >= 0) {
            System.out.println("value: " + this.value--);
            break;// write here code to decrease counter value by one
    }
    }

    public void reset() {
        this.value = 0;
        System.out.println("value: " + this.value);
    }
    public void setInitial() {
        System.out.println("value: " + this.Inval);
    }// and here the rest of the methods
}
