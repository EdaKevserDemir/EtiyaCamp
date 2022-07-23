package entities;

public class Game {
	
	private int id;
	private String name;
	private int level;
	private double price;
	private double discountedPrice;

	public Game() {

	}
	public Game(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;

    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	


	
}
