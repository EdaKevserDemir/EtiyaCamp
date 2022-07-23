package business.concretes;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager {
	public void sale(Game game, Campaign campaign, Gamer gamer) {
		game.setDiscountedPrice((1 - campaign.getDiscount()) * game.getPrice());
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " has bought " + game.getName());
		System.out.println(game.getPrice());
		System.out.println(game.getDiscountedPrice());
	}
}
