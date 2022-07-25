public class UnionCustomer extends Customer{
    String name;

    public UnionCustomer() {

    }

    public UnionCustomer(int id, String customerNumber, Canal canal, String name) {
        super(id, customerNumber, canal);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
