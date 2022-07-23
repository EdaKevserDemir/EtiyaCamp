package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.DataRepository;
import entities.Campaign;

public class CampaignRepository implements DataRepository<Campaign> {

	List<Campaign>campaigns=new ArrayList<>();
	@Override
	public void add(Campaign entity) {
		System.out.println("Campaign added");
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("Campaign updated");
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("Campaign deleted");
		
	}

	@Override
	public List<Campaign> getAll() {
		
		return campaigns;
	}

}
