package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.Bike;
import services.Car;
import services.Game;
import services.Vehicle;

/**
 * @ProjectName: Practice01
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

@Configuration
public class SpringConfig {

    @Bean
    public Vehicle vehicleCar() {
        return new Car();
    }

    @Bean
    public Vehicle vehicleBike() {
        return new Bike();
    }

    @Bean
    public Game game(Vehicle vehicleBike) {
        return new Game(vehicleBike);
    }
}
