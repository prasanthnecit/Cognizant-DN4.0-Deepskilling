public class Main {
    public static void main(String[] var0) {
        RepositoryImplementation var1 = new RepositoryImplementation();
        CustomerService var2 = new CustomerService(var1);
        var2.addCustomer(new Customer("2215005", "Prasanth"));
        var2.addCustomer(new Customer("2215001", "Customer1"));
        var2.addCustomer(new Customer("2215002", "Customer2"));
        Customer var3 = var2.getCustomerById("2215005");
        System.out.println(var3);
        Customer var4 = var2.getCustomerById("2215001");
        System.out.println(var4);
        Customer var5 = var2.getCustomerById("2215002");
        System.out.println(var5);
        Customer var6 = var2.getCustomerById("2215100");
        System.out.println(var6);
    }
}