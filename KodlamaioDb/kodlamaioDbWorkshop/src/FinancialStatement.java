import java.time.LocalDate;

public class FinancialStatement {
    private int id;
    private Customer customer;
    private LocalDate dateOfFinancialStatement;
    private double amountOfFinancialStatement;

    public FinancialStatement() {
    }

    public FinancialStatement(int id, Customer customer, LocalDate dateOfFinancialStatement, double amountOfFinancialStatement) {
        this.id = id;
        this.customer = customer;
        this.dateOfFinancialStatement = dateOfFinancialStatement;
        this.amountOfFinancialStatement = amountOfFinancialStatement;
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

    public LocalDate getDateOfFinancialStatement() {
        return dateOfFinancialStatement;
    }

    public void setDateOfFinancialStatement(LocalDate dateOfFinancialStatement) {
        this.dateOfFinancialStatement = dateOfFinancialStatement;
    }

    public double getAmountOfFinancialStatement() {
        return amountOfFinancialStatement;
    }

    public void setAmountOfFinancialStatement(double amountOfFinancialStatement) {
        this.amountOfFinancialStatement = amountOfFinancialStatement;
    }
}
