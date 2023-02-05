package java_basics.day11;

import java.util.Arrays;
import java.util.Comparator;

interface Chasis {
    /*
     * this is a null interface
     */
}

interface Person {
    static int x = 2022;
    int num();
    default void fun(){
        int x = 0;
        return;
    }
    default String mems(){
        return "k";
    }
}

abstract class Persons {
    static int x = 202;
}

class Student extends Persons implements Person, Chasis {
    private int a;

    public Student(int a) {
        this.a = a;
    }

    @Override
    public int num() {
        return a;
    }
}

class Teacher implements Person {
    private int a;

    public Teacher(int a) {
        this.a = a;
    }

    @Override
    public int num() {
        return a;
    }
}

class Compare implements Comparator<Person> {
    Student s;
    Teacher t;

    @Override
    public int compare(Person a1, Person a2) {
        if (a1 instanceof Student) {
            s = (Student) a1;
        } else if (a1 instanceof Teacher) {
            t = (Teacher) a1;
        }
        if (a2 instanceof Student) {
            s = (Student) a2;
        } else if (a2 instanceof Teacher) {
            t = (Teacher) a2;
        }
        return s.num() - t.num();
    }
}

public class ObjectComparision {
    public static void main(String[] args) {
        Person p[] = { new Student(23), new Teacher(33), new Student(23), new Teacher(53), new Student(23) };
        Arrays.sort(p);
        for (Person x : p)
            System.out.println(x.num());
    }
}