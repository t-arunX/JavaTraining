package java_basics.day4;

public class TestProduct {
    public static void main(String args[]) {
        Product obj = new Product(123, "watch", 2400);
        obj.purchase(150);
        obj.getPrdDetails();
        obj.netPrice();
        obj.sell(25);
        System.out.println(obj.getQuantity());
    }
}