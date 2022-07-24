package business.abstracts;

import entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public abstract void save(Customer Customer);
}
