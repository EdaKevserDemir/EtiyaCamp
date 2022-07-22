package day2;


public class Product {
	private int id;
	private	String name;
	private	double price;
	private	String Description;
	private	int stockAmount;
	
	
	public Product() {
		
	}


	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public int getStockAmount() {
		return stockAmount;
	}


	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	

}
