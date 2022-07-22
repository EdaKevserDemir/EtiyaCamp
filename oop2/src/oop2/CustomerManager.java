package oop2;

public class CustomerManager {
	private Logger logger;
	public CustomerManager(Logger logger) {
		this.logger=logger;
	}
	
	
	public void add(Customer customer) {
		System.out.println("Customer added");

	}

	public void update(Customer customer) {
		System.out.println("Customer updated");

	}
}
//SOLID
//single responsibility
//elastic search