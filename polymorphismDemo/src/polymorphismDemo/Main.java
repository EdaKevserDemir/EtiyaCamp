package polymorphismDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		DatabaseLogger databaseLogger=new DatabaseLogger();
		EmailLogger emailLogger=new EmailLogger();
		FileLogger fileLogger=new FileLogger();
		
		ArrayList<BaseLogger> loglist=new ArrayList<>();
		loglist.add(fileLogger);
		loglist.add(emailLogger);
		loglist.add(databaseLogger);
	
		CustomerManager customerManager=new CustomerManager(loglist);
		customerManager.add();
		
		
		
		for (BaseLogger baseLogger : loglist) {
			baseLogger.log("loglandı");
		}
	}

}
