public class CustomerService {
    private final CustomerRepository repository;

    // Constructor injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void printCustomerDetails(String customerId) {
        Customer customer = repository.findCustomerById(customerId);
        System.out.println("=== Customer Info ===");
        System.out.println("ID    : " + customer.getId());
        System.out.println("Name  : " + customer.getName());
        System.out.println("Email : " + customer.getEmail());
    }
}
