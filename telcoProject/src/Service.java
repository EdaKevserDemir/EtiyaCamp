import java.util.List;

public class Service {
    private int id;
    private String name;
    private Customer customer;
    private List<Subscription> subscriptions;

    public Service() {
        super();
    }

    public Service(int id, String name, Customer customer, List<Subscription> subscriptions) {
        super();
        this.id = id;
        this.name = name;
        this.customer = customer;
        this.subscriptions = subscriptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
