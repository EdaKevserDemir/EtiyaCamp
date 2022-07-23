package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import dataAccess.abstracts.DataRepository;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	DataRepository dataRepository;
	
	
	public CampaignManager(DataRepository dataRepository) {
		
		this.dataRepository = dataRepository;
	}

	@Override
	public void add(Campaign campaign) {
		dataRepository.add(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		dataRepository.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		dataRepository.delete(campaign);
		
	}

	@Override
	public List<Campaign> getAll() {
		
		return dataRepository.getAll();
	}

}
