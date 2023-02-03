package java_basics.day4;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int count) {
        this.count = count;
    }

    public void increment() {
        this.count++;
    }

    public void decrement() {
        this.count--;
    }

    public int getCounter() {
        return this.count;
    }

    public void reset() {
        this.count = 0;
    }
}
