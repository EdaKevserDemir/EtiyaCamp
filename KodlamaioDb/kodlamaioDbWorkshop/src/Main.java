public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal(1,"Internet");

        Customer customer1 = new IndividualCustomer(1,"1234",canal,"Rabia","Çakır","1234567890");
        Address address=new Address(1,customer1,"türkiye","ankara","keçiören","türkiye, ankara, keçiören");
        System.out.println(customer1.getId());
        System.out.println(customer1.getCustomerNumber());
        System.out.println(address.getCustomer().getCanal().getName());
    }
}
