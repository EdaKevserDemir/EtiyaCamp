package business.abstracts;

import java.util.List;

import entities.conctretes.User;

public interface UserService {
	List<User> getAllUsers();
    User getUserById(int id);
    void add(User user);
    void delete(User user);
    void update(User user);
    void loginCheck(String email, String password);
    void loginWithGoogle(String email);
}
