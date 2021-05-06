package Business.Concrete;

import Business.Abstract.LoggerService;
import Business.Abstract.UserService;
import Entities.Concrete.User;
import Tools.Runner;

public class UserManager implements UserService{
	
	private LoggerService[] loggerService;
	
	
	public UserManager (LoggerService[] loggerService) {
		this.loggerService = loggerService;
	}
	                                                 
			

	@Override
	public void add(User user) {
		System.out.println("User added : " + user.getFirstName() + " " + user.getLastName());
		Runner.runLoggers (loggerService, "Loglandý");
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted : " + user.getFirstName() + " " + user.getLastName());
		
	}
	

}
