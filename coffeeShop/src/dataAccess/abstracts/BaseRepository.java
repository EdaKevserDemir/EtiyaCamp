package dataAccess.abstracts;

import entities.concretes.Customer;

public interface BaseRepository {
	void add(Customer customer);
}
