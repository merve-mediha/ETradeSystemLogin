package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dataAccess.abstracts.DataRepository;
import entity.concretes.User;

public class UserRepository implements DataRepository<User> {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void update(User entity) {
		
		
	}

	@Override
	public void delete(User entity) {
		getById(entity.getId()).ifPresent(user->users.remove(entity));
		
	}

	@Override
	public  Optional<User> getById(int id) {
		return users.stream().filter(user->user.getId()==id).findAny();
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}
	

}
