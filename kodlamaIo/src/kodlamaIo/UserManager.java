package kodlamaIo;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	List<User> users = new ArrayList<>();

	public void add(User newUser) {
		if(checkIfUserExist(newUser.getId())) {
			System.out.println("User already exist");
		}
		else {
		users.add(newUser);
		System.out.println("User added");
		}

	}

	public void update(User user) {
		System.out.println("User  updated");
	}

	public void delete(User user) {
		System.out.println("User deleted");
	}
	
	public List<User>getAll(){
		return users;
	}

	public boolean checkIfUserExist(int id) {
		boolean exists = false;
		for (User user : users) {
			if (user.getId() == id) {
				exists = true;
			}
		}
		return exists;
	}

}
