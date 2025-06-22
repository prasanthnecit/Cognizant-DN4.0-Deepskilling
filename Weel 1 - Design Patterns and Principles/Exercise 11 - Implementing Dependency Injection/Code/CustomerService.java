public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository var1) {
        this.customerRepository = var1;
    }

    public Customer getCustomerById(String var1) {
        return this.customerRepository.findCustomerById(var1);
    }

    public void addCustomer(Customer var1) {
        this.customerRepository.addCustomer(var1);
    }
}
