package adapter;

import entities.Gamer;

public class MernisServiceAdapter implements MernisService{

	@Override
	public boolean isUserValid(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" "
                +gamer.getLastName()+" "+gamer.getIdentityNumber()+" "
                +gamer.getYearOfBirth().getYear()+" mernis'ten doğrulama yapıldı");

        return true;
    }

}
