package business.abstracts;

import java.util.List;

import entities.Gamer;

public interface GamerService {
	public void add(Gamer gamer);

	public void update(Gamer gamer);

	public void delete(Gamer gamer);

	List<Gamer> getAll();

}
