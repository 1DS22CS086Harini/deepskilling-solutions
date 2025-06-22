public class Main {
    public static void main(String[] args) {
        // Manually performing Dependency Injection
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Using the service
        service.printCustomerDetails("101");
    }
}