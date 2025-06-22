public class Customer {
    private String id;
    private String name;

    public Customer(String var1, String var2) {
        this.id = var1;
        this.name = var2;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String var1) {
        this.id = var1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String toString() {
        return "Customer{id='" + this.id + "', name='" + this.name + "'}";
    }
}
