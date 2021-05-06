package Business.Concrete;

import Business.Abstract.GameService;
import Business.Abstract.LoggerService;
import Entities.Concrete.Game;
import Tools.Runner;

public class GameManager implements GameService{
	
	private LoggerService[] loggerService;


	public GameManager(LoggerService[] loggerService) {
		this.setLoggerService(loggerService);
		}

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getName()+" "+ "Oyun Fiyat� : " + game.getPayment());
		Runner.runLoggers(loggerService, "Logland�");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncellendi : " + game.getName()+" "+ "G�ncel fiyat : " +game.getPayment());
		Runner.runLoggers(loggerService, "Logland�");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi : " + game.getName());
		Runner.runLoggers(loggerService, "Logland�");
		
	}

	@Override
	public void giveBack(Game game) {
		System.out.println("Oyun iade edildi : " + game.getName()+" "+ "�ade edilen fiyat : "+ game.getPayment());
		Runner.runLoggers(loggerService, "Logland�");
		
	}

	public LoggerService[] getLoggerService() {
		return loggerService;
	}

	public void setLoggerService(LoggerService[] loggerService) {
		this.loggerService = loggerService;
	}

}
