import business.concretes.EmailNotification;
import business.concretes.SmsNotification;
import business.concretes.UserManager;
import entities.User;

public class Main {
    public static void main(String[] args) {
        User user1=new User(1,"Ali","Haydar","haydar@gmail.com","1234");
        UserManager userManager = new UserManager(new SmsNotification());
        userManager.forgotPassword(user1);
    }
}
