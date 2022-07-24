package core.utilities.adapter;

import business.abstracts.MailCheckService;
import googleService.Google;

public class GoogleAdapter implements MailCheckService{


	@Override
	public void checkIfMailExists(String gmail) {
		Google google = new Google();
		google.checkIfEmailExists(gmail);
	}

}
