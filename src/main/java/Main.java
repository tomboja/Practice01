import config.SpringConfig;
import factory.GameFactory;
import factory.VehicleFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.Bike;
import services.Car;
import services.Game;
import services.Vehicle;

/**
 * @ProjectName: Practice01
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting...");

//        Vehicle car = VehicleFactory.getCarVehicle();
//        Vehicle bike = VehicleFactory.getBikeVehicle();
//
//        Game carGame = GameFactory.getGame(car);
//        Game bikeGame = GameFactory.getGame(bike);
//
//        carGame.play();
//        bikeGame.play();


//        ApplicationContext springContext
//                = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class);


        Game game = springContext.getBean(Game.class);
        game.play();


        System.out.println("Ending...");
    }
}
