package java_basics.day5;

public class TestProduct {

    public static void main(String[] args) {
        // int id,String name,int price,int discount_rate
        DiscountedProduct dp = new DiscountedProduct(22, "soap", 40, 10);
        dp.setPrice(20);
        System.out.printf("Discount product: %.2f\n", dp.getNetPrice());

        // int id,String name,int price,int discount_rate
        ImportedProduct ip = new ImportedProduct(22, "soap", 40, 10);
        ip.setPrice(20);
        System.out.printf("Imported product: %.2f\n", ip.getNetPrice());
    }

}