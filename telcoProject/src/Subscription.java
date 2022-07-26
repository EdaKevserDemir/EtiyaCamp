import java.time.LocalDate;
import java.util.List;

public class Subscription {
    private int id;
    private Customer customer;
    private LocalDate dateStarted;
    private Service service;
    private List<Invoice> invoices;

    public Subscription() {
        super();
    }

    public Subscription(int id, Customer customer, LocalDate dateStarted, Service service, List<Invoice> invoices) {
        super();
        this.id = id;
        this.customer = customer;
        this.dateStarted = dateStarted;
        this.service = service;
        this.invoices = invoices;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public LocalDate getDateStarted() {
        return dateStarted;
    }
    public void setDateStarted(LocalDate dateStarted) {
        this.dateStarted = dateStarted;
    }
    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    public List<Invoice> getInvoices() {
        return invoices;
    }
    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

}
