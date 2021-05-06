package Business.Concrete;

import Business.Abstract.LoggerService;

public class MailLogger implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Mail Loglandý : " + message);
	}

}
