package java_basics.day5;

public class Product {
    protected int id;
    protected String name;
    protected int price;
    public static double net_tax = 0.12;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, int price) {
        this(id, name);
        this.price = price;
    }

    final public void setPrice(int price) {
        this.price = price;
    }

    public void print() {
        System.out.println("product id: " + id);
        System.out.println("product name: " + name);
        System.out.println("product price: " + price);
    }

    public double getNetPrice() {
        return price + (price * net_tax);
    }
}

class ImportedProduct extends Product {
    private int imported_duty;

    public ImportedProduct(int id, String name) {
        super(id, name);
    }

    public ImportedProduct(int id, String name, int price, int imported_duty) {
        super(id, name, price);
        this.imported_duty = imported_duty;
    }

    public void setImportDuty(int imported_duty) {
        this.imported_duty = imported_duty;
    }

    @Override
    public double getNetPrice() {
        return (price + imported_duty) + net_tax * (price + imported_duty);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("imported_duty: " + imported_duty);
    }
}

class DiscountedProduct extends Product {
    private int discount_rate;

    public DiscountedProduct(int id, String name) {
        super(id, name);
    }

    public DiscountedProduct(int id, String name, int price, int discount_rate) {
        super(id, name, price);
        this.discount_rate = discount_rate;
    }

    public void setDiscount_rate(int discount_rate) {
        this.discount_rate = discount_rate;
    }

    @Override
    public double getNetPrice() {
        return super.getNetPrice() - discount_rate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("discount_rate: " + discount_rate);
    }
}
