import java.util.*;
public class RepositoryImplementation implements CustomerRepository {
    private final Map<String, Customer> customerDatabase = new HashMap();

    public Customer findCustomerById(String var1) {
        return (Customer)this.customerDatabase.get(var1);
    }

    public void addCustomer(Customer var1) {
        this.customerDatabase.put(var1.getId(), var1);
    }
}