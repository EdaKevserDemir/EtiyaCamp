package business.abstracts;

import java.util.List;

import entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);

	List<Campaign> getAll();
}
