public class Address {
    private int id;
    private Customer customer;
    private String country;
    private String city;
    private String district;
    private String addressDetail;

    public Address() {
    }

    public Address(int id, Customer customer, String country, String city, String district, String addressDetail) {
        this.id = id;
        this.customer = customer;
        this.country = country;
        this.city = city;
        this.district = district;
        this.addressDetail = addressDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
