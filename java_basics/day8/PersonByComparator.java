package java_basics.day8;

import java.util.Comparator;

public class PersonByComparator {
    private String name;
    private int age;

    public PersonByComparator(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + age + "]";
    }
}

class CompareByAge implements Comparator<PersonByComparator> {
    @Override
    public int compare(PersonByComparator a1, PersonByComparator a2) {
        return a1.getAge() - a2.getAge();
    }

}
