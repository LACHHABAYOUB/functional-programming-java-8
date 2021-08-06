package finalexam.part2q2.model;

public class Product {
    private long productId;
    private String name;
    private float unitPrice;

    public Product() { }

    public Product(long productId, String name, float unitPrice) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "{" +
                "productId:" + productId +
                ", name:'" + name + '\'' +
                ", unitPrice:" + unitPrice +
                '}';
    }
}
