package business.concretes;

import business.abstracts.BaseCustomerManager;
import core.MernisService;
import dataAccess.abstracts.BaseRepository;
import entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private MernisService mernisService;
	private BaseRepository baseRepository;

	public StarbucksCustomerManager(BaseRepository baseRepository,MernisService mernisService) {
		
		this.mernisService = mernisService;
		this.baseRepository=baseRepository;
	}
	
	public void save(Customer customer) {
		if(mernisService.checkIfRealPerson(customer)) {
			baseRepository.add(customer);
			System.out.println("Müşteri Starbucks sistemine başarıyla eklendi "+ customer.getFirstName());
		}
		
		else {
			System.out.println("sıkıntı büyük "+customer.getFirstName()+" "+customer.getLastName());
		}
		
	}

}
