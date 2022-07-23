package business.concretes;

import java.util.List;

import business.abstracts.GameService;
import dataAccess.abstracts.DataRepository;
import entities.Game;

public class GameManager implements GameService {

	DataRepository<Game> dataRepository;

	public GameManager(DataRepository dataRepository) {

		this.dataRepository = dataRepository;
	}

	@Override
	public void add(Game game) {
		dataRepository.add(game);

	}

	@Override
	public void update(Game game) {
		dataRepository.update(game);

	}

	@Override
	public void delete(Game game) {
		dataRepository.delete(game);

	}

	@Override
	public List<Game> getAll() {
		
		return dataRepository.getAll();
	}

}
