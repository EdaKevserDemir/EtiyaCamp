package core;

import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements MernisService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getYearOfBirth());

		} catch (Exception e) {
			return false;
		}

	}


}
