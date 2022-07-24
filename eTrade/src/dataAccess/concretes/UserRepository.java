package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.DataRepository;
import entities.conctretes.User;

public class UserRepository implements DataRepository<User> {
	 List<User> users=new ArrayList<>();

	    @Override
	    public List<User> getAll() {
	        return users;
	    }

	    @Override
	    public User getById(int id) {
	        return null;
	    }

	    @Override
	    public void add(User user) {
	        users.add(user);
	    }

	    @Override
	    public void delete(User user) {

	    }

	    @Override
	    public void update(User user) {

	    }
}
