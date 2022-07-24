package dataAccess.abstracts;

import java.util.List;

public interface DataRepository<T> {
	List<T> getAll();

	T getById(int id);

	void add(T t);

	void delete(T t);

	void update(T t);
}
