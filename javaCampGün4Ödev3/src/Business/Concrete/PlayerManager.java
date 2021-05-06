package Business.Concrete;

import Business.Abstract.LoggerService;
import Business.Abstract.UserService;
import Entities.Concrete.User;
import Tools.Runner;

public class PlayerManager implements UserService{
	
	private LoggerService[] loggerService;
	
	public PlayerManager(LoggerService[] loggerService) {
		this.loggerService = loggerService;
	}

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı eklendi : " + user.getFirstName() + " " + user.getLastName());
		Runner.runLoggers(loggerService, "Loglandı");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi : " + user.getFirstName() + " " + user.getLastName());
		Runner.runLoggers(loggerService, "Loglandı");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kulanıcı silindi : " + user.getFirstName() + " " + user.getLastName());
		Runner.runLoggers(loggerService, "Loglandı");
		
	}

}
