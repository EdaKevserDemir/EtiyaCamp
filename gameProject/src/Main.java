import java.time.LocalDate;

import adapter.MernisService;
import adapter.MernisServiceAdapter;
import business.concretes.GameManager;
import business.concretes.GamerManager;
import business.concretes.SaleManager;
import dataAccess.concretes.GameRepository;
import dataAccess.concretes.GamerRepository;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		 GameManager gameManager=new GameManager(new GameRepository());
	       // MernisService mernisService=new MernisServiceAdapter();
	        Gamer gamer=new Gamer(1,"ali","haydar",
	                "11111111111", LocalDate.parse("1993-01-01"));
	        Game game=new Game(1,1000,"Fifa");
	        Campaign campaign=new Campaign(1,"black friday",0.40);
	        GamerManager gamerManager=new GamerManager(new GamerRepository(),new MernisServiceAdapter());
	        SaleManager salesManager=new SaleManager();
	        salesManager.sale(game,campaign,gamer);
	        gamerManager.add(gamer);
	        gameManager.add(game);
	       for(Game game2:gameManager.getAll())
	       {
	           System.out.println(game2.getName()+" "+game2.getPrice());
	       }
	   
	}

}
