package oop2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	Logger logger=new CloudLogger();
	Logger logger2=new DatabaseLogger();
	Logger logger3=new ElasticLogger();
	
	ArrayList<Logger> logList=new ArrayList<>();
	logList.add(logger);
	logList.add(logger2);
	logList.add(logger3);

	Employee employee1=new Employee();
	employee1.setFirstName("Ali");
	
	EmployeeManager employeeManager=new EmployeeManager(logList);
	employeeManager.add(employee1);
	
	
	
	}

}
