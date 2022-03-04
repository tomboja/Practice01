package factory;

import services.Game;
import services.Vehicle;

/**
 * @ProjectName: Practice01
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

public class GameFactory {

    public static Game getGame(Vehicle vehicle) {
        return new Game(vehicle);
    }
}
