package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.BaseRepository;
import entities.concretes.Customer;

public class CustomerRepository implements BaseRepository {
	List<Customer> customers;

	public CustomerRepository() {
		customers = new ArrayList<Customer>();
	}

	@Override
	public void add(Customer customer) {

		if (!checkIfCustomerIdentity(customer.getNationalIdentity())) {
			customers.add(customer);
		} else {
			System.out.println("Kayýtlý müþteri.");
		}
	}

	private boolean checkIfCustomerIdentity(String customerIdentity) {
		boolean exist = false;
		for (Customer customer : customers) {

			if (customer.getNationalIdentity() == customerIdentity) {
				exist = true;
			}
		}
		return exist;

	}

}
