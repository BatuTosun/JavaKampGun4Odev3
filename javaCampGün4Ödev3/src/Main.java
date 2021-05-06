import Business.Abstract.LoggerService;
import Business.Concrete.CampanyManager;
import Business.Concrete.DBLogger;
import Business.Concrete.GameManager;
import Business.Concrete.PlayerManager;
import Entities.Concrete.Campany;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		
		LoggerService[] loggerServices = {new DBLogger(),new Business.Concrete.MailLogger(),new Business.Concrete.FileLogger()};
		
		Game game = new Game(1,"CSGO","25TL");
		GameManager gameManager = new GameManager(loggerServices);
		gameManager.add(game);
		
		
		System.out.println("------------------------------------------");
		
		
		User player= new User("Batu","Tosun","12345678910","27.03.2004",1);
		PlayerManager manager = new PlayerManager(loggerServices);
		manager.add(player);
		
		
		System.out.println("------------------------------------------");
		
		
		Campany campany =  new  Campany(1,"Ay Festivali Kampanyası","10.02.2021/17.02.2021","%55");
		CampanyManager campanyManager = new CampanyManager(loggerServices);
		campanyManager.add(campany);
		
		
		

	}

}
