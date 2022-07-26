import java.time.LocalDate;

public class Invoice {
    private int id;
    private Subscription subscriptions;
    private LocalDate dateCreated;
    private LocalDate dueDate;

    public Invoice() {
        super();
    }

    public Invoice(int id, Subscription subscriptions, LocalDate dateCreated, LocalDate dueDate) {
        super();
        this.id = id;
        this.subscriptions = subscriptions;
        this.dateCreated = dateCreated;
        this.dueDate = dueDate;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Subscription getSubscriptions() {
        return subscriptions;
    }
    public void setSubscriptions(Subscription subscriptions) {
        this.subscriptions = subscriptions;
    }
    public LocalDate getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
