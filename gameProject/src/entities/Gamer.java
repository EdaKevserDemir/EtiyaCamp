package entities;

import java.time.LocalDate;
import java.util.List;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private LocalDate yearOfBirth;
	private List<Game> ownGame;

	public Gamer() {

	}
	 public Gamer(int id, String firstName, String lastName, String identityNumber, LocalDate yearOfBirth) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.identityNumber = identityNumber;
	        this.yearOfBirth = yearOfBirth;
	    }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public LocalDate getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(LocalDate yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public List<Game> getOwnGame() {
		return ownGame;
	}

	public void setOwnGame(List<Game> ownGame) {
		this.ownGame = ownGame;
	}

}
