package java_basics.day4;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    public static double tax = 0.12;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, int price, int quantity) {
        this(id, name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void netPrice() {
        System.out.println("net price: " + ((price * quantity) + ((price * quantity) * tax)));

    }

    public void purchase(int quantity) {
        this.quantity += quantity;
    }

    public void sell(int quantity) {
        if (this.quantity > quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Cannot serve requested amount\nPresent available stock: " + this.quantity);
        }
    }

    public void getPrdDetails() {
        System.out.println("product id:" + id);
        System.out.println("Product name:" + name);
        System.out.println("price:" + price);
        System.out.println("quantity:" + quantity);
    }
}