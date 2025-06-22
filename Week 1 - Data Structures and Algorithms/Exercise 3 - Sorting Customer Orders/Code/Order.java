public class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String var1, String var2, double var3) {
        this.orderId = var1;
        this.customerName = var2;
        this.totalPrice = var3;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String toString() {
        return "Order [orderId=" + this.orderId + ", customerName=" + this.customerName + ", totalPrice=" + this.totalPrice + "]";
    }
}
