package core.utilities.adapter;

import core.utilities.adapter.mailService.Google;

public class GoogleAdapter implements MailService {

	@Override
	public void checkIfMailExists(String gmail) {
		  Google google=new Google();
	        google.checkIfGmailExists(gmail);
		
	}

	

	  
}
