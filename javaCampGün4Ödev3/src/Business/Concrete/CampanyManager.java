package Business.Concrete;

import Business.Abstract.CampanyService;
import Business.Abstract.LoggerService;
import Entities.Concrete.Campany;
import Tools.Runner;

public class CampanyManager implements CampanyService{
	
	private LoggerService[] loggerService;
	
	public CampanyManager(LoggerService[] loggerService) {
		this.loggerService = loggerService;
	}

	@Override
	public void add(Campany campany) {
		System.out.println("Kampanya eklendi : "+campany.getCampanyName()+" "+"Kampanya Süresi : "+campany.getTime());
		Runner.runLoggers(loggerService, "Loglandý");
	}

	@Override
	public void update(Campany campany) {
		System.out.println("Kampanya Güncellendi : "+campany.getCampanyName()+" "+"Güncel kampanya süresi :"+campany.getTime());
		Runner.runLoggers(loggerService, "Loglandý");
	}

	@Override
	public void delete(Campany campany) {
		System.out.println("Kampanya Silindi : "+campany.getCampanyName());
		Runner.runLoggers(loggerService, "Loglandý");
		
	}
		
	
}
