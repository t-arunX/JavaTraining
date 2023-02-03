package java_basics.day6;

abstract class Human {
    protected String name;

    public abstract void print();
}

class Person extends Human {
    public Person(String name, int number) {
        this.name = name;
    }

    @Override
    public void print() {
        // System.out.println("name: " + name);
        // System.out.println("number: " + number);
        pvt();
    }

    private static void pvt() {
        System.out.println("This is private method");
    }
}

public class Test {

    public static void main(String[] args) {
        // Human h1 = new Human();
        // Person p1 = new Person("sai",9982734);
        // p1.print();

        // Human h1 = new Person("sai", 998123); // upcasting
        // h1.print();
        // System.out.println(h1.number);

        // Person p1 = (Person)h1; // downcasting
        // p1.pvt();

        Person p2 = new Person("sai", 998123);
        p2.print();
    }
}
