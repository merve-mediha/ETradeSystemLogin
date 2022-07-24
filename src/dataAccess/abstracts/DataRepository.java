package dataAccess.abstracts;

import java.util.List;
import java.util.Optional;

public interface DataRepository<T> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	Optional<T> getById(int id);
	List<T> getAll();
}
