package business.concretes;

import java.util.List;

import adapter.MernisService;
import business.abstracts.GamerService;
import dataAccess.abstracts.DataRepository;
import entities.Gamer;

public class GamerManager implements GamerService {
	DataRepository dataRepository;
	MernisService mernisService;

	public GamerManager(DataRepository dataRepository, MernisService mernisService) {

		this.dataRepository = dataRepository;
		this.mernisService = mernisService;
	}

	@Override
	public void add(Gamer gamer) {
		if (mernisService.isUserValid(gamer))
			dataRepository.add(gamer);

	}

	@Override
	public void update(Gamer gamer) {
		dataRepository.update(gamer);

	}

	@Override
	public void delete(Gamer gamer) {
		dataRepository.delete(gamer);

	}

	@Override
	public List<Gamer> getAll() {

		return dataRepository.getAll();
	}

}
