package coffeeShop;

import business.abstracts.BaseCustomerManager;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import core.MernisAdapter;
import dataAccess.concretes.CustomerRepository;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
	BaseCustomerManager customerManager=new StarbucksCustomerManager(new CustomerRepository(),new MernisAdapter());
	customerManager.save(new Customer(1,"Eda Kevser","Demir",1993,"22255511666"));

	
	}

}
