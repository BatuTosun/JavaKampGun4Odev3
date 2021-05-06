package Business.Concrete;

import Business.Abstract.LoggerService;

public class FileLogger implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Dosya loglandý : " + message);
		
	}

}
