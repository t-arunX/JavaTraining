package java_basics.day11;

public class Circle implements Comparable<Circle> {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return this.x;
    }

    @Override
    public String toString(){
        return ""+this.x +" "+ this.y+" "+this.radius;
    }

    @Override
    public int compareTo(Circle o) {
        return this.getX()-o.getX();
    }
}
