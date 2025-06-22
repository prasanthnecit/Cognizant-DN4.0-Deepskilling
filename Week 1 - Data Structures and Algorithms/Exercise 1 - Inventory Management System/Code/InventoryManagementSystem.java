import java.util.*;

public class InventoryManagementSystem {
    private Map<String, Product> inventory = new HashMap();

    public void addProduct(Product var1) {
        this.inventory.put(var1.getProductId(), var1);
        System.out.println("Product added: " + String.valueOf(var1));
    }

    public void updateProduct(Product var1) {
        if (this.inventory.containsKey(var1.getProductId())) {
            this.inventory.put(var1.getProductId(), var1);
            System.out.println("Product updated: " + String.valueOf(var1));
        } else {
            System.out.println("Product not found: " + var1.getProductId());
        }

    }

    public void deleteProduct(String var1) {
        if (this.inventory.containsKey(var1)) {
            Product var2 = (Product) this.inventory.remove(var1);
            System.out.println("Product removed: " + String.valueOf(var2));
        } else {
            System.out.println("Product not found: " + var1);
        }

    }

    public Product getProduct(String var1) {
        return (Product) this.inventory.get(var1);
    }

    public void displayAllProducts() {
        for (Product var2 : this.inventory.values()) {
            System.out.println(var2);
        }

    }
}