public class IndividualCustomer extends Customer{
    private String firstName;
    private String lastName;
    private String identityNumber;

    public IndividualCustomer() {
    }

    public IndividualCustomer(int id, String customerNumber, Canal canal,
                              String firstName, String lastName, String identityNumber) {
        super(id, customerNumber, canal);
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber=identityNumber;

    }
}
