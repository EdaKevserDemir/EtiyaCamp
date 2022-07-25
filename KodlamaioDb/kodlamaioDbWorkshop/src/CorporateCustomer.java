public class CorporateCustomer extends Customer {
    private String title;
    private String taxNumber;
    private String identityNumber;

    public CorporateCustomer() {
    }

    public CorporateCustomer(int id, String customerNumber, Canal canal,String title, String taxNumber, String identityNumber) {
        super(id,customerNumber,canal);
        this.title = title;
        this.taxNumber = taxNumber;
        this.identityNumber = identityNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
