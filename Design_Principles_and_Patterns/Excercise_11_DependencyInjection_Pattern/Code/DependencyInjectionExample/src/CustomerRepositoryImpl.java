public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulating a database lookup
        return new Customer(id, "Alice Johnson", "alice@example.com");
    }
}

