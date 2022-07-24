package business.concretes;

import business.abstracts.BaseCustomerManager;
import business.abstracts.CustomerService;
import entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer Customer) {
	System.out.println("Müşteri Nero Sistemine Eklendi");
		
	}

	

}
