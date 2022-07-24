package googleService;

public class Google {
	public void checkIfEmailExists(String email) {
		if(email.contains("gmail")) {
			System.out.println("logged in with gmail");
		}
		else {
			
			System.out.println("cannot login with this email");
		}
	}

}
