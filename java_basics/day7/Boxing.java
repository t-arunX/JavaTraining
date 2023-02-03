package java_basics.day7;

class Person extends Object {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age;
        } else
            return false;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.age;
    }

}

public class Boxing {

    public static void main(String[] args) {
        Person p1 = new Person("peter", 23);
        Person p2 = new Person("peter", 23);
        System.out.println(p1.equals(p2));
        System.out.println(p1.toString());
        System.out.println(p1.hashCode());

    }
}
