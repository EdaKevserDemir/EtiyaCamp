package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.DataRepository;
import entities.Game;

public class GameRepository implements DataRepository<Game>{

	 List<Game> games=new ArrayList<>();
	@Override
	public void add(Game entity) {
		games.add(entity);
		
	}

	@Override
	public void update(Game entity) {
	System.out.println("game updated");
	}

	@Override
	public void delete(Game entity) {
		games.remove(entity);
		System.out.println("game deleted");
		
	}

	@Override
	public List<Game> getAll() {
		// TODO Auto-generated method stub
		return games;
	}

}
