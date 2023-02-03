package java_basics.day4;

public class TestCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.increment();
        c1.increment();
        System.out.println(c1.getCounter());
        c1.decrement();
        System.out.println(c1.getCounter());
        c1.reset();
        System.out.println(c1.getCounter());

        // new object c2
        Counter c2 = new Counter(20);
        c2.increment();
        System.out.println(c2.getCounter());
    }
}
