package business.abstracts;

import java.util.List;

import entities.Game;

public interface GameService {
	public void add(Game game);

	public void update(Game game);

	public void delete(Game game);

	List<Game> getAll();

}
