import business.concretes.UserManager;
import business.uý.Login;
import core.utilities.adapter.GoogleAdapter;
import core.utilities.patterns.RegexMatches;
import dataAccess.concretes.UserRepository;
import entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new RegexMatches(), new UserRepository(), new GoogleAdapter());
		User user1 = new User(1,"Merve","Demiraslan","merve@gmail.com","112233");
		userManager.add(user1);
		
	    Login login = new Login(userManager);
	    login.loginWithGoogle(user1.getEmail());
	      
	}

}
