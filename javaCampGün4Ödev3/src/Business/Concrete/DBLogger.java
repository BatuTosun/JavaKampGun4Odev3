package Business.Concrete;

import Business.Abstract.LoggerService;

public class DBLogger implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Database loglandı : "+ message);
		
	}

}
