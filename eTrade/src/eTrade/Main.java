package eTrade;

import business.concretes.UserManager;
import business.ui.Login;
import core.utilities.adapter.GoogleAdapter;
import core.utilities.patterns.RegexMatches;
import dataAccess.concretes.UserRepository;
import entities.conctretes.User;

public class Main {

	public static void main(String[] args) {
		 User user1 = new User(1, "Ali", "Haydar", "haydar@gmail.com", "1255555");
	        User user2 = new User(2, "veli", "cabbar", "cabbar@gmail.com", "1255555");
	        UserManager userManager = new UserManager(new RegexMatches(), new UserRepository(),new GoogleAdapter());

	        userManager.add(user1);
	        Login login = new Login(userManager);
	        login.loginWithGoogle(user1.getEmail());
	        userManager.add(user2);

	}

}
