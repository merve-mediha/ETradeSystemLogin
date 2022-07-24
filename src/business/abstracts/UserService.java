package business.abstracts;

import java.util.List;

import entity.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	void loginCheck(String email, String password);
    void loginWithGoogle(String email);
    List<User> getAllUsers();
	User getUserById(int id);
	
	
}
