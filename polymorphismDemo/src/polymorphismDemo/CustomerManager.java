package polymorphismDemo;

import java.util.List;

public class CustomerManager {

	private List<BaseLogger> baseLoggers;

	public CustomerManager(List<BaseLogger> baseLoggers) {
		this.baseLoggers = baseLoggers;
	}

	public void add() {
		for (BaseLogger logger : baseLoggers) {
			logger.log("customer added");
		}
	}

}
