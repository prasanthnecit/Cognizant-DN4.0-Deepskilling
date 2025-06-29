public class Main {
    public static void main(String[] var0) {
        InventoryManagementSystem var1 = new InventoryManagementSystem();
        var1.addProduct(new Product("P001", "Apple", 100, (double)10.0F));
        var1.addProduct(new Product("P002", "Nuts", 150, (double)20.0F));
        var1.displayAllProducts();
        var1.updateProduct(new Product("P001", "Product 1 Updated", 120, (double)12.0F));
        var1.displayAllProducts();
        var1.deleteProduct("P002");
        var1.displayAllProducts();
    }
}
