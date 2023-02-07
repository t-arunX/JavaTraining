package java_basics.day11;

import java.util.HashSet;
import java.util.TreeSet;

public class TestCircleClassHashSet {
    public static void main(String[] args) {
        Circle cObjs[] = {
                new Circle(2, 23, 40),
                new Circle(34, 23, 57),
                new Circle(2, 23, 40),
                new Circle(45, 45, 60),
                new Circle(2, 23, 40),
                new Circle(34, 23, 57),
                new Circle(2, 23, 40),
                new Circle(45, 45, 60)
        };
        TreeSet<Circle> ts = new TreeSet<>();
        HashSet<Circle> hs = new HashSet<>();

        for (Circle o : cObjs) {
            hs.add(o);
            ts.add(o);
        }
        for (Circle data : ts)
            System.out.println(data.toString());
        System.out.println();

        for (Circle data : hs)
            System.out.println(data.toString());
    }
}
