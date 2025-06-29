public class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String var1, String var2, String var3) {
        this.productId = var1;
        this.productName = var2;
        this.category = var3;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getCategory() {
        return this.category;
    }

    public String toString() {
        return "Product [productId=" + this.productId + ", productName=" + this.productName + ", category=" + this.category + "]";
    }
}
